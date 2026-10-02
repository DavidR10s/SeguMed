package com.app.segumed.repositories;

import com.app.segumed.models.Paciente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    
    List<Paciente> findByUsernameContainingIgnoreCase(String username);
    Paciente findByUsername(String username);
}
