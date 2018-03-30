package com.ddubson.hello.controllers;

import com.ddubson.hello.entities.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("/rest")
	public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
		return new Greeting("Hello, " + name);
	}
}
