package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.service.CalculatorService;
import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.HistoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private HistoryService historyService;

    @Override
    public double soma(double n1, double n2) {
        double result = n1 + n2;
        try {
            historyService.add(String.format("%f + %f = %f", n1, n2, result));
        } catch (HistoryException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public double subtracao(double n1, double n2) {
        double result = n1 - n2;
        try {
            historyService.add(String.format("%f - %f = %f", n1, n2, result));
        } catch (HistoryException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public double divisao(double n1, double n2) {
        double result = n1 / n2;
        try {
            historyService.add(String.format("%f / %f = %f", n1, n2, result));
        } catch (HistoryException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public double multiplicacao(double n1, double n2) {
        double result = n1 * n2;
        try {
            historyService.add(String.format("%f * %f = %f", n1, n2, result));
        } catch (HistoryException e) {
            e.printStackTrace();
        }
        return result;
    }
}
