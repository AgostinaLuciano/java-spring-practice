package com.sample.casaautomatizada.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CasaAutomatizadaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CasaAutomatizadaService.class);

    private IluminacionService iluminacionService;
    private GarageService garageService;
    private ToilettService toilettService;

    public CasaAutomatizadaService(IluminacionService iluminacion, GarageService garage, ToilettService toilett) {
        this.iluminacionService = iluminacion;
        this.garageService = garage;
        this.toilettService = toilett;
    }

    public  void recibirHabitante() {

        LOGGER.info("recibido");

        iluminacionService.encenderLuces();
        toilettService.abrirToilett();
        garageService.abrirGarage();
    }
}
