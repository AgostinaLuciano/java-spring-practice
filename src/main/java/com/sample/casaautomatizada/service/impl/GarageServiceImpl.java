package com.sample.casaautomatizada.service.impl;

import com.sample.casaautomatizada.service.GarageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GarageServiceImpl implements GarageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GarageServiceImpl.class);

    public void abrirGarage() {
        LOGGER.info("garage OK");
    }
}
