
package com.segumed.models;

import com.segumed.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;



@Entity
@Table(name = "pacientes")
@PrimaryKeyJoinColumn(name = "user_id")
public class Paciente extends Usuario{
    
    @NotNull(message = "Se requiere fecha de nacimiento")
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNac;
    
    private Integer peso;
    private Integer altura;
    
    @Column(name = "grupo_sanguineo", length = 10)
    private String grupoSanguineo;


    //CONSTRUCTOR
    public Paciente(Long id, String name, String password, String email, Enum role,LocalDate fechaNac, Integer peso, Integer altura, String grupoSanguineo, String estado) {
        super(id, name, password, email, role);
        setRole(UserRole.PACIENTE);
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.altura = altura;
        this.grupoSanguineo = grupoSanguineo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
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
