package com.example.ItemCatalog_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemCatalogProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogProjectApplication.class, args);
		
	}

}
