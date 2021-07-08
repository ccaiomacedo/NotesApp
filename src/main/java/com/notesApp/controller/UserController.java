package com.notesApp.controller;
import com.notesApp.model.Usuario;

import com.notesApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRepository ur;

    @GetMapping("/home")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("usuario",new Usuario());
        mv.setViewName("signUp");
        return mv;
    }

    @PostMapping("/insertUser")
    public ModelAndView insert(Usuario user) throws Exception{
        ModelAndView mv = new ModelAndView();
        ur.save(user);
        mv.setViewName("redirect:/");
        return mv;

    }



}
