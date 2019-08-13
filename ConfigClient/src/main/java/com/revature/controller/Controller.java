package com.revature.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {
	
	@Value("${message: No messages here}")
	private String configMessage;
	
	@GetMapping("/api")
	public String getTheMessage() {
		return configMessage;	
	}
}
