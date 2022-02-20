package com.colby.dojos_and_ninjas.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Dojo;
import com.colby.dojos_and_ninjas.dojosandninjas.models.Ninja;
import com.colby.dojos_and_ninjas.dojosandninjas.services.DojoService;
import com.colby.dojos_and_ninjas.dojosandninjas.services.NinjaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {
    @Autowired
    DojoService dojoService;
    @Autowired
    NinjaService ninjaService;
        
    //Show ninja form
    //needs all dojos for form
    @GetMapping("/ninjas/new")
    public String ninjaForm(@ModelAttribute("ninja") Ninja ninja, Model model){
        List<Dojo> allDojos = dojoService.allDojos();
        model.addAttribute("allDojos", allDojos);
        return "ninjaForm.jsp";
    }

    @PostMapping("/ninjas/create")
    public String ninjaCreate(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model){
        if (result.hasErrors()){
            List<Dojo> allDojos = dojoService.allDojos();
            model.addAttribute("allDojos", allDojos);
            return "ninjaForm.jsp";
        }else {
            Ninja newNinja = ninjaService.createNinja(ninja);
            long dojoID = newNinja.getDojo().getId();
            return "redirect:/dojos/" + dojoID;
        }
    }
}
