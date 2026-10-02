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

    @Column(nullable = true)
    private float peso;

    @Column(nullable = true)
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

    public Paciente(LocalDate fechaNacimiento, float peso, float altura, String genero, String grupoSanguineo, List<Tratamiento> tratamientos, List<Reporte> reportes, List<Cita> citas, Long id, String username, String email, String password, RoleUsuario role) {
        super(id, username, email, password, role);
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.grupoSanguineo = grupoSanguineo;
        this.tratamientos = tratamientos;
        this.reportes = reportes;
        this.citas = citas;
    }
    
    

    // Getters and setters

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    //OVERRIDE

    @Override
    public void setRole(RoleUsuario role) {
        super.setRole(role); 
    }

    @Override
    public RoleUsuario getRole() {
        return super.getRole(); 
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); 
    }

    @Override
    public String getEmail() {
        return super.getEmail(); 
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); 
    }

    @Override
    public String getUsername() {
        return super.getUsername(); 
    }

    @Override
    public void setId(Long id) {
        super.setId(id); 
    }

    @Override
    public Long getId() {
        return super.getId(); 
    }


}
