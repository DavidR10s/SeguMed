package com.app.segumed.services.reporte;
import java.util.*;
import com.app.segumed.models.Reporte;
public interface IReporteService {
    
    List<Reporte> listarReporte();
    Reporte mostrarReporte(Long id);
    Reporte crearReporte(Reporte reporte);
    Reporte actualizarReporte(Long id, Reporte reporte);
    void eliminarReporte(Long id);
}
