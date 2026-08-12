package com.app.segumed.dto;

import com.app.segumed.enums.RoleUsuario;

public class MedicoDTO extends UsuarioDTO {
    
    private String especialidad;

    public MedicoDTO() {
    }

    public MedicoDTO(Long id, String nombre, String email, RoleUsuario rol, String especialidad) {
        super(id, nombre, email, rol);
        this.especialidad = especialidad;
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

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
