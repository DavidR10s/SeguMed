
package com.segumed.models;

import com.segumed.enums.EstadoRecordatorio;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "recordatorios")
public class Recordatorio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El medicamento es obligatorio")
    @Column(nullable = false, length = 100)
    private String medicamento;

    @NotBlank(message = "La dosis es obligatoria")
    @Column(nullable = false, length = 50)
    private String dosis;

    @NotNull(message = "La fecha programada es obligatoria")
    @Column(name = "fecha_programada", nullable = false)
    private LocalDateTime fechaProgramada;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoRecordatorio estado = EstadoRecordatorio.PENDIENTE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tratamiento_id", nullable = false)
    private Tratamiento tratamiento;
    
    //CONSTRUCTOR
    public Recordatorio(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public EstadoRecordatorio getEstado() {
        return estado;
    }

    public void setEstado(EstadoRecordatorio estado) {
        this.estado = estado;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    
}
