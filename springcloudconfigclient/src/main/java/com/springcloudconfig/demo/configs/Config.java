package com.springcloudconfig.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Config {
	@Bean
	public RestTemplate geRestTemplate()
	{
		return new RestTemplate();
	}
}
