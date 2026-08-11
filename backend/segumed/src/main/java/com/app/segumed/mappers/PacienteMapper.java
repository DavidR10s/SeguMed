package com.app.segumed.mappers;

import org.springframework.stereotype.Component;
import com.app.segumed.dto.PacienteDTO;
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
        dto.setRol(paciente.getRole());
        dto.setGrupoSanguineo(paciente.getGrupoSanguineo());
        
        return dto;
    }
    
    public Paciente toEntity(PacienteDTO dto)
    {
        if(dto == null)
        {
            return null;
        }
        
        Paciente paciente = new Paciente();
        
        paciente.setId(dto.getId());
        paciente.setUsername(dto.getUsername());
        paciente.setAltura(dto.getAltura());
        paciente.setPeso(dto.getPeso());
        paciente.setEmail(dto.getEmail());
        paciente.setGenero(dto.getGenero());
        paciente.setFechaNacimiento(dto.getFechaNacimiento());
        paciente.setGrupoSanguineo(dto.getGrupoSanguineo());
        
        return paciente;
    }
}
