package com.tashan.testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
  @Test
  void testCalculadoraSoma(){
    Somador somador = mock(Somador.class);
    Subtrator subtrator = null;
    when(somador.calcula(0, 2)).thenReturn(2);
    when(somador.calcula(2, 3)).thenReturn(5);
    when(somador.calcula(5, 4)).thenReturn(9);
    Calculadora calc = new Calculadora(somador, subtrator);
    int valEsp = 2 + 3 + 4;
    calc.calcula("2+3+4");
    Assertions.assertEquals(valEsp, calc.getResultado());
  }

  @Test
  void testCalculadoraSub() {
    Somador somador = mock(Somador.class);
    Subtrator subtrator = mock(Subtrator.class);
    when(somador.calcula(0, 9)).thenReturn(9);
    when(subtrator.calcula(9, 4)).thenReturn(5);  
    when(subtrator.calcula(5, 3)).thenReturn(2);
    Calculadora calc = new Calculadora(somador, subtrator); 
    int valEsp = 9 - 4 - 3;
    calc.calcula("9-4-3");
    Assertions.assertEquals(valEsp, calc.getResultado());
  }

  @Test
  void testCalculadora() {
    Somador somador = mock(Somador.class);
    Subtrator subtrator = mock(Subtrator.class);
    when(somador.calcula(0, 5)).thenReturn(5);
    when(somador.calcula(5, 4)).thenReturn(9);  
    when(subtrator.calcula(9, 7)).thenReturn(2);
    Calculadora calc = new Calculadora(somador, subtrator); 
    int valEsp = 5 + 4 - 7;
    calc.calcula("5+4-7");
    Assertions.assertEquals(valEsp, calc.getResultado());
  }
}
