package com.xingyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xingyi.dao","com.xingyi.service","com.xingyi.controller"})
@MapperScan("com.xingyi.dao")
public class TestSpringBootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TestSpringBootApplication.class);
	}
	
}
