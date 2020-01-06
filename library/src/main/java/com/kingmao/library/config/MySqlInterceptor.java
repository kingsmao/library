package com.kingmao.library.config;

import com.kingmao.library.LibraryApplication;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Locale;
import java.util.Properties;

/**
 * @author qinxuan
 * @date 2020/1/6
 */
//@Component
@Intercepts({@Signature(type = Executor.class,method = "update",args = {MappedStatement.class,Object.class}),
        @Signature(type = Executor.class,method = "query",args = {MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class})})
public class MySqlInterceptor implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(MySqlInterceptor.class);
    /**正则匹配 insert、delete、update操作*/
    private static final String REGEX = ".*insert\\\\u0020.*|.*delete\\\\u0020.*|.*update\\\\u0020.*";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        logger.info("mybatis拦截器======");
        //获取执行参数
        Object[] objects = invocation.getArgs();
        MappedStatement ms = (MappedStatement) objects[0];
        BoundSql boundSql = ms.getSqlSource().getBoundSql(objects[1]);
        String sql = boundSql.getSql().toLowerCase(Locale.CHINA).replace("[\\t\\n\\r]", " ");
        System.out.println("打印SQL语句"+sql);
        //如果是insert、delete、update操作 使用主库
        if (sql.matches(REGEX)) {
            System.out.println("拦截执行数据库的请求：写请求");
        } else {
            //使用从库
            System.out.println("拦截执行数据库的请求：读请求");
        }
        //继续执行逻辑
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
