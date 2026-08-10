
package com.app.segumed.services.cita;

import java.util.*;
import com.app.segumed.models.Cita;

public interface ICitaService {
    List<Cita> listarCita();
    Cita mostrarCita(Long id);
    Cita crearCita(Cita cita);
    Cita actualizarCita(Long id, Cita cita);
    void eliminarCita(Long id);
}
