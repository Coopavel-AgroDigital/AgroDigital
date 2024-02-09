package com.hackaton.agrotech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGRODIGITAL_AMBIENCIA")
public class Ambiencia extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double temperatura;
    private Double umidade;
    private String nivelCO2;
    private String nivelIluminacao;
    private String nivelPhSolo;
    private String nutrientes;
    private Double sensacaoTermica;
    private Double velocidadeDoVento;
    private Date data;

    public Double calculaSensacaoTermica() {
        return this.sensacaoTermica = this.temperatura * this.velocidadeDoVento;
    }

}
