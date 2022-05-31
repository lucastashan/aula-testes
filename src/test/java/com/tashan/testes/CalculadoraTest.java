package com.tashan.testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
  @Test
  void testCalculadora(){
    Somador somador = mock(Somador.class);
    Subtrator subtrator = mock(Subtrator.class);
    when(somador.calcula(2, 3)).thenReturn(5);
    when(subtrator.calcula(5, 4)).thenReturn(1);
    Calculadora calc = new Calculadora(somador, subtrator);
    int valEsp = somador.calcula(2, 3) + 
      subtrator.calcula(5, 4);
    calc.calcula("5+3+5-4");
    Assertions.assertEquals(valEsp, calc.getResultado());
  }
}
