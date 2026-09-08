
package com.app.segumed.services.medico;

import com.app.segumed.dto.CrearMedicoDTO;
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
    public List<MedicoDTO> buscarMedico(String username)
    {
        List<Medico> medicos = repo.findByUsernameContainingIgnoreCase(username);
        
        return medicos.stream().map(mapper::toDTO).collect(Collectors.toList());
    }
    

    @Override
    public MedicoDTO crearMedico(CrearMedicoDTO medicoDto) {
        
        Medico medico = mapper.toEntity(medicoDto);
        
        Medico guardado = repo.save(medico);
        
        return mapper.toDTO(guardado);
    }
    
    @Override
    public MedicoDTO medicoSelec(String username) 
    {
        Medico medicoSelec = repo.findByUsername(username);
        
        return mapper.toDTO(medicoSelec);
    }


    @Override
    public MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDto) {
        Medico medicoExistente = repo.findById(id).orElse(null);
        
        if(medicoDto.getUsername() != null)
        {
            medicoExistente.setUsername(medicoDto.getUsername());
        }
        if(medicoDto.getEmail() != null)
        {
            medicoExistente.setEmail(medicoDto.getEmail());
        }
        if(medicoDto.getRole() != null)
        {
            medicoExistente.setRole(medicoDto.getRole());
        }
        if(medicoDto.getEspecialidad() != null)
        {
            medicoExistente.setEspecialidad(medicoDto.getEspecialidad());
        }
        
        
        Medico actualizado = repo.save(medicoExistente);
        
        return mapper.toDTO(actualizado);
    }

    @Override
    public void eliminarMedico(Long id) {
        
        repo.deleteById(id);
    }

    
}
