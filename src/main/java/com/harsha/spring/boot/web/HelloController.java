package com.harsha.spring.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("/")
	public String sayHelloWorld() {
		return this.helloWorldService.getHelloMessage();
	}
}
