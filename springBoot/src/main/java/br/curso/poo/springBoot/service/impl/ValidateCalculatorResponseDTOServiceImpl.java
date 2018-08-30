package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.ValidateCalculatorResponseDTOService;
import br.curso.poo.springBoot.service.exception.CalculatorException;
import org.springframework.stereotype.Service;

@Service
public class ValidateCalculatorResponseDTOServiceImpl implements ValidateCalculatorResponseDTOService {

    @Override
    public void validate(CalculatorResponseDTO dto) throws CalculatorException {
        if (dto == null) {
            throw  new CalculatorException("DTO is null");
        } else {
            if (dto.getN1() == null || dto.getN1().isEmpty()) {
                throw  new CalculatorException("DTO 'N1' property is null or empty.");
            } else if (dto.getN2() == null || dto.getN2().isEmpty()) {
                throw  new CalculatorException("DTO 'N2' property is null or empty.");
            } else if (dto.getOperation() == null || dto.getOperation().isEmpty()) {
                throw  new CalculatorException("DTO 'operation' property is null or empty.");
            } else if (dto.getResult() == null || dto.getOperation().isEmpty()) {
                throw  new CalculatorException("DTO 'result' property is null or empty.");
            }
        }

    }
}
