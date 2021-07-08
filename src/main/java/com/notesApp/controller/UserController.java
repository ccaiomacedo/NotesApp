package com.notesApp.controller;
import com.notesApp.model.Usuario;

import com.notesApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserRepository ur;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("usuario",new Usuario());
        mv.setViewName("index");
        return mv;
    }

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

    @PostMapping("/login")
    public ModelAndView login(HttpSession session,Usuario user){
        ModelAndView mv = new ModelAndView();
        Usuario loginUser = ur.findLogin(user.getUsername(),user.getPassword());
        if(loginUser==null){
            mv.addObject("msg","Usuário ou senha errado!");
        }else{
            session.setAttribute("usuarioLogado",loginUser);
            mv.setViewName("home");
        }
        return mv;
    }


}
