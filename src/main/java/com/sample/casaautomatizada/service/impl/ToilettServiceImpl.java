package com.sample.casaautomatizada.service.impl;

import com.sample.casaautomatizada.service.ToilettService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ToilettServiceImpl implements ToilettService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToilettServiceImpl.class);

    public void abrirToilett() {
        LOGGER.info("Toilett OK");
    }
}
