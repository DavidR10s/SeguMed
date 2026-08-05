package com.app.segumed.models;

import com.app.segumed.enums.RoleUsuario;
import com.app.segumed.models.Cita;
import com.app.segumed.models.Reporte;
import com.app.segumed.models.Tratamiento;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pacientes")
public class Paciente extends Usuario {

    @Column(nullable = false)
    private LocalDate fechaNacimiento;

    @Column(nullable = false)
    private float peso;

    @Column(nullable = false)
    private float altura;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = true)
    private String grupoSanguineo;

    @ManyToMany(mappedBy = "paciente")
    private List<Tratamiento> tratamientos;

    @OneToMany(mappedBy = "paciente")
    private List<Reporte> reportes;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    public Paciente() {
        super();
    }

    // Getters and setters

    public LocalDate getFechaNacimiento() 
    {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) 
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getPeso() 
    {
        return peso;
    }
    public void setPeso(float peso) 
    {
        this.peso = peso;
    }

    public float getAltura() 
    {
        return altura;
    }
    public void setAltura(float altura) 
    {
        this.altura = altura;
    }

    public String getGenero() 
    {
        return genero;
    }
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

}
