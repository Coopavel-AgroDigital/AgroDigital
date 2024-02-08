package com.hackaton.agrotech.repository;

import com.hackaton.agrotech.model.Ambiencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AmbienciaRepository extends JpaRepository<Ambiencia, Long> {
}
