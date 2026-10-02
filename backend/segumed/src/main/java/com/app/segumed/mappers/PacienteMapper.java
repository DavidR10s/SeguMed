package com.app.segumed.mappers;

import com.app.segumed.dto.paciente.CrearPacienteDTO;
import org.springframework.stereotype.Component;
import com.app.segumed.dto.paciente.PacienteDTO;
import com.app.segumed.models.Paciente;


@Component
public class PacienteMapper {
    
    public PacienteDTO toDTO(Paciente paciente)
    {
        if(paciente == null)
        {
            return null;
        }
        
        PacienteDTO dto = new PacienteDTO();
        
        dto.setId(paciente.getId());
        dto.setEmail(paciente.getEmail());
        dto.setUsername(paciente.getUsername());
        dto.setRole(paciente.getRole());
        
        dto.setPeso(paciente.getPeso());
        dto.setAltura(paciente.getAltura());
        dto.setFechaNacimiento(paciente.getFechaNacimiento());
        dto.setGrupoSanguineo(paciente.getGrupoSanguineo());
        dto.setGenero(paciente.getGenero());
        
        return dto;
    }
    
    public Paciente toEntity(CrearPacienteDTO dto)
    {
        if(dto == null)
        {
            return null;
        }
        
        Paciente paciente = new Paciente();
        
        paciente.setId(dto.getId());
        paciente.setUsername(dto.getUsername());
        paciente.setEmail(dto.getEmail());
        paciente.setRole(dto.getRole());
        
        paciente.setGenero(dto.getGenero());
        paciente.setFechaNacimiento(dto.getFechaNacimiento());
        
        // paciente.setGrupoSanguineo(dto.getGrupoSanguineo());
        // paciente.setAltura(dto.getAltura());
        // paciente.setPeso(dto.getPeso());
        
        return paciente;
    }
}
