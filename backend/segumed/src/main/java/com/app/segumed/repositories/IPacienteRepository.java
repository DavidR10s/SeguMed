package com.app.segumed.repositories;

import com.app.segumed.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

}
