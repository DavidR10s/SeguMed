package com.app.segumed.dto;

import com.app.segumed.enums.RoleUsuario;

public class UsuarioDTO {

    private Long id;
    private String username;
    private String email;
    private RoleUsuario rol;

    public UsuarioDTO(){}

    public UsuarioDTO(Long id, String username, String email, RoleUsuario rol) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.rol = rol;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public RoleUsuario getRol() {
        return rol;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRol(RoleUsuario rol) {
        this.rol = rol;
    }
    
    


}
