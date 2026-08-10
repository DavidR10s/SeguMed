package com.app.segumed.repositories;

import com.app.segumed.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoRepository extends JpaRepository<Medico, Long> {

}
