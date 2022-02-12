package com.colby.hoppers.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller 
public class HoppersController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace";
        String itemName = "Copper";
        double price = 5.25;
        String description = "Metal";
        String vendor = "Corner Store";
       
     // Your code here! Add values to the view model to be rendered  
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    	// Your code here! Add values to the view model to be rendered
    
        return "hoppers.jsp";
    }
}
