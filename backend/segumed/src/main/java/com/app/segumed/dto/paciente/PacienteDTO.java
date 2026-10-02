package com.app.segumed.dto.paciente;

import com.app.segumed.dto.UsuarioDTO;
import com.app.segumed.enums.RoleUsuario;
import java.time.LocalDate;

public class PacienteDTO extends UsuarioDTO {
    
    private String grupoSanguineo;
    private LocalDate fechaNacimiento;
    private float peso;
    private float altura;
    private String genero;
    

    public PacienteDTO() {
    }


    public PacienteDTO(Long id, String username, String email, RoleUsuario role, LocalDate fechaNacimiento, float peso, float altura, String genero ,String grupoSanguineo) {
        super(id, username, email, role);
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura = altura;
        this.genero = genero;
        this.peso = peso;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

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
    
    
    
    //OVERRIDE

    @Override
    public void setRole(RoleUsuario role) {
        super.setRole(role); 
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public void setId(Long id) {
        super.setId(id); 
    }

    @Override
    public RoleUsuario getRole() {
        return super.getRole(); 
    }

    @Override
    public String getEmail() {
        return super.getEmail(); 
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

}
