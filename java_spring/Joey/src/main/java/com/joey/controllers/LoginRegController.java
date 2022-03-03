package com.joey.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.joey.models.LoginUser;
import com.joey.models.User;
import com.joey.services.UserService;

@Controller
public class LoginRegController {

    @Autowired
    UserService userService;

    //______________LoginReg view____________________
    @GetMapping("/")
    public String loginReg(HttpSession session, Model model){
        //route guard for Loginreg
        //Retrieve the user from database using session id
        Long userId = (Long) session.getAttribute("user_id");
        //check if userID is null
        if(userId != null){
            return "redirect:/shows";
        }else{
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "loginReg.jsp";
        }
    }

    //_____________Register___________________________
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, HttpSession session, Model model){
        //execute the service to to register first
        User user = userService.register(newUser, result);
        //Then check errors
        if(result.hasErrors() || user==null){
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }else{
            //Login and send them to the homepage
            session.setAttribute("user_id", newUser.getId());
            return "redirect:/shows";
        }
    }

    //_____________Login________________________________
    @PostMapping("login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session){
        User user = userService.login(newLogin, result);
        if(result.hasErrors() || user==null) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }else{
            session .setAttribute("user_id", user.getId());
            return "redirect:/shows";
        }
    }  

    //__________________Logout________________________
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}


