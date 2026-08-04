package com.segumed.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "usuarios")
@MappedSuperclass
public abstract class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String name;
    
    @NotBlank(message = "La contraseña es obligatoria")
    protected String password;
    
    @Email(message = "Debe proporcionar un email válido")
    @NotBlank(message = "El email es obligatorio")
    @Column(nullable = false, unique = true, length = 150)
    protected String email;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    protected Enum role;

    public Usuario(Long id, String name, String password, String email, Enum role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
    }

  
   
    
    //GETTER
    
    public Long getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public Enum getRole()
    {
        return this.role;
    }
    
    //SETTER
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setRole(Enum role)
    {
        this.role = role;
    }
    
}
