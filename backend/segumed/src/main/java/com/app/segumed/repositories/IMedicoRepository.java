package com.app.segumed.repositories;

import com.app.segumed.models.Medico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoRepository extends JpaRepository<Medico, Long> {

    List<Medico> findByUsernameContainingIgnoreCase(String username);
    Medico findByUsername(String username);
}
