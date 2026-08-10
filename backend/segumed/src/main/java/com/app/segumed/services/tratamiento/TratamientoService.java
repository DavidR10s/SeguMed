package com.app.segumed.services.tratamiento;

import com.app.segumed.models.Tratamiento;
import com.app.segumed.repositories.ITratamientoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TratamientoService  implements ITratamientoService{
    
    private ITratamientoRepository repo;

    @Override
    public List<Tratamiento> listarTratamiento() {
        return repo.findAll();
    }

    @Override
    public Tratamiento crearTratamiento(Tratamiento medicoDto) {
        return null;
    }

    @Override
    public Tratamiento actualizarTratamiento(Long id, Tratamiento medicoDto) {
        return null;
    }

    @Override
    public void eliminarTratamiento(Long id) {
        
    }

    @Override
    public Tratamiento mostrarTratamiento(Long id) {
        return null;
    }
    
}
