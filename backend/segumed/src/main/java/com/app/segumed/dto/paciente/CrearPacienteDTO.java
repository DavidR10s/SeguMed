/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.segumed.dto.paciente;

import com.app.segumed.dto.UsuarioDTO;
import com.app.segumed.enums.RoleUsuario;
import java.time.LocalDate;

/**
 *
 * @author david
 */
public class CrearPacienteDTO extends UsuarioDTO {
    private String password;
    private LocalDate fechaNacimiento;
    private String genero;
    private RoleUsuario role;

    public CrearPacienteDTO() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public RoleUsuario getRole() {
        return role;
    }

    public void setRole(RoleUsuario role) {
        this.role = role;
    }
    
    
}
