
package com.app.segumed.services.medico;

import com.app.segumed.dto.MedicoDTO;
import java.util.*;


public interface IMedicoService {
    
    List<MedicoDTO> listarMedico();
    
    MedicoDTO crearMedico(MedicoDTO medicoDto);
    MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDto);
    void eliminarMedico(Long id);
    
    
}
