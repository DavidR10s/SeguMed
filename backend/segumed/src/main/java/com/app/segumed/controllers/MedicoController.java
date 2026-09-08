package com.app.segumed.controllers;

import com.app.segumed.dto.MedicoDTO;
import com.app.segumed.dto.CrearMedicoDTO;
import com.app.segumed.services.medico.IMedicoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/medicos")
public class MedicoController {
    
    private IMedicoService medicoServices;

    public MedicoController(IMedicoService medicoServices) {
        this.medicoServices = medicoServices;
    }
    
    
    
    @GetMapping
    public ResponseEntity<List<MedicoDTO>> listarMedicos()
    {
        List<MedicoDTO> medicos = this.medicoServices.listarMedico();
        
        return ResponseEntity.ok(medicos);
    }
    
    
    // GET: http://localhost:8080/api/medicos/buscar?username=Carlos
    @GetMapping("/buscar")
    public ResponseEntity<List<MedicoDTO>> buscarMedico(@RequestParam String username)
    {
        List<MedicoDTO> medicos = this.medicoServices.buscarMedico(username);
        
        return ResponseEntity.ok(medicos);
    }
    
    
    // GET: http://localhost:8080/api/medicos/Dr.%20Pablo%20Neruda
    @GetMapping("/{username}")
    public ResponseEntity<MedicoDTO> medicoSelecionado(@PathVariable String username)
    {
        MedicoDTO medicoSelec = this.medicoServices.medicoSelec(username);
        
        return ResponseEntity.ok(medicoSelec);
    }
    
    
    
    @PostMapping
    public ResponseEntity<MedicoDTO> crearMedico(@RequestBody CrearMedicoDTO medicoDto)
    {
        MedicoDTO creado = this.medicoServices.crearMedico(medicoDto);
        
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<MedicoDTO> modificarMedico(@PathVariable Long id, @RequestBody MedicoDTO medicoDto)
    {
        MedicoDTO medicoActualizado = this.medicoServices.actualizarMedico(id, medicoDto);
        
        return ResponseEntity.ok(medicoActualizado);
    }
    
}
