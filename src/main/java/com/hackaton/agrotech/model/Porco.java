package com.hackaton.agrotech.model;

import com.hackaton.agrotech.enums.Comportamento;
import jakarta.persistence.*;

@Entity
@Table(name = "AGRODIGITAL_PORCO")
public class Porco extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String temperatura;
    private String peso;
    private String tamanho;
    private Comportamento comportamento;
    private String probabilidadeDeFIcarDoente;
    private Saude saude;
}
