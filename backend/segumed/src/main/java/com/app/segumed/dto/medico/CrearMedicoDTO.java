package com.app.segumed.dto.medico;

import com.app.segumed.dto.UsuarioDTO;
import com.app.segumed.enums.RoleUsuario;

public class CrearMedicoDTO  extends UsuarioDTO {
    
    private String especialidad;
    private String password;
    private RoleUsuario role;

    public CrearMedicoDTO() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleUsuario getRole() {
        return role;
    }

    public void setRole(RoleUsuario role) {
        this.role = role;
    }
    
    
}
