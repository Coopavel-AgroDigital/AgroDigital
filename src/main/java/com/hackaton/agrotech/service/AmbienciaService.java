package com.hackaton.agrotech.service;

import com.hackaton.agrotech.exception.ResponseAmbiencia;
import com.hackaton.agrotech.model.Ambiencia;
import com.hackaton.agrotech.repository.AmbienciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    public Ambiencia findById(Long id) {
        return null;
    }

    public ResponseEntity<?> update(Ambiencia ambiencia) {
        return null;
    }

    public ResponseEntity<?> delete(Ambiencia id) {
        return null;
    }
}
