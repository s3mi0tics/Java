package com.colby.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	@RequestMapping("")
	public String your_server(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			int count = (int) session.getAttribute("count");
			count += 1;
			session.setAttribute("count", count);
			}
		else {
			int count = (int) session.getAttribute("count");
			count += 1;
			session.setAttribute("count", count);
		}
		
		return "your_server.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			String redirectYourServer = "/";
			return "redirect:" + redirectYourServer;
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			model.addAttribute("currentCount", currentCount);
			return "counter.jsp";
		}
	}
		@RequestMapping("/add2")
		public String add2(HttpSession session) {
				int count = (int) session.getAttribute("count");
				count += 2;
				session.setAttribute("count", count);
				return "redirect:/your_server/counter"; 
			}
		@RequestMapping("/delete")
		public String delete(HttpSession session) {
				session.removeAttribute("count");
				return "redirect:/";
			}
		@RequestMapping("/reset")
		public String counter(HttpSession session) {
			session.removeAttribute("count");
	        return "redirect:/your_server";
		}
	} 

  