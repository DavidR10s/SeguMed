package com.app.segumed.dto;

import com.app.segumed.enums.RoleUsuario;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String email;
    private RoleUsuario rol;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public RoleUsuario getRol() {
        return rol;
    }
    
    


}
