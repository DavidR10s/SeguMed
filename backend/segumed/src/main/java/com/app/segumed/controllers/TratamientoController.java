/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.segumed.controllers;

import com.app.segumed.models.Tratamiento;
import com.app.segumed.services.tratamiento.ITratamientoService;


import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author david
 */
@RestController
@RequestMapping("api/tratamientos")
public class TratamientoController {
    private ITratamientoService tratamientoServices;

    public TratamientoController(ITratamientoService tratamientoServices) {
        this.tratamientoServices = tratamientoServices;
    }
    
    @GetMapping
    public ResponseEntity<List<Tratamiento>> listarTratamiento()
    {
        List<Tratamiento> tratamientos = this.tratamientoServices.listarTratamiento();
        return ResponseEntity.ok(tratamientos);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Tratamiento> mostrarTratamiento(@PathVariable Long id)
    {
        Tratamiento mostrado = this.tratamientoServices.mostrarTratamiento(id);
        return ResponseEntity.ok(mostrado);
    }
    
    @PostMapping
    public ResponseEntity<Tratamiento> crearTratamiento(Tratamiento tratamiento)
    {
        
        return null;
    }
}
