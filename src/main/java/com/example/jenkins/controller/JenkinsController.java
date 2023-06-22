package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	
	@GetMapping("/get")
	public String get() {
		return "this is rest controller";
	}
}
