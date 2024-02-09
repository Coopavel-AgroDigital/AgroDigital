package com.hackaton.agrotech.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "AGRODIGITAL_PDF")
public class PDF extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conteudo;

}
