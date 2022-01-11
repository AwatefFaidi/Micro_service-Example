package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.hateoas.Resources;

@FeignClient("item-catalog-service")
public interface ItemClient {
	 @GetMapping("/items")
	    Resources<Item> readItems();
}
