package br.curso.poo.springBoot.service;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.exception.CalculatorException;

public interface ValidateCalculatorResponseDTOService {

    void validate(CalculatorResponseDTO dto) throws CalculatorException;
}