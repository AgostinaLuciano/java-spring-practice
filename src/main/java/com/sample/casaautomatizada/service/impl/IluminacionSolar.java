package com.sample.casaautomatizada.service.impl;

import com.sample.casaautomatizada.service.IluminacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class IluminacionSolar implements IluminacionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IluminacionSolar.class);

    public void encenderLuces() {

        LOGGER.info("iluminacion solar OK");
    }
}
