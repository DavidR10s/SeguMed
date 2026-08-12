package com.app.segumed.dto;

import com.app.segumed.enums.RoleUsuario;

public class UsuarioDTO {

    private Long id;
    private String username;
    private String email;
    private RoleUsuario role;

    public UsuarioDTO(){}

    public UsuarioDTO(Long id, String username, String email, RoleUsuario role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
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

    public RoleUsuario getRole() {
        return role;
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

    public void setRole(RoleUsuario role) {
        this.role = role;
    }
    
    


}
