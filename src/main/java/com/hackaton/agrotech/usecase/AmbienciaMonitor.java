package com.hackaton.agrotech.usecase;

import com.hackaton.agrotech.model.Ambiencia;

public class AmbienciaMonitor {
    public void monitorarAmbiencia(Ambiencia ambiencia) {
        if (verificarTemperatura(ambiencia.getTemperatura()) ||
                verificarUmidade(ambiencia.getUmidade()) ||
                verificarNivelCO2(ambiencia.getNivelCO2()) ||
                verificarNivelIluminacao(ambiencia.getNivelIluminacao()) ||
                verificarPhSolo(ambiencia.getNivelPhSolo()) ||
                verificarNutrientes(ambiencia.getNutrientes()) ||
                verificarSensacaoTermica(ambiencia.getSensacaoTermica(), ambiencia.getVelocidadeDoVento())) {
            notificarUsuario();
        }
    }

    private boolean verificarTemperatura(Double temperatura) {
        // Verificar se a temperatura está fora da faixa aceitável
        return temperatura < 18 || temperatura > 28;
    }

    private boolean verificarUmidade(Double umidade) {
        // Verificar se a umidade está fora da faixa aceitável
        return umidade < 40 || umidade > 60;
    }

    private boolean verificarNivelCO2(String nivelCO2) {
        // Verificar se o nível de CO2 está acima do limite seguro
        return nivelCO2.equals("Alto");
    }

    private boolean verificarNivelIluminacao(String nivelIluminacao) {
        // Verificar se o nível de iluminação está muito baixo
        return nivelIluminacao.equals("Baixo");
    }

    private boolean verificarPhSolo(String nivelPhSolo) {
        // Verificar se o pH do solo está fora da faixa ideal
        return nivelPhSolo.equals("Ácido") || nivelPhSolo.equals("Alcalino");
    }

    private boolean verificarNutrientes(String nutrientes) {
        // Verificar se os nutrientes estão em níveis inadequados
        return nutrientes.equals("Insuficientes");
    }

    private boolean verificarSensacaoTermica(Double sensacaoTermica, Double velocidadeDoVento) {
        // Calcular a sensação térmica e verificar se está fora da faixa aceitável
        double indiceCalor = calcularIndiceCalor(sensacaoTermica, velocidadeDoVento);
        return indiceCalor > 32; // Limite de sensação térmica desconfortável
    }

    private double calcularIndiceCalor(Double temperatura, Double velocidadeDoVento) {
        // Calcular o índice de calor (sensação térmica)
        // Implementação do cálculo do índice de calor aqui...
        return 0; // Exemplo simples, precisa ser substituído pelo cálculo real
    }

    private void notificarUsuario() {
        // Lógica para notificar o usuário sobre as condições adversas
        System.out.println("Condições de ambiência adversas detectadas! Notificar o usuário.");
    }
}
