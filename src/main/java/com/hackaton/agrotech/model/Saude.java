package com.hackaton.agrotech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGRODIGITAL_SAUDE")
public class Saude extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String porcentagemDeVida;
    private String doenca;
    private String tipoDeDoenca;
    private String tipoDeSaude;

}
