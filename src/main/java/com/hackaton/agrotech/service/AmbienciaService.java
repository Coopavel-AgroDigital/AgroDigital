package com.hackaton.agrotech.service;

import com.hackaton.agrotech.exception.ResponseAmbiencia;
import com.hackaton.agrotech.model.Ambiencia;
import com.hackaton.agrotech.repository.AmbienciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmbienciaService {

    private AmbienciaRepository repository;
    private ResponseAmbiencia message;

    public AmbienciaService(AmbienciaRepository repository, ResponseAmbiencia message) {
        this.repository = repository;
        this.message = message;
    }

    public ResponseEntity<?> register(Ambiencia ambiencia) {
        if (ambiencia.getNome().isEmpty()) {
            message.setMessage("Ambiencia name is required");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(repository.save(ambiencia), HttpStatus.CREATED);
        }
    }

    public List<Ambiencia> findAll() {
        return repository.findAll();
    }

    public Ambiencia findById(Long id) {
        Optional<Ambiencia> ambiencia = repository.findById(id);
        return ambiencia.get();
    }

    public ResponseEntity<?> update(Ambiencia ambiencia) {
        if (ambiencia.getNome().isEmpty()) {
            message.setMessage("Ambiencia name is required");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(repository.save(ambiencia), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> delete(Long id) {
        repository.deleteById(id);
        message.setMessage("User deleted");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
