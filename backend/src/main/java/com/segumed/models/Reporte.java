
package com.segumed.models;
import com.segumed.models.Medico;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "reportes")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "se requiere asunto")
    @Column(nullable = false, length = 100)
    private String asunto;
    
    @Column(nullable = false, length = 100)
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;
    
    public Reporte(){}
    
}
