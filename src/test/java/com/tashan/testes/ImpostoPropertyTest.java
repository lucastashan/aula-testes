package com.tashan.testes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class ImpostoPropertyTest {
  @Property
  void lessThenSeventyK(@ForAll @IntRange(min = 1, max = 70000) int value){
    float imposto = value * 0.03f;
    Assertions.assertEquals(imposto , Imposto.calculaImposto(value));
  }

  @Property
  void lessThenOneHundredAndTwentyK(@ForAll @IntRange(min = 70001, max = 120000) int value){
    float imposto = value * 0.04f;
    Assertions.assertEquals(imposto , Imposto.calculaImposto(value));
  }

  @Property
  void aboveThenOneHundredAndTwentyK(@ForAll @IntRange(min = 120001) int value){
    float imposto = value * 0.05f;
    Assertions.assertEquals(imposto ,Imposto.calculaImposto(value) );
  }

  @Property
  void invalid(@ForAll @IntRange(min = -100000, max = -1) int value){
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
       Imposto.calculaImposto(value);
    });

    String expectedMessage = "ILLEGAL_ARGUMENT_EXCEPTION";
    String actualMessage = exception.getMessage();

    Assertions.assertEquals(expectedMessage, actualMessage);
  }
}
