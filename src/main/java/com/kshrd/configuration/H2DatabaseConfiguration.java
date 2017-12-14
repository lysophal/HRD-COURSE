package com.kshrd.configuration;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("com.kshrd.repositories")
public class H2DatabaseConfiguration {
//	@Autowired
//	DataSource dataSource;
//	
//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactoryBean(){
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource);
//		return sessionFactoryBean;
//	}
//	
//	@Bean
//	public DataSourceTransactionManager dataSourceTransactionManager(){
//		return new DataSourceTransactionManager(dataSource);
//	}

}