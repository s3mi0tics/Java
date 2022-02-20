package com.colby.dojos_and_ninjas.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Dojo;
import com.colby.dojos_and_ninjas.dojosandninjas.services.DojoService;
import com.colby.dojos_and_ninjas.dojosandninjas.services.NinjaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DojoController {
    @Autowired
    DojoService dojoService;
    @Autowired
    NinjaService ninjaService;

    //Show Dojo Form and all dojos
    @GetMapping("dojos/new")
    public String dojoForm(@ModelAttribute("dojo") Dojo dojo, Model model){
        List<Dojo> allDojos = dojoService.allDojos();
        model.addAttribute("allDojos", allDojos);
        return "dojoForm.jsp";
    }

    //Create Dojo
    @PostMapping("/dojos/create")
    public String dojoCreate(@Valid @ModelAttribute("dojo") Dojo dojo,
    BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Dojo> allDojos = dojoService.allDojos();
            model.addAttribute("allDojos", allDojos);
            return "dojoForm.jsp";
        } else {
            Dojo tempDojo = dojoService.createDojo(dojo);
            return "redirect:/dojos/" + tempDojo.getId();
        }
        }

    //Show Dojo with Ninjas
    @GetMapping("dojos/{id}")
    public String dojoShow(@PathVariable("id") Long id, Model model){
        Dojo dojo = dojoService.findDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojoShow.jsp";
    }
}

