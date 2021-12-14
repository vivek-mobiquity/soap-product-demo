package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class SoapProjectManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapProjectManagementApplication.class, args);
	}

}
