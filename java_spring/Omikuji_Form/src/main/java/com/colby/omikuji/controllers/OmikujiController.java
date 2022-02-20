package com.colby.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	@GetMapping("")
	public String form() {
		return "Form.jsp";
	}
	
	@PostMapping("/create")
	public String OmikujiCreate(HttpSession session,
			@RequestParam(value= "number") int number,
			@RequestParam(value= "city") String city,
			@RequestParam(value= "name") String name,
			@RequestParam(value= "occupation") String occupation,
			@RequestParam(value= "thing") String thing,
			@RequestParam(value= "message") String message
			) {
		session.setAttribute("number", number);
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		session.setAttribute("occupation", occupation);
		session.setAttribute("thing", thing);
		session.setAttribute("message", message);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/show")
	public String OmikujiShow() {

		return "OmikujiShow.jsp";
	}
}
