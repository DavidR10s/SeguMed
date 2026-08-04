
package com.segumed.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import com.segumed.models.Medico;

@Entity
@Table(name = "tratamientos")
public class Tratamiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "Se requiere titulo")
    @Column(nullable = false, length = 100)
    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    @NotNull(message = "la fecha de inicio es obligatoria")
    @Column(nullable = false, length = 150)
    private LocalDate fechaInicio;
    
    @NotNull(message = "La fecha de fin es obligatoria")
    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;
    
    @Column(nullable = false)
    private Boolean activo = true;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;
    
    public Tratamiento(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    

    
}
