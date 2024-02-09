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
@Table(name = "AGRODIGITAL_USER")
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public String toJson(String name, String email) {
        Ambiencia ambiencia = new Ambiencia();
        ambiencia.setId(1L);
        ambiencia.setNome("Casa do seu José");
        ambiencia.setTemperatura(25.0);
        ambiencia.setUmidade(60.0);
        ambiencia.setNivelCO2("Normal");
        ambiencia.setNivelIluminacao("Alta");
        ambiencia.setNivelPhSolo("Neutro");
        ambiencia.setNutrientes("Fertilizante A");
        ambiencia.setSensacaoTermica(26.0);
        ambiencia.setVelocidadeDoVento(15.0);
        ambiencia.setData(new Date());

        return "Identificador: " + ambiencia.getId() + "\n" +
                "Nome: " + ambiencia.getNome() + "\n" +
                "Temperatura: " + ambiencia.getTemperatura() + "\n" +
                "Umidade: " + ambiencia.getUmidade() + "\n" +
                "Nível CO2: " + ambiencia.getNivelCO2() + "\n" +
                "Nível de Iluminação: " + ambiencia.getNivelIluminacao() + "\n" +
                "Nível de pH do Solo: " + ambiencia.getNivelPhSolo() + "\n" +
                "Nutrientes: " + ambiencia.getNutrientes() + "\n" +
                "Sensação Térmica: " + ambiencia.getSensacaoTermica() + "\n" +
                "Velocidade do Vento: " + ambiencia.getVelocidadeDoVento() + "\n" +
                "Data: " + ambiencia.getData() + "\n" +
                "Nome: " + name + "\n" +
                "Email: " + email;
    }

}
