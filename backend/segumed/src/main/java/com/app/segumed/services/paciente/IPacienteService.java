package com.app.segumed.services.paciente;

import com.app.segumed.dto.paciente.PacienteDTO;
import com.app.segumed.dto.paciente.CrearPacienteDTO;
import java.util.*;

public interface IPacienteService {
    
    List<PacienteDTO> listarPacientes();
    List<PacienteDTO> buscarPaciente(String username);
    PacienteDTO pacienteSeleccionado(String username);
    PacienteDTO crearPaciente(CrearPacienteDTO pacienteDto);
    PacienteDTO actualizarPaciente(Long id, PacienteDTO pacienteDto);
    void eliminarPaciente(Long id);
    
}
