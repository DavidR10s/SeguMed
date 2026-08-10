
package com.app.segumed.services.cita;

import com.app.segumed.models.Cita;
import com.app.segumed.repositories.ICitaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CitaService implements ICitaService{
    
    private ICitaRepository repo;

    @Override
    public List<Cita> listarCita() {
        return repo.findAll();
    }

    @Override
    public Cita mostrarCita(Long id) {
        return null;
    }

    @Override
    public Cita crearCita(Cita cita) {
        return null;
    }

    @Override
    public Cita actualizarCita(Long id, Cita cita) {
        return null;
    }

    @Override
    public void eliminarCita(Long id) {
        
    }
    
}
