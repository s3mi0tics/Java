package com.colby.diakachiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikachiroController {

	@RequestMapping("/diakachi")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/diakachi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	@RequestMapping("/diakachi/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
}
