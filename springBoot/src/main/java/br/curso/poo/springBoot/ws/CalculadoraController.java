package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.service.CalculadoraService;
import br.curso.poo.springBoot.utils.ResultadoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @RequestMapping("soma")
    public double soma(double n1, double n2) {
        double resultado = calculadoraService.soma(n1, n2);
        ResultadoUtils.resultados.add(String.format("%f + %f = %f", n1, n2, resultado));
        return resultado;
    }

    @RequestMapping("subtracao")
    public double subtracao(double n1, double n2) {
        double resultado = calculadoraService.subtracao(n1, n2);
        ResultadoUtils.resultados.add(String.format("%f - %f = %f", n1, n2, resultado));
        return resultado;
    }

    @RequestMapping("divisao")
    public double divisao(double n1, double n2) {
        double resultado = calculadoraService.divisao(n1, n2);
        ResultadoUtils.resultados.add(String.format("%f / %f = %f", n1, n2, resultado));
        return resultado;
    }

    @RequestMapping("multiplicacao")
    public double multiplicacao(double n1, double n2) {
        double resultado = calculadoraService.multiplicacao(n1, n2);
        ResultadoUtils.resultados.add(String.format("%f * %f = %f", n1, n2, resultado));
        return resultado;
    }

    @RequestMapping("historico")
    public List<String> historico() {
        return ResultadoUtils.resultados;
    }
}
