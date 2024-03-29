package com.vulab.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ServiceAPI {

	
	
	@GetMapping
	public String healthCheck() {

		System.out.println("ServiceAPI healthCheck() is called");
		return "Running";
		
	}
	
	

}
