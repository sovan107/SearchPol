package com.jooq.jooqDemo.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jooq.jooqDemo.properties.DatasourceProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {

	@Autowired DatasourceProperties ds;
	
	@Bean
	public static DataSource createDatasource() {
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:mysql://localhost:3306/jooqtest");
		config.setUsername("root");
		config.setPassword("password");
		
		return new HikariDataSource(config);
		
	}
}
