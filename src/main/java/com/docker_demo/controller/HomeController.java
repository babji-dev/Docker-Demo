package com.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getMessage() {
		return "Welcome for the First Coomit!!";
	}
	
	@GetMapping("/hello")
	public String getCustomizedMessage(@RequestParam(required = false) String name ) {
		return "Hello, "+handleNullString(name)+" Welcome !";
	}
	
	public static String handleNullString(String str) {
		return str!=null && !str.isBlank() ? str : "UNKNOWN";
	}
	
}
