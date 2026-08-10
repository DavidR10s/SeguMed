package com.app.segumed.repositories;

import com.app.segumed.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
