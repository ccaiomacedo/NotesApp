package com.notesApp.service;

import com.notesApp.exception.CriptoExistException;
import com.notesApp.exception.EmailException;
import com.notesApp.model.Usuario;
import com.notesApp.repository.UserRepository;
import com.notesApp.util.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;



    public void saveUser(Usuario user) throws Exception{
        try{
            if(ur.findByEmail(user.getEmail())!=null){
                throw new EmailException("Já existe um email cadastrado como: "+user.getEmail());
            }
            user.setPassword(Util.md5(user.getPassword()));
        }catch (NoSuchAlgorithmException e) {
            throw new CriptoExistException("Erro na criptografia da senha");
        }
        ur.save(user);
    }

    public Usuario loginUser(String user,String password){
    Usuario loginUser = ur.findLogin(user,password);
    return loginUser;
}


}
