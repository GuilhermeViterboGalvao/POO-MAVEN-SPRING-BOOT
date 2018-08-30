package br.curso.poo.springBoot;

import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.HistoryException;
import br.curso.poo.springBoot.service.impl.CalculatorServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceImplTest {

    @InjectMocks
    private CalculatorServiceImpl calculadoraServiceImpl;

    @Mock
    private HistoryService historyService;

    @Test
    public void teste___soma_n1_igual_2_e_n2_igual_3___SUCCESS() throws HistoryException {
        doNothing().when(historyService).add(anyString());

        double resultado = calculadoraServiceImpl.soma(1, 3);

        assertTrue(resultado == 4d);
    }

    @Test
    public void teste___subtracao_n1_igual_5_e_n2_igual_4___SUCCESS() throws HistoryException {
        doNothing().when(historyService).add(anyString());

        double resultado = calculadoraServiceImpl.subtracao(5, 4);

        assertTrue(resultado == 1d);
    }

    @Test
    public void teste___divisao_n1_igual_10_e_n2_igual_2___SUCCESS() throws HistoryException {
        doNothing().when(historyService).add(anyString());

        double resultado = calculadoraServiceImpl.divisao(10, 2);

        assertTrue(resultado == 5d);
    }

    @Test
    public void teste___multiplicacao_n1_igual_3_e_n2_igual_3___SUCCESS() throws HistoryException {
        doNothing().when(historyService).add(anyString());

        double resultado = calculadoraServiceImpl.multiplicacao(3, 3);

        assertTrue(resultado == 9d);
    }
}