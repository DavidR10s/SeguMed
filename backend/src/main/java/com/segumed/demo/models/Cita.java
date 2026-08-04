
package com.segumed.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull(message = "la fecha y hora es obligatorio")
    @Column(name = "fecha_hora", nullable = false)
    private Enum estado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
    
    public Cita(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
}
