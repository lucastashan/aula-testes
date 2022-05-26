package com.tashan.testes;

import org.junit.jupiter.api.Assertions;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

public class FizzBuzzPropertyTest {
  @Property
  void testFizz(@ForAll("makeFizz") int value) {
    String expected = "fizz!";
    Assertions.assertEquals(expected, FizzBuzz.make(value));
  }

  @Provide
  private Arbitrary<Integer> makeFizz() {
    return Arbitraries.integers().between(1, 1000000).
      filter(i -> i % 3 == 0 && i % 5 != 0);
  }

  @Property
  void testBuzz(@ForAll("makeBuzz") int value) {
    String expected = "buzz!";
    Assertions.assertEquals(expected, FizzBuzz.make(value));
  }

  @Provide
  private Arbitrary<Integer> makeBuzz() {
    return Arbitraries.integers().between(1, 1000000).
      filter(i -> i % 5 == 0 && i % 3 != 0);
  }

  @Property
  void testFizzBuzz(@ForAll("makeFizzBuzz") int value) {
    String expected = "fizzbuzz!";
    Assertions.assertEquals(expected, FizzBuzz.make(value));
  }

  @Provide
  private Arbitrary<Integer> makeFizzBuzz() {
    return Arbitraries.integers().between(1, 1000000).
      filter(i -> i % 5 == 0 && i % 3 == 0);
  }
}
