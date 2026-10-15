/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.segumed.controllers;

import com.app.segumed.dto.paciente.PacienteDTO;
import com.app.segumed.dto.paciente.CrearPacienteDTO;
import com.app.segumed.services.paciente.IPacienteService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author david
 */
@RestController
@RequestMapping("api/pacientes")
public class PacienteController {
    
    private IPacienteService pacienteService;

    public PacienteController(IPacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }
    
    @GetMapping()
    public ResponseEntity<List<PacienteDTO>> listarPacientes()
    {
        List<PacienteDTO> pacientes = this.pacienteService.listarPacientes();
        
        return ResponseEntity.ok(pacientes);
    }
    
    @GetMapping("/buscar")
    public ResponseEntity<List<PacienteDTO>> buscarPaciente(String username)
    {
       List<PacienteDTO> pacientesBuscados = this.pacienteService.buscarPaciente(username);
       
       return ResponseEntity.ok(pacientesBuscados);
    }
    
    @GetMapping("/{username}")
    public ResponseEntity<PacienteDTO> pacienteSeleccionado(String username)
    {
        
        PacienteDTO pacienteSelec = this.pacienteService.pacienteSeleccionado(username);
        
        return ResponseEntity.ok(pacienteSelec);
    }
    
    @PostMapping
    public ResponseEntity<PacienteDTO> crearPaciente(@RequestBody CrearPacienteDTO pacienteDto)
    {
        PacienteDTO pacienteCreado = this.pacienteService.crearPaciente(pacienteDto);
        
        return new ResponseEntity<>(pacienteCreado, HttpStatus.CREATED);
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<PacienteDTO> modificarPaciente(@PathVariable Long id, @RequestBody PacienteDTO pacienteDto)
    {
        PacienteDTO pacienteActualizado = this.pacienteService.actualizarPaciente(id, pacienteDto);
        
        return ResponseEntity.ok(pacienteActualizado);
    }
}
