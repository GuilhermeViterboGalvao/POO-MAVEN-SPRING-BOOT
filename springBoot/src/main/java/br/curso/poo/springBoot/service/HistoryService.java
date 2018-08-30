package br.curso.poo.springBoot.service;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.exception.CalculatorException;

import java.util.ArrayList;
import java.util.List;

public interface HistoryService {

    List<CalculatorResponseDTO> DB = new ArrayList<>();

    void add(CalculatorResponseDTO dto) throws CalculatorException;

    void remove(CalculatorResponseDTO dto) throws CalculatorException;

    List<CalculatorResponseDTO> getHistory();
}
