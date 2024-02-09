package com.hackaton.agrotech.service;

import com.hackaton.agrotech.model.Ambiencia;
import com.hackaton.agrotech.usecase.AmbienciaMonitor;
import org.springframework.stereotype.Service;

@Service
public class AmbienciaMonitorService {

    private AmbienciaMonitor ambienciaMonitor;

    public AmbienciaMonitorService(AmbienciaMonitor ambienciaMonitor) {
        this.ambienciaMonitor = ambienciaMonitor;
    }

    public void verificaDados(Ambiencia ambiencia) {
        ambienciaMonitor.monitorarAmbiencia(ambiencia);
    }

}
