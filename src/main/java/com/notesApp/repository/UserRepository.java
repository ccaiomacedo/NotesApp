package com.notesApp.repository;

import com.notesApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


public interface UserRepository extends JpaRepository<Usuario,Long>{

    @Query("select a from Usuario a where a.username=:user and a.password=:password")
    public Usuario findLogin(String user,String password);


}
