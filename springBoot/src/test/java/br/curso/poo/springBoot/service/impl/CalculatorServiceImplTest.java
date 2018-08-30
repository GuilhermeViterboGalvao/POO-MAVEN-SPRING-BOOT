package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.CalculatorException;
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
    public void teste___soma_n1_igual_2_e_n2_igual_3___SUCCESS() throws CalculatorException {
        doNothing().when(historyService).add(any(CalculatorResponseDTO.class));
        CalculatorResponseDTO dto = calculadoraServiceImpl.sum(1, 3);
        assertTrue(Double.parseDouble(dto.getResult()) == 4d);
    }

    @Test
    public void teste___subtracao_n1_igual_5_e_n2_igual_4___SUCCESS() throws CalculatorException {
        doNothing().when(historyService).add(any(CalculatorResponseDTO.class));
        CalculatorResponseDTO dto = calculadoraServiceImpl.subtraction(5, 4);
        assertTrue(Double.parseDouble(dto.getResult()) == 1d);
    }

    @Test
    public void teste___divisao_n1_igual_10_e_n2_igual_2___SUCCESS() throws CalculatorException {
        doNothing().when(historyService).add(any(CalculatorResponseDTO.class));
        CalculatorResponseDTO dto = calculadoraServiceImpl.division(10, 2);
        assertTrue(Double.parseDouble(dto.getResult()) == 5d);
    }

    @Test
    public void teste___multiplicacao_n1_igual_3_e_n2_igual_3___SUCCESS() throws CalculatorException {
        doNothing().when(historyService).add(any(CalculatorResponseDTO.class));
        CalculatorResponseDTO dto = calculadoraServiceImpl.multiplication(3, 3);
        assertTrue(Double.parseDouble(dto.getResult()) == 9d);
    }
}