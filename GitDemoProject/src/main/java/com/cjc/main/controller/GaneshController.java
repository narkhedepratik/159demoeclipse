package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GaneshController {

	
	@GetMapping("/message")
	public String msg()
	{
		return "Hello Teammates";
	}
}
