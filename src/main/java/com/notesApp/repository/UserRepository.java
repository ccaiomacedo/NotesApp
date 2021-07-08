package com.notesApp.repository;

import com.notesApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserRepository extends JpaRepository<Usuario,Long>{
}
