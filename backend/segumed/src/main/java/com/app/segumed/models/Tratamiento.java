package com.app.segumed.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import com.app.segumed.models.Medico;
import com.app.segumed.enums.EstadoTratamiento;
import com.app.segumed.models.Paciente;

@Entity
@Table(name = "tratamientos")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;

    @Column(nullable = false)
    private LocalDateTime fechaFin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoTratamiento estado;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    public Tratamiento() {
    }

    public Tratamiento(Long id, LocalDateTime fechaInicio, LocalDateTime fechaFin, EstadoTratamiento estado, Medico medico, Paciente paciente) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    
}
