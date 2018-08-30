package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.ValidateCalculatorResponseDTOService;
import br.curso.poo.springBoot.service.exception.CalculatorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private ValidateCalculatorResponseDTOService validateCalculatorResponseDTOService;

    @Override
    public void add(CalculatorResponseDTO dto) throws CalculatorException {
        validateCalculatorResponseDTOService.validate(dto);
        DB.add(dto);
    }

    @Override
    public void remove(CalculatorResponseDTO dto) throws CalculatorException {
        validateCalculatorResponseDTOService.validate(dto);
        DB.remove(dto);
    }

    @Override
    public List<CalculatorResponseDTO> getHistory() {
        return DB;
    }
}
