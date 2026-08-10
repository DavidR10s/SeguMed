
package com.app.segumed.services.medico;

import com.app.segumed.dto.MedicoDTO;
import com.app.segumed.models.Medico;
import com.app.segumed.repositories.IMedicoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MedicoService implements IMedicoService {

    private IMedicoRepository repo;
    
    @Override
    public List<MedicoDTO> listarMedico() {
        return (List<MedicoDTO>) (Medico) repo.findAll();
    }

    @Override
    public MedicoDTO crearMedico(MedicoDTO medicoDto) {
        return null;
    }

    @Override
    public MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDto) {
        return null;
    }

    @Override
    public void eliminarMedico(Long id) {
        
    }
    
}
