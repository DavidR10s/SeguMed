package com.app.segumed.services.reporte;

import com.app.segumed.models.Reporte;
import com.app.segumed.repositories.IReporteRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReporteService  implements IReporteService{
    
    private IReporteRepository repo;

    @Override
    public List<Reporte> listarReporte() {
        return repo.findAll();
    }

    @Override
    public Reporte crearReporte(Reporte reporte) {
        return null;
    }

    @Override
    public Reporte actualizarReporte(Long id, Reporte reporte) {
        return null;
    }

    @Override
    public void eliminarReporte(Long id) {
        
    }

    @Override
    public Reporte mostrarReporte(Long id) {
        return null;
    }
    
}
