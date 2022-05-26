package com.tashan.testes;

public class FizzBuzz {
  public static String make(int value) {
    if(value % 3 == 0){
      if(value % 5 == 0){
        return "fizzbuzz!";
      }
      return "fizz!";
    }
    if(value % 5 == 0){
      return "buzz!";
    }
    return "";
  }
}
