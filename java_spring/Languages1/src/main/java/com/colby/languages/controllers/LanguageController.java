package com.colby.languages.controllers;


//^^package^^
//imports
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.colby.save.travels.save_travels.models.Language;
import com.colby.save.travels.save_travels.services.LanguageService;

@Controller
public class LanguageController {

  @Autowired
  LanguageService LanguageService;

  //Show all
  @GetMapping("/languages")
  public String index(
          Model model,
          @ModelAttribute("language") Language language) {
      List<Language> languages = languageService.allLanguages();
      model.addAttribute("languages", languages);
      return "index.jsp";
  }

  // Create One
  @PostMapping("/languages/create")
  public String create(
          @Valid @ModelAttribute("language") Language language,
          BindingResult result, Model model) {
      if (result.hasErrors()) {
          List<Language> languages = languageService.allLanguages();
          model.addAttribute("languages", languages);
          return "index.jsp";
      } else {
          languageService.createLanguage(language);
          return "redirect:/languages";
      }
  }

  //View One
  @GetMapping("/languages/{id}")
      public String viewOne(@PathVariable("id") Long id, Model model){
          Language language = languageService.findLanguage(id);
          model.addAttribute("language", language);
          return "viewLanguage.jsp";
  }


  // Edit
  @GetMapping("/languages/{id}/edit")
  public String edit(@PathVariable("id") Long id, Model model) {
      Language language = languageService.findLanguage(id);
      model.addAttribute("language", language);
      return "edit.jsp";
  }

  @PutMapping(value = "/languages/{id}/edit")
  public String update(@Valid @ModelAttribute("language") Language language,
          BindingResult result, @PathVariable("id") Long id, Model model) {
      if (result.hasErrors()) {
          Language language1 = languageService.findLanguage(id);
          language.setName(language1.getName());
          return "edit.jsp";
      } else {
          languageService.updateLanguage(language, id);
          return "redirect:/languages";
      }
  }

  //Delete
  @DeleteMapping("/languages/{id}")
  public String destroy(@PathVariable("id") Long id) {
      System.out.println("hi");
      languageService.deleteLanguage(id);
      return "redirect:/languages";
  }
}