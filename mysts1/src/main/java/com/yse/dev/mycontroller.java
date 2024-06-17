package com.yse.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {

	@GetMapping("/")
	public String myRoot() {
		return "hello mysite";
	}
	@GetMapping("/greeting")
	public String myGreeting() {
		return "greeting";
	}
}
