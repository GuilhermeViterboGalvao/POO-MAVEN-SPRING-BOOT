package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.service.CalculadoraService;
import org.springframework.stereotype.Controller;

@Controller
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double divisao(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }
}
