package com.tashan.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomadorIntegrationTest {
  @Test
  void calculadoraSomadorTeste() {
    Somador somador = new Somador();
    Subtrator subtrator = null;
    Calculadora calculadora = new Calculadora(somador, subtrator);
    int valEsp = 2 + 3 + 4;
    calculadora.calcula("2+3+4");
    Assertions.assertEquals(valEsp, calculadora.getResultado());
  }

  @Test
  void calculadoraSubtratorTeste() {
    Somador somador = new Somador();
    Subtrator subtrator = new Subtrator();
    Calculadora calculadora = new Calculadora(somador, subtrator);
    int valEsp = 9 - 4 - 3;
    calculadora.calcula("9-4-3");
    Assertions.assertEquals(valEsp, calculadora.getResultado());
  }

  @Test
  void calculadoraTeste() {
    Somador somador = new Somador();
    Subtrator subtrator = new Subtrator();
    Calculadora calculadora = new Calculadora(somador, subtrator);
    int valEsp = 2 + 3 - 1;
    calculadora.calcula("2+3-1");
    Assertions.assertEquals(valEsp, calculadora.getResultado());
  }
}
