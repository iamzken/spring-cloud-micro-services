package com.cloud.database;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

/**
 * jndi方式数据库配置
 * @author kenan.zhang
 * @date   2017-09-27
 *
 */
@Configuration
public class DataSourceConfig {
	
	private String jndiName = "java:comp/env/BILL99/JDBC/TEST_DS";
	
	@Bean
	public DataSource dataSource() {
		JndiDataSourceLookup lookup = new JndiDataSourceLookup();
        return lookup.getDataSource(jndiName);
	}

}
