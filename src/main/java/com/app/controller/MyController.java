package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private static final String URL = "https://app.java-techsols.com";
	private static final String DATA = "data";
	private static final String INFO = "info";
	@GetMapping(value = "/hello/{id}")
	public String hello(@Pathvariable String id) {

		return "Hello Jenkins spring boot app..." +id; 
	}

}
