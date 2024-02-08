package com.hackaton.agrotech.controller;

import com.hackaton.agrotech.model.Ambiencia;
import com.hackaton.agrotech.service.AmbienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ambiencia")
public class AmbienciaController {

    @Autowired
    private AmbienciaService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Ambiencia ambiencia) {
        return service.register(ambiencia);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Ambiencia>> listAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Ambiencia> findById(@PathVariable Long id) {
        Ambiencia obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Ambiencia ambiencia) {
        return service.update(ambiencia);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
