package br.com.abreu.teste.unitario;

import br.com.abreu.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void somaDoisNumeros(){
    //given
    Calculadora calculadora = new Calculadora();

    //when
    int resultado = calculadora.soma(10, 20);

    //then
    Assertions.assertEquals(30, resultado);
  }

  @Test
  void divideDoisNumeros(){
    //given
    Calculadora calculadora = new Calculadora();

    //when
    int resultado = calculadora.divide(20, 10);

    //then
    Assertions.assertEquals(2, resultado);
  }

  @Test
  void verificaSeONumeroDoisEhPar(){
    //given
    Calculadora calculadora = new Calculadora();

    //when
    boolean resultado = calculadora.verificaPar(2);

    //then
    Assertions.assertTrue(resultado);
  }

  @Test
  void verificarSeTresEhPar(){
    //given
    Calculadora calculadora = new Calculadora();

    //when
    boolean resultado = calculadora.verificaPar(3);

    //then
    Assertions.assertFalse(resultado);
  }

}