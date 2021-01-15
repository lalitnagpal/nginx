package com.example.webserver.myserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot!";
	}

}