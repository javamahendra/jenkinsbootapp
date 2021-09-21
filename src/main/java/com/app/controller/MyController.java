package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value = "/hello")
	public String hello() {
		
		return "Hello Jenkins spring boot app..."; 
	}

}
