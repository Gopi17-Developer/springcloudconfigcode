package com.springcloudconfig.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeClientController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Value("${database.urlfromgit}")
	private String dbname;
	//this is hard coded value for url if this application changes the port number then it will not work ,to improve we can use the cloud config
	
	public String urlString = "http://localhost:8080/get/employee";

	//without hard coding
	@Value("${empserviceurl}")
	public String url;
	
	@GetMapping("/employeemsg")
	public String getEmployeeMsg() {
		// Make the request with GET method and no body (HttpEntity is null)
		return restTemplate.getForObject(url, String.class)+dbname;
	}
}
