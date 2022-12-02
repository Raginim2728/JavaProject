package com.demoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHello {
	@GetMapping("/")
	public String helloWorld(){
		return "welcome";
	}
	

}
