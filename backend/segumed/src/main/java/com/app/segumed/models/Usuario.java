package com.app.segumed.models;

import jakarta.persistence.*;
import com.app.segumed.enums.RoleUsuario;
import jakarta.validation.constraints.Email;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private RoleUsuario role;

    public Usuario() 
    {
    }

    // Getters and setters
    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }
    
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public RoleUsuario getRole() 
    {
        return role;
    }
    public void setRole(RoleUsuario role) 
    {
        this.role = role;
    }


}
