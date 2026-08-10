package com.app.segumed.services.paciente;

import com.app.segumed.dto.PacienteDTO;
import java.util.*;

public interface IPacienteService {
    
    List<PacienteDTO> listarPacientes();
    PacienteDTO crearPaciente(PacienteDTO medicoDto);
    PacienteDTO actualizarPaciente(Long id, PacienteDTO medicoDto);
    void eliminarPaciente(Long id);
    
}
