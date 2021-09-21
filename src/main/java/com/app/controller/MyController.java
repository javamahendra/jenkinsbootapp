package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private static final String URL = "https://app.java-techsols.com";
	@GetMapping(value = "/hello")
	public String hello() {
		//comments
		return "Hello Jenkins spring boot app..."; 
	}

}
