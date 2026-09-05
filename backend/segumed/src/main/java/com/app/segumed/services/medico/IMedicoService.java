
package com.app.segumed.services.medico;

import com.app.segumed.dto.MedicoDTO;
import com.app.segumed.dto.CrearMedicoDTO;
import java.util.*;


public interface IMedicoService {
    
    List<MedicoDTO> listarMedico();
    List<MedicoDTO> buscarMedico(String Username);
    MedicoDTO crearMedico(CrearMedicoDTO medicoDto);
    MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDto);
    void eliminarMedico(Long id);
    
    
}
