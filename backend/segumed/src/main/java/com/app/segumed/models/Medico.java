package com.app.segumed.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico extends Usuario 
{

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(nullable = false)
    private String especialidad;

    @OneToMany(mappedBy = "medico")
    private List<Tratamiento> tratamientos;

    @OneToMany(mappedBy = "medico")
    private List<Reporte> reportes;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    public Medico() 
    {
        super();
    }


    // Getters and setters
    public String getEspecialidad() 
    {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }
}
