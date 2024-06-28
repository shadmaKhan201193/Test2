package com.jasper.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class JasperApplication {
	
	  
	public static void main(String[] args) {
		SpringApplication.run(JasperApplication.class, args);
	}
	
	 @Bean
	   	public RestTemplate getRestTemplate() {
	       	HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	       	//clientHttpRequestFactory.setConnectTimeout(3000);
	       	RestTemplate rt = new RestTemplate();
	       	rt.setRequestFactory( clientHttpRequestFactory);
	           return rt;
	   	}
	

}
