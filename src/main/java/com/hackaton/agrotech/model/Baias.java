package com.hackaton.agrotech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGRODIGITAL_BAIAS")
public class Baias extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Ambiencia Ambiencia;
    private String nome;
    private String temperatura;
    private String umidade;
    private String nivelCO2;
}
