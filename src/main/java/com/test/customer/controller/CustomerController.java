package com.test.customer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

	@RequestMapping("/customer")
	String home() {
		System.out.print("hello");
		return "Hello World!";
	}
}