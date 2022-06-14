package com.scb.cep.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path = "/hello",method = RequestMethod.GET)
	public String sayHello() {
		return "Hello SCB";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Aboard!!";
	}
	
	@GetMapping("/user/{id}")
	public String testPathVariable(@PathVariable int id) {
		String message="User at ID  #"+id+" is Tom Smith";
		return message;
		
	}
	
	@GetMapping("/say-hello")
	public String testRequestParameter(@RequestParam String name) {
		return " Hello "+name.toUpperCase();
	}
}
