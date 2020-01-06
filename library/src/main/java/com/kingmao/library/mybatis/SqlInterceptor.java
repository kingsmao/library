package com.kingmao.library.mybatis;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 动态拦截sql，对sql进行修改，适用于saas
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {
                MappedStatement.class, Object.class }),
        @Signature(type = Executor.class, method = "query", args = {
                MappedStatement.class, Object.class, RowBounds.class,
                ResultHandler.class }) })
public class SqlInterceptor implements Interceptor {
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String WHERE = "WHERE";

    private static final String ORDER_BY = "order by";

    private static final String LIMIT = "limit";

    private static final String SPACE= " ";

    private static final String INSERT = "insert";

    private static final String AND = "AND";

    private static final String COMPANY_ID = "company_id";

    private static final Pattern PATTERN_ORDER_BY = Pattern.compile("order\\s+by", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN_LIMIT = Pattern.compile("\\slimit\\s", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN_WHERE = Pattern.compile("\\swhere\\s", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN_INSERT = Pattern.compile("^insert", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN_COMPANY_ID = Pattern.compile("company_id\\s*,?", Pattern.CASE_INSENSITIVE);

    private static final Pattern PATTERN_INSERT_COMPANY_ID = Pattern.compile("\\(");

    private static final Pattern PATTERN_INSERT_COMPANY_ID_VALUE = Pattern.compile("values\\s+\\(\\s*\\?", Pattern.CASE_INSENSITIVE);

    private String environment;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        try {
            String sql = this.getSql(invocation);
            if(StringUtils.isBlank(sql)){
                return invocation.proceed();
            }

            // 处理sql
            String sql2Reset = this.processSql(sql, invocation);

            // 包装sql后，重置到invocation中
            this.resetSql2Invocation(invocation, sql2Reset);

        } catch (Exception e) {
            logger.error("interceptor sql exception={}", e.getCause().toString());
        }
        return invocation.proceed();
    }

    /**
     * 对sql增加商户id的过滤
     * @param sql
     * @return
     */
    private String processSql(String sql, Invocation invocation) throws Throwable{
        MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
        if(this.isWhiteList(sql) || !isCustomizedMethod(ms.getId())){
            return sql;
        }

        if (PATTERN_INSERT.matcher(sql).find()){
            sql = this.processInsert(sql, invocation);
        }else {
            sql = this.processSelect(sql);
        }
   //     logger.info("mapper id = {}, process sql = {} ", ms.getId(), sql);
        return sql;
    }

    /**
     * insert语句增加商户id
     * @param sql
     * @return
     */
    private String processInsert(String sql, Invocation invocation) throws Throwable{
        if(!PATTERN_COMPANY_ID.matcher(sql).find()){
            sql = PATTERN_INSERT_COMPANY_ID.matcher(sql).replaceFirst(" ( "+COMPANY_ID+",");
            sql = PATTERN_INSERT_COMPANY_ID_VALUE.matcher(sql).replaceFirst(" values ( " + /*CompanyUtils.getCompanyId()*/ "company" + ", ?");
        }else{
            final Object[] args = invocation.getArgs();
            Class cl= args[1].getClass();
            Method getCompany = cl.getMethod("getCompanyId");
            Method setCompany = cl.getMethod("setCompanyId", Integer.class);
            if(getCompany != null && setCompany != null){
                if(getCompany.invoke(args[1]) == null){
                    setCompany.invoke(args[1], /*CompanyUtils.getCompanyId()*/ 1);
                }
            }

        }
        return sql;
    }

    /**
     * 形如这个情况： [select|delete|update] * from table_name [where] [order by] [limit]
     * @param sql
     * @return
     */
    private String processSelect(String sql){
        String appendSql = SPACE + "company_id = " + /*CompanyUtils.getCompanyId()*/ 1 + SPACE;
        if(!sql.contains(WHERE) && !sql.contains(WHERE.toLowerCase())){
            if (!sql.contains(LIMIT) && !sql.contains(LIMIT.toLowerCase())
                    && !sql.contains(ORDER_BY) && !sql.contains(ORDER_BY.toLowerCase())){
                //select * from account
                sql = sql + SPACE + WHERE + appendSql;
            } else if(sql.contains(ORDER_BY) || sql.contains(ORDER_BY.toLowerCase())){
                //select * from account order by xxx [limit]
                sql = PATTERN_ORDER_BY.matcher(sql).replaceFirst(SPACE+WHERE+appendSql+ORDER_BY);
            } else if(sql.contains(LIMIT) || sql.contains(LIMIT.toLowerCase())){
                //select * from account limit 1,100
                sql = PATTERN_LIMIT.matcher(sql).replaceFirst(SPACE+WHERE+appendSql+LIMIT+SPACE);
            }
        }else {
            sql = PATTERN_WHERE.matcher(sql).replaceFirst(SPACE+WHERE+appendSql+AND+SPACE+"(");
            Matcher limitMtc = PATTERN_LIMIT.matcher(sql);
            boolean limitFind = limitMtc.find();
            if (!limitFind && !sql.contains(ORDER_BY) && !sql.contains(ORDER_BY.toLowerCase())){
                //select * from account where type=100123 or id=2
                sql = sql + ")";
            } else if(sql.contains(ORDER_BY) || sql.contains(ORDER_BY.toLowerCase())){
                //select * from account where type=100123 or id=2 order by xxx [limit]
                sql = PATTERN_ORDER_BY.matcher(sql).replaceFirst(")"+SPACE+ORDER_BY);
            } else if(limitFind){
                //select * from account where type=100123 or id=2 limit 1,100
                sql = limitMtc.replaceFirst(")"+SPACE+LIMIT+SPACE);
            }
        }
        return sql;
    }

    /**
     * 目前只有这些方法才会增加
     * @param mapperId
     * @return
     */
    private Boolean isCustomizedMethod(String mapperId){
        ArrayList<String> customizedMethods = new ArrayList();

        List<String> list = Arrays.asList(
                "countByExample",
                "deleteByExample",
                "deleteByPrimaryKey",
                "insert",
                "insertSelective",
                "selectByExample",
                "selectByExampleWithBLOBs",
                "selectByExampleForceIndex",
                "updateByExample",
                "updateByPrimaryKeySelective",
                "updateByPrimaryKey",
                "updateByPrimaryKeyWithBLOBs",
                "updateByExampleSelective",
                "updateByExampleWithBLOBs"
        );
        customizedMethods.addAll(list);
        if(StringUtils.isNotBlank(environment)){
            customizedMethods.add("selectByPrimaryKey");
        }
        for(String method : customizedMethods){
            String pattern = ".*"+method+"$";
            if(Pattern.matches(pattern, mapperId)){
                return true;
            }
        }
        return false;
    }

    /**
     * sql包含白名单中则不需要增加商户ID过滤
     * @param sql
     * @return
     */
    private Boolean isWhiteList(String sql){
        List<String> backList = Arrays.asList(
                "from\\s+stats_symbol_rate",
                "insert\\s+into\\s+stats_symbol_rate",
                "from\\s+config_coin_symbol\\s",
                "insert\\s+into\\s+config_coin_symbol\\s",
                "from\\s+borrow_rule\\s*",
                "insert\\s+into\\s+borrow_rule\\s",
                "from\\s+config_symbol\\s",
                "insert\\s+into\\s+config_symbol\\s",
                "from\\s+config_account_type",
                "insert\\s+into\\s+config_account_type",
                "from\\s+transaction\\b",// \b为匹配字符边界,即 ‘transaction’或'transaction ',但不匹配'transaction_'
                "insert\\s+into\\s+transaction\\b",
                "from\\s+company_ext",
                "insert\\s+into\\s+company_ext",
                "from\\s+risk_interface_config",
                "insert\\s+into\\s+risk_interface_config",
                "from\\s+company",
                "insert\\s+into\\s+company",
                "where\\s[\\s\\S]*company_id",
                "from\\s+ex_trade_",
                "insert\\s+into\\s+ex_trade_",
                "from\\s+admin_action",
                "insert\\s+into\\s+admin_action",
                "update\\s+admin_action",
                "from\\s+sms_price_config",
                "insert\\s+into\\s+sms_price_config",
                "update\\s+sms_price_config",
                "update\\s+config_coin_symbol",
                "update\\s+borrow_rule",
                "from\\s+station_message_send_task",
                "insert\\s+into\\s+station_message_send_task",
                "from\\s+otc_coin_market_cap",
                "from\\s+exchange_otc.otc_coin_market_cap",
                "insert\\s+into\\s+otc_coin_market_cap",
                "insert\\s+into\\s+exchange_otc.otc_coin_market_cap",
                "from\\s+otc_chat",
                "from\\s+exchange_otc.otc_chat",
                "insert\\s+into\\s+otc_chat",
                "insert\\s+into\\s+exchange_otc.otc_chat",
                "update\\s+crypto_address_bch",
                "from\\s+crypto_address_bch",
                "update\\s+crypto_address_btc",
                "from\\s+crypto_address_btc",
                "update\\s+crypto_address_etc",
                "from\\s+crypto_address_etc",
                "update\\s+crypto_address_eth",
                "from\\s+crypto_address_eth",
                "update\\s+crypto_address_ltc",
                "from\\s+crypto_address_ltc",
                "update\\s+crypto_address_usdt",
                "insert\\s+into\\s+company_dns_resolve",
                "update\\s+company_dns_resolve",
                "update\\s+company",
                "insert\\s+into\\s+company",
                "from\\s+company_dns_resolve",
                "company_dns_resolve",
                "chain_cloud_user",
                "chain_cloud_user_serve",
                "chain_cloud_user_ext",
                "chain_cloud_user_withdraw",
                "chain_cloud_user_operate_log",
                "chainup_cloud_certificate",
                "from\\s+crypto_address_usdt",
                "from\\s+stats_all_trade_day",
                "from\\s+transaction_record\\b",// \b为匹配字符边界,即 ‘transaction_record’或'transaction_record ',但不匹配'transaction_record'
                "insert\\s+into\\s+transaction_record\\b",
		        "from\\s+exchange_kline.ex_scale_1min",
                "from\\s+exchange_kline.ex_scale_kline",
                "insert\\s+into\\s+system_schedule_job_log",
                "from\\s+system_schedule_job",
                "update\\s+system_schedule_job",
                "insert\\s+into\\s+system_schedule_job",
                "from\\s+app_packing_task",
                "update\\s+app_packing_task",
                "insert\\s+into\\s+app_packing_task",
                "otc_order\\b",
                "config_sms_info",
                "transaction_fingerprint_fail_record",
                "config_sms_info",
                "portal_app_pri_group",
                "portal_merchant_account",
                "red_packet_return",
                "transaction_scene",
                "finance_formula"
        );
        for(String backReg : backList){
            Pattern pattern = Pattern.compile(backReg, Pattern.CASE_INSENSITIVE);
            if(pattern.matcher(sql).find()){
                return true;
            }
        }
        return false;
    }

    /**
     * 获取原始的sql
     * @param invocation
     * @return
     */
    private String getSql(Invocation invocation) {
        final Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter;
        if (invocation.getArgs().length > 1) {
            parameter = invocation.getArgs()[1];
        }else {
            return null;
        }
        BoundSql boundSql = ms.getBoundSql(parameter);
        return boundSql.getSql();
    }

    private void resetSql2Invocation(Invocation invocation, String sql) throws SQLException {
        final Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];
        BoundSql boundSql = statement.getBoundSql(parameterObject);
        MappedStatement newStatement = newMappedStatement(statement, new BoundSqlSqlSource(boundSql));
        MetaObject msObject = MetaObject.forObject(newStatement, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());

        msObject.setValue("sqlSource.boundSql.sql", sql);
        args[0] = newStatement;
    }

    private MappedStatement newMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        MappedStatement.Builder builder =
                new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), newSqlSource, ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
            StringBuilder keyProperties = new StringBuilder();
            for (String keyProperty : ms.getKeyProperties()) {
                keyProperties.append(keyProperty).append(",");
            }
            keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
            builder.keyProperty(keyProperties.toString());
        }
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();
    }



    class BoundSqlSqlSource implements SqlSource {


        private BoundSql boundSql;


        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }


        @Override
        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }


    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
    @Override
    public void setProperties(Properties arg0) {
        // doSomething
    }

}
