package com.app.segumed.services.paciente;

import com.app.segumed.dto.PacienteDTO;
import com.app.segumed.models.Paciente;
import com.app.segumed.repositories.IPacienteRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService{
    
    private IPacienteRepository repo;

    @Override
    public List<PacienteDTO> listarPacientes() {
        return (List<PacienteDTO>) (Paciente) repo.findAll();
    }

    @Override
    public PacienteDTO crearPaciente(PacienteDTO medicoDto) {
        return null;
    }

    @Override
    public PacienteDTO actualizarPaciente(Long id, PacienteDTO medicoDto) {
        return null;
    }

    @Override
    public void eliminarPaciente(Long id) {
      
    }
    
}
