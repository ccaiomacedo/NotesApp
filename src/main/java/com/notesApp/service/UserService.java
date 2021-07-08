package com.notesApp.service;

import com.notesApp.model.Usuario;
import com.notesApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public Usuario loginUser(String user,String password){
    Usuario loginUser = ur.findLogin(user,password);
    return loginUser;
}


}
