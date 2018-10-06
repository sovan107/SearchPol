package com.jooq.jooqDemo.Service;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Service;

import com.jooq.jooqDemo.Config.DataSourceConfig;

@Service
public class DataService {
	
	 DataSource dsc = DataSourceConfig.createDatasource();
	
	public void testConnection() {
		
		DSLContext ds = DSL.using(dsc, SQLDialect.MYSQL);
		
//		if(null != test) {
//			ds.sele
//		}
		
		
		
	}
	
}
