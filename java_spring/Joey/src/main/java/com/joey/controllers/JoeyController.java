package com.joey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoeyController {

	
	
//________________Home________________-
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	
	
//________________Questions________________-
	@GetMapping("/aboutyou")
	public String aboutYou() {
		return "aboutYou.jsp";
	}
	
//________________Marketplace_____________________

	@GetMapping("/marketplace")
	public String marketplace() {
		return "marketplace.jsp";
	}
	
	
}
