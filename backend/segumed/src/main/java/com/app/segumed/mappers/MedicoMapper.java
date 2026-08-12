package com.app.segumed.mappers;

import com.app.segumed.dto.MedicoDTO;
import com.app.segumed.models.Medico;


import org.springframework.stereotype.Component;

@Component
public class MedicoMapper {
    
    public MedicoDTO toDTO(Medico medico) {
        if (medico == null) {
            return null; // Protección si viene nulo
        }

        MedicoDTO dto = new MedicoDTO();
        dto.setId(medico.getId());
        dto.setUsername(medico.getUsername());
        dto.setEmail(medico.getEmail());
        
        dto.setEspecialidad(medico.getEspecialidad());

        return dto;
    }
    
    public Medico toEntity(MedicoDTO dto) {
        if (dto == null) {
            return null;
        }

        Medico medico = new Medico();
        medico.setId(dto.getId());
        medico.setUsername(dto.getUsername());
        medico.setEmail(dto.getEmail());
        
        medico.setEspecialidad(dto.getEspecialidad());

        return medico;
    }
    
}
