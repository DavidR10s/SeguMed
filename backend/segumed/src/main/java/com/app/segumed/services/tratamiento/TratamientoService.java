package com.app.segumed.services.tratamiento;

import com.app.segumed.models.Tratamiento;
import com.app.segumed.repositories.ITratamientoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TratamientoService  implements ITratamientoService{
    
    private ITratamientoRepository repo;

    public TratamientoService(ITratamientoRepository repo) {
        this.repo = repo;
    }
    
    @Override
    public List<Tratamiento> listarTratamiento() {
        return repo.findAll();
    }
    
    @Override
    public Tratamiento mostrarTratamiento(Long id) {
        Tratamiento tratamiento = repo.findById(id).orElse(null);
        return tratamiento;
    }
    
    @Override
    public Tratamiento crearTratamiento(Tratamiento tratamiento) {
        Tratamiento guardado = repo.save(tratamiento);
        
        return guardado;
    }

    @Override
    public Tratamiento actualizarTratamiento(Long id, Tratamiento tratamiento) {
        return null;
    }

    @Override
    public void eliminarTratamiento(Long id) {
        
    }
    
}
