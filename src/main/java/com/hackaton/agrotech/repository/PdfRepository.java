package com.hackaton.agrotech.repository;

import com.hackaton.agrotech.model.PDF;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PdfRepository extends JpaRepository<PDF, Long> {
}
