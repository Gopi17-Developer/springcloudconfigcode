package com.springcloudconfig.demo.services;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServcie {
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.username}")
	private String password;
	
	@Value("${db.password}")
	private String user;
	
	@GetMapping("/get/employee")
	public String getEmployee() {
		return "hai"+"=>"+url+"=>"+user+"=>"+password;
	}
}
