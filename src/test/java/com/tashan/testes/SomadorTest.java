package com.tashan.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomadorTest {
  @Test
  void testaSomaZero() {
    Somador somador = new Somador();
    int resEsp = 0 + 2;
    Assertions.assertEquals(resEsp, somador.calcula(0, 2));
  }
}
