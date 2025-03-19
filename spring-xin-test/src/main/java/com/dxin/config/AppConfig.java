package com.dxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dxin.service")
public class AppConfig {

//	@Bean
//	public UserService userService() {
//		return new UserService();
//	}

}
