package com.hackaton.agrotech.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGRODIGITAL_AMBIENCIA")
public class Ambiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String temperatura;
    private String umidade;
    private String nivelCO2;
    private String nivelIluminacao;
    private String nivelPhSolo;
    private String nutrientes;
    private Date data;

}
