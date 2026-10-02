package com.app.segumed.services.paciente;

import com.app.segumed.dto.paciente.PacienteDTO;
import com.app.segumed.dto.paciente.CrearPacienteDTO;
import com.app.segumed.models.Paciente;
import com.app.segumed.repositories.IPacienteRepository;
import com.app.segumed.mappers.PacienteMapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService{
    
    private IPacienteRepository repo;
    private PacienteMapper mapper;

    @Override
    public List<PacienteDTO> listarPacientes() {
        
        List<Paciente> pacientes = repo.findAll();
        
        return pacientes.stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public PacienteDTO crearPaciente(CrearPacienteDTO pacienteDto) {
        Paciente paciente = mapper.toEntity(pacienteDto);
        
        Paciente guardado = repo.save(paciente);
        
        return mapper.toDTO(guardado);
    }

    @Override
    public PacienteDTO actualizarPaciente(Long id, PacienteDTO pacienteDto) {
        Paciente pacienteExistente = repo.findById(id).orElse(null);
        
        pacienteExistente.setAltura(pacienteDto.getAltura());
        pacienteExistente.setEmail(pacienteDto.getEmail());
        pacienteExistente.setGenero(pacienteDto.getGenero());
        pacienteExistente.setPeso(pacienteDto.getPeso());
        pacienteExistente.setGrupoSanguineo(pacienteDto.getGrupoSanguineo());
        pacienteExistente.setUsername(pacienteDto.getUsername());
        
        Paciente actualizado = repo.save(pacienteExistente);
        
        return mapper.toDTO(actualizado);
    }

    @Override
    public void eliminarPaciente(Long id) {
      repo.deleteById(id);
    }

    @Override
    public List<PacienteDTO> buscarPaciente(String username) {
       List<Paciente> paciente = repo.findByUsernameContainingIgnoreCase(username);
       return paciente.stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public PacienteDTO pacienteSeleccionado(String username) {
        Paciente pacienteSelec = repo.findByUsername(username);
        return mapper.toDTO(pacienteSelec);
    }
    
}
