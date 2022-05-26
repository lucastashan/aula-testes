package com.tashan.testes;

public class Imposto {
  public static final int limite1 = 70000;
  public static final int limite2 = 120000;

  private static boolean entre(int valor, int min, int max) {
    if (valor < min || valor > max) {
      return false;
    } else {
      return true;
    }
  }

  public static float calculaImposto(int valorDoveiculo) throws IllegalArgumentException {
    if (valorDoveiculo <= 0) 
      throw new IllegalArgumentException("ILLEGAL_ARGUMENT_EXCEPTION");
    if (entre(valorDoveiculo, 0, limite1)) {
      return valorDoveiculo * 0.03F;
    }
    if (entre(valorDoveiculo, limite1 + 1, limite2)) {
      return valorDoveiculo * 0.04F;
    }
    return valorDoveiculo * 0.05F;
  }
}
