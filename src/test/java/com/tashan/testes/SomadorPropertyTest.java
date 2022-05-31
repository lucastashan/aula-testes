package com.tashan.testes;

import org.junit.jupiter.api.Assertions;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class SomadorPropertyTest {
  @Property
  void testSoma(@ForAll @IntRange(min = 0) int value1,
                @ForAll @IntRange(min = 0) int value2 ){
    Somador somador = new Somador();
    int resEsp = value1 + value2;
    Assertions.assertEquals(resEsp, somador.calcula(value1, value2));
  }
}
