
package com.app.segumed.services.medico;

import com.app.segumed.dto.MedicoDTO;
import com.app.segumed.models.Medico;
import com.app.segumed.repositories.IMedicoRepository;
import com.app.segumed.mappers.MedicoMapper;


import java.util.*;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class MedicoService implements IMedicoService {

    private IMedicoRepository repo;
    private MedicoMapper mapper;

    public MedicoService(IMedicoRepository repo, MedicoMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
    
    
    
    @Override
    public List<MedicoDTO> listarMedico() {
        List<Medico> medicos = repo.findAll();
        
        return medicos.stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public MedicoDTO crearMedico(MedicoDTO medicoDto) {
        Medico medico = mapper.toEntity(medicoDto);
        
        Medico guardado = repo.save(medico);
        
        return mapper.toDTO(guardado);
    }

    @Override
    public MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDto) {
        Medico medicoExistente = repo.findById(id).orElse(null);
        
        medicoExistente.setUsername(medicoDto.getUsername());
        medicoExistente.setEmail(medicoDto.getEmail());
        medicoExistente.setRole(medicoDto.getRole());
        medicoExistente.setEspecialidad(medicoDto.getEspecialidad());
        
        Medico actualizado = repo.save(medicoExistente);
        
        return mapper.toDTO(actualizado);
    }

    @Override
    public void eliminarMedico(Long id) {
        
        repo.deleteById(id);
    }
    
}
