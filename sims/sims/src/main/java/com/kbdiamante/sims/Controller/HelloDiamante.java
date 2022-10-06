package com.kbdiamante.sims.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDiamante {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, Keith Brylle Diamante, BSIT-3!"; 
	}
}
