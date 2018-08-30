package br.curso.poo.springBoot.service;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;

public interface CalculatorService {

    CalculatorResponseDTO sum(double n1, double n2);

    CalculatorResponseDTO subtraction(double n1, double n2);

    CalculatorResponseDTO division(double n1, double n2);

    CalculatorResponseDTO multiplication(double n1, double n2);
}
