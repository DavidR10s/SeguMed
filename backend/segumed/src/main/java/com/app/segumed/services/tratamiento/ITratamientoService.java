
package com.app.segumed.services.tratamiento;
import java.util.*;
import com.app.segumed.models.Tratamiento;

public interface ITratamientoService {
    List<Tratamiento> listarTratamiento();
    Tratamiento mostrarTratamiento(Long id);
    Tratamiento crearTratamiento(Tratamiento medicoDto);
    Tratamiento actualizarTratamiento(Long id, Tratamiento medicoDto);
    void eliminarTratamiento(Long id);
}
