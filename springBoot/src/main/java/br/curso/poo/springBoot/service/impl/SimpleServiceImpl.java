package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.service.SimpleService;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class SimpleServiceImpl implements SimpleService {

    @Override
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
