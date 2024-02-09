package com.hackaton.agrotech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AGRODIGITAL_PDF")
public class PDF extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
