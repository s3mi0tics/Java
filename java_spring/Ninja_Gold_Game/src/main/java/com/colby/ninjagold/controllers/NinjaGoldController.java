package com.colby.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ninjagold")
public class NinjaGoldController {
	Random random = new Random();
	
	@GetMapping("")
	public String ninjaGold(Model model, HttpSession session) {
		Integer totalGold = 0;
		if (session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
			totalGold = (Integer) session.getAttribute("totalGold");
		}
		else {
			totalGold = (Integer) session.getAttribute("totalGold");
		}
		model.addAttribute("totalGold", totalGold);
			
		return "NinjaGold.jsp";
	}
	
	@PostMapping("/processgold")
	public String processGold(HttpSession session, Model model, 
			@RequestParam (value= "start") int start,
			@RequestParam (value= "end")int end,
			@RequestParam (value= "isGambling")int isGambling
			){
		if(isGambling == 0) {
		Integer deltaGold = start + random.nextInt(end - start+1);
		Integer totalGold = (Integer) session.getAttribute("totalGold");
		session.setAttribute("totalGold", totalGold + deltaGold);
		System.out.println(deltaGold);
		
		}
		else if(isGambling == 1){
			System.out.println("Went gambling");
			Integer deltaGold = random.nextInt(end + (start+1)) - start;
			Integer totalGold = (Integer) session.getAttribute("totalGold");
			session.setAttribute("totalGold", totalGold + deltaGold);
			System.out.println(deltaGold);
		}return "redirect:/ninjagold";
	}
}

  