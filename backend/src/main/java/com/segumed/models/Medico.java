
package com.segumed.models;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import com.segumed.enums.UserRole;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "doctores")
@PrimaryKeyJoinColumn(name = "user_id")
public class Medico extends Usuario{

    @NotBlank(message = "Se requiere especialidad")
    @Column(nullable = false, length = 100)
    protected String especialidad;
    
    
    @Column(name = "numero_colegiado",nullable = false, length = 100, unique = true)
    protected int numColegiado;
    
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    protected Enum estado;
    
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamiento> tratamientos = new ArrayList<>();
    
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cita> citas = new ArrayList<>();
    
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reporte> reportes = new ArrayList<>();

    //CONSTRUCTOR
    public Medico(Long id, String name, String password, String email, Enum role,String especialidad, int numColegiado, Enum estado) {
        super(id, name, password, email, role);
        setRole(UserRole.MEDICO);
        this.especialidad = especialidad;
        this.numColegiado = numColegiado;
        this.estado = estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum getRole() {
        return role;
    }

    public void setRole(Enum role) {
        this.role = role;
    }

    
    
    
}
