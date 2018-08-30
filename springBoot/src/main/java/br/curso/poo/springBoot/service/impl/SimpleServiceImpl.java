package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.service.SimpleService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Override
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}