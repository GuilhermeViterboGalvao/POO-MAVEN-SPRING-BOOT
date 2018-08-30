package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.CalculatorService;
import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.CalculatorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private static final String SUM = "+";
    private static final String SUBTRACTION = "-";
    private static final String DIVISION = "/";
    private static final String MULTIPLICATION = "*";

    @Autowired
    private HistoryService historyService;

    @Override
    public CalculatorResponseDTO sum(double n1, double n2) {
        return execute(n1, n2, SUM);
    }

    @Override
    public CalculatorResponseDTO subtraction(double n1, double n2) {
        return execute(n1, n2, SUBTRACTION);
    }

    @Override
    public CalculatorResponseDTO division(double n1, double n2) {
        return execute(n1, n2, DIVISION);
    }

    @Override
    public CalculatorResponseDTO multiplication(double n1, double n2) {
        return execute(n1, n2, MULTIPLICATION);
    }

    private CalculatorResponseDTO execute(double n1, double n2, String operation) {
        CalculatorResponseDTO dto = null;
        if (operation.equals(SUM)) {
            double result = n1 + n2;
            dto = new CalculatorResponseDTO(
                String.valueOf(n1),
                String.valueOf(n2),
                SUM,
                String.valueOf(result)
            );
        } else if (operation.equals(SUBTRACTION)) {
            double result = n1 - n2;
            dto = new CalculatorResponseDTO(
                String.valueOf(n1),
                String.valueOf(n2),
                SUBTRACTION,
                String.valueOf(result)
            );
        } else if (operation.equals(DIVISION)) {
            double result = n1 / n2;
            dto = new CalculatorResponseDTO(
                String.valueOf(n1),
                String.valueOf(n2),
                DIVISION,
                String.valueOf(result)
            );
        } else if (operation.equals(MULTIPLICATION)) {
            double result = n1 * n2;
            dto = new CalculatorResponseDTO(
                String.valueOf(n1),
                String.valueOf(n2),
                    MULTIPLICATION,
                String.valueOf(result)
            );
        }
        if (dto != null) {
            try {
                historyService.add(dto);
            } catch (CalculatorException e) {
                e.printStackTrace();
            }
        }
        return dto;
    }
}
