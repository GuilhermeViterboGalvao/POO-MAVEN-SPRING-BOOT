package br.curso.poo.springBoot;

import br.curso.poo.springBoot.service.impl.CalculadoraServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraServiceImplTest {

    @InjectMocks
    private CalculadoraServiceImpl calculadoraServiceImpl;

    @Mock
    private CalculadoraServiceImpl mockCalculadoraServiceImpl;

    @Test
    public void teste_soma_n1_2_n2_3_mockado() {
        when(mockCalculadoraServiceImpl.soma(anyDouble(), anyDouble())).thenReturn(3d);
        double resultado = mockCalculadoraServiceImpl.soma(1, 3);
        assertTrue(resultado == 3d);
    }

    @Test
    public void teste_soma_n1_2_n2_3() {
        double resultado = calculadoraServiceImpl.soma(1, 3);
        assertTrue(resultado == 4d);
    }
}