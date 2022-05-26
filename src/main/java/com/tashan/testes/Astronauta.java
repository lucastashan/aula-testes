package com.tashan.testes;

public class Astronauta {

  private static boolean entre(float valor, float min, float max) {
    if (valor < min || valor > max) {
      return false;
    } else {
      return true;
    }
  }

  public static boolean autoriza(float peso, float altura, float tempoEscadas){
    if(entre(peso, 50, 101)) {
      if(entre(altura, 1.52f, 1.93f)) {
        if(entre(tempoEscadas, 0, 80))
          return true;
      }
    }
    return false;
  }
}
