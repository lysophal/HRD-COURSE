package com.kshrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/test")
	public String testEvent(){
		return "book/testEvent";
	}
}
