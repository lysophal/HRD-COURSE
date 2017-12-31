package com.kshrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
	@GetMapping(value={"/login","/"})
	public String login(){
		return "loginForm";
	}
//	@RequestMapping("/loginForm")
//	public String loginForm(){
//		return "loginForm";
//	}
	
	@GetMapping("/Home")
	public String home(){
		return "book/Home";
	}
}
