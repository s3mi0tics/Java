package com.colby.diakachiroroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikachiroController {

	@RequestMapping("/diakachiro")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/diakachiro/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	@RequestMapping("/diakachiro/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
}
