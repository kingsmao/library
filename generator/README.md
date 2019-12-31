# mybatisGenerator
使用mybatis 生成带分页的查询，

将lib包下的jar包添加到classpath中
修改 PaginationPlugin.java中的baseDir路径
在生成的example中增加构造函数
如下
public class CarInfoExample extends AbstractExample {
   
   //手动增加 ---start
    public CarInfoExample(Pageable pageable) {
		super(pageable);
		oredCriteria = new ArrayList<Criteria>();
	}
	//手动增加 ---end
...
}



修改path.properties中的：
1.生成目录
2.包名
3.连接信息

修改generatorConfig.xml
1.包名
2.目标表名

执行MybatisGenerator




