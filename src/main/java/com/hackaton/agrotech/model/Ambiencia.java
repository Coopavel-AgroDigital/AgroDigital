package com.hackaton.agrotech.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGRODIGITAL_AMBIENCIA")
public class Ambiencia extends AbstractEntity {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getNivelCO2() {
        return nivelCO2;
    }

    public void setNivelCO2(String nivelCO2) {
        this.nivelCO2 = nivelCO2;
    }

    public String getNivelIluminacao() {
        return nivelIluminacao;
    }

    public void setNivelIluminacao(String nivelIluminacao) {
        this.nivelIluminacao = nivelIluminacao;
    }

    public String getNivelPhSolo() {
        return nivelPhSolo;
    }

    public void setNivelPhSolo(String nivelPhSolo) {
        this.nivelPhSolo = nivelPhSolo;
    }

    public String getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(String nutrientes) {
        this.nutrientes = nutrientes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
