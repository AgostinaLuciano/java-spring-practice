package com.sample.casaautomatizada.service.impl;

import com.sample.casaautomatizada.service.IluminacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class IluminacionConvencional implements IluminacionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IluminacionConvencional.class);

    public void encenderLuces() {
        LOGGER.info("electrico OK");
    }
}
