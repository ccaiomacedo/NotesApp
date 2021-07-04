package com.notesApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class signUpController {
    
    @GetMapping("/home")
    public ModelAndView signUp(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("signUp");
        return mv;
    }


}
