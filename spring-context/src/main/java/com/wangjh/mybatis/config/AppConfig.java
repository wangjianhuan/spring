package com.wangjh.mybatis.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wjh
 * @date 2022/12/1 23:30
 * @email 1151777592@qq.com
 */
@ComponentScan("com.wangjh.mybatis")
//@WJHMapperScan("com.wangjh.mybatis.mapper")
@MapperScan("com.wangjh.mybatis.mapper")
public class AppConfig {

	//@Bean
	public SqlSessionFactory sqlSessionFactory1() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() {
		//数据库连接池信息
		PooledDataSource dataSource = new PooledDataSource();
		dataSource.setDriver("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("Qaz123...");
		dataSource.setUrl("jdbc:mysql://1.12.253.204:3306/test_bai");
		dataSource.setDefaultAutoCommit(true);
		//采用MyBatis的JDBC事务方式
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		//创建 Configuration对象
		Configuration configuration = new Configuration(environment);
		//注册一个MyBatis上下文别名
		//configuration.getTypeAliasRegistry().registerAlias("user", User.class);
		//加入一个映射器
		//configuration.addMapper(UserMapper.class);   // 重复注册
		//使用 SqlSessionFactoryBuilder 构建SqlSessionFactory
		SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		return SqlSessionFactory;
	}

}
