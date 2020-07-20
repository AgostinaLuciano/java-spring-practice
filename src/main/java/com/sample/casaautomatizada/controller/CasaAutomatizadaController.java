package com.sample.casaautomatizada.controller;

import com.sample.casaautomatizada.service.CasaAutomatizadaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasaAutomatizadaController {

    private CasaAutomatizadaService casa;

    public CasaAutomatizadaController(CasaAutomatizadaService casa) {
        this.casa = casa;
    }

    @GetMapping
    @RequestMapping("entrar")
    public String bienvenido() {
        casa.recibirHabitante();
        return "Bienvenido";
    }
}