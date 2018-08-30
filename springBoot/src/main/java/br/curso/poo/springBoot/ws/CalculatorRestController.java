package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.CalculatorService;
import br.curso.poo.springBoot.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculator")
public class CalculatorRestController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private HistoryService historyService;

    @RequestMapping("sum")
    public CalculatorResponseDTO sum(double n1, double n2) {
        return calculatorService.sum(n1, n2);
    }

    @RequestMapping("subtraction")
    public CalculatorResponseDTO subtraction(double n1, double n2) {
        return calculatorService.subtraction(n1, n2);
    }

    @RequestMapping("division")
    public CalculatorResponseDTO division(double n1, double n2) {
        return calculatorService.division(n1, n2);
    }

    @RequestMapping("multiplication")
    public CalculatorResponseDTO multiplication(double n1, double n2) {
        return calculatorService.multiplication(n1, n2);
    }

    @RequestMapping("history")
    public List<CalculatorResponseDTO> history() {
        return historyService.getHistory();
    }
}
