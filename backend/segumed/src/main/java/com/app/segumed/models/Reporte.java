package com.app.segumed.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import com.app.segumed.models.Medico;
import com.app.segumed.models.Paciente;
import java.util.List;

@Entity
@Table(name = "reportes")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El asunto no puede estar vacío")
    @Column(nullable = false, columnDefinition = "TEXT")
    private String asunto;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne()
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    public Reporte() {
    }

    public Reporte(Long id, String asunto, String descripcion, Medico medico, Paciente paciente) {
        this.id = id;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    

}
