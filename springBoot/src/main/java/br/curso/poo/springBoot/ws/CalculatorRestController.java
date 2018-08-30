package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.service.CalculatorService;
import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.HistoryException;
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
    public double soma(double n1, double n2) {
        return calculatorService.soma(n1, n2);
    }

    @RequestMapping("subtraction")
    public double subtracao(double n1, double n2) {
        return calculatorService.subtracao(n1, n2);
    }

    @RequestMapping("division")
    public double divisao(double n1, double n2) {
        return calculatorService.divisao(n1, n2);
    }

    @RequestMapping("multiplication")
    public double multiplicacao(double n1, double n2) {
        return calculatorService.multiplicacao(n1, n2);
    }

    @RequestMapping("history")
    public List<String> historico() {
        return historyService.getHistory();
    }
}
