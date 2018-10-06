package com.jooq.jooqDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jooq.jooqDemo.properties.DatasourceProperties;

@SpringBootApplication
@EnableConfigurationProperties(DatasourceProperties.class)
public class JooqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqDemoApplication.class, args);
	}
}
