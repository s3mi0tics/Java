package com.colby.diakachiroroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String firstName){
		if(firstName == null) {
			firstName = "human";
		}
		return "Hello " + firstName;
	}
}
