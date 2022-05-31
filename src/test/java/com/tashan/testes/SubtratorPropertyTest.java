package com.tashan.testes;

import org.junit.jupiter.api.Assertions;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class SubtratorPropertyTest {
  @Property
  void testSubtracao(@ForAll @IntRange(min = 0) int value1,
                @ForAll @IntRange(min = 0) int value2 ){
    Subtrator sub = new Subtrator();
    int resEsp = value1 - value2;
    Assertions.assertEquals(resEsp, sub.calcula(value1, value2));
  }
}
