package com.app.segumed.repositories;

import com.app.segumed.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitaRepository extends JpaRepository<Cita, Long> {

}
