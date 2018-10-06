package com.jooq.jooqDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jooq.jooqDemo.Service.DataService;

@RestController
public class DataController {

	@Autowired
	DataService dataService;
	

	@GetMapping("/test")
	public void testDBConnection() {
		dataService.testConnection();
	}

}
