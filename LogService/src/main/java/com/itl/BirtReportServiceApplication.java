package com.itl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.itl.intercetors.LogInterceptor;



@SpringBootApplication
public class BirtReportServiceApplication implements WebMvcConfigurer {
	 private static final Logger logger = LoggerFactory.getLogger(BirtReportServiceApplication.class);
	
	
	@Value("${spring.application.name}")
	private String appName;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BirtReportServiceApplication.class, args);
	}
	
	
	 @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	    	System.out.println("setting LogInterceptor");
	    	
	    	logger.info("Branch with BranchId {} already exists.");

	    	registry.addInterceptor(new LogInterceptor(appName));

	    }

}
