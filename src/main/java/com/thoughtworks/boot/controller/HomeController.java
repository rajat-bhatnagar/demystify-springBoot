package com.thoughtworks.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home(){
		return "Spring Boot, Reporting for duty";
	}
}
