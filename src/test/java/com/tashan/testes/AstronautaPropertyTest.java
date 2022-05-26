package com.tashan.testes;

import org.junit.jupiter.api.Assertions;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.FloatRange;

public class AstronautaPropertyTest {
  @Property
  void autorizaSucesso(
    @ForAll @FloatRange(min= 50, max = 101, minIncluded = true, maxIncluded = true)
    float peso,
    @ForAll @FloatRange(min= 1.52f, max = 1.93f, minIncluded = true, maxIncluded = true)
    float altura,
    @ForAll @FloatRange(min= 0, max = 80, minIncluded = true, maxIncluded = false)
    float tempoEscadas
  ){
    Assertions.assertTrue(Astronauta.autoriza(peso, altura, tempoEscadas));
  }
}
