package com.app.segumed.models;

import com.app.segumed.enums.RoleUsuario;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico extends Usuario 
{

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

    public Medico(String especialidad, List<Tratamiento> tratamientos, List<Reporte> reportes, List<Cita> citas, Long id, String username, String email, String password, RoleUsuario role) {
        super(id, username, email, password, role);
        this.especialidad = especialidad;
        this.tratamientos = tratamientos;
        this.reportes = reportes;
        this.citas = citas;
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
