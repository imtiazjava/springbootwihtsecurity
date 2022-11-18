package com.cgi.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ProductController {

	
	@GetMapping("msg1")
	public String message1() {
		return "message1";
	}
	
	
	@GetMapping("msg2")
	public String message2() {
		return "message2";
	}
	
	@GetMapping("msg3")
	public String message3() {
		return "message3";
	}
}
