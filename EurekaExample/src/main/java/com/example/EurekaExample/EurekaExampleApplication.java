package com.example.EurekaExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication

public class EurekaExampleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaExampleApplication.class, args);
	}

}
