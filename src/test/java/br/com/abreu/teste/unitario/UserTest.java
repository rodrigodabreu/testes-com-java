package br.com.abreu.teste.unitario;

import br.com.abreu.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

  private User user;

  @BeforeEach
  //Antes de cada teste, execute esse método - com isso acaba a obrigação de se escrever em cada cenário toda a construção do usuário
  public void createUser() {
    user = new User();
    user.setSalario(1000d);
    user.setNome("Rodrigo");
  }

  @AfterEach //Após cada teste
  public void afterEach() {
    System.out.println("after each");
  }

  @BeforeAll //Antes de todos os testes
  public static void beforeAll() {
    System.out.println("before All");
  }

  @AfterAll //Após todos os testes
  public static void afterAll() {
    System.out.println("After All");
  }


  @Test
  void dadoUmUsuarioComNotaAcimaDeOitoEntaoDeveAjustarOSalario() {
    //given
    // Essa condição de set de dados já está sendo setada no @BeforeEach
    double esperado = 1500d;

    //when
    user.reajustar(9);
    double resultado = user.getSalario();

    //then
    Assertions.assertEquals(esperado, resultado);

  }

  @Test
  void dadoUmUsuarioComNotaAbaixoDeOitoEntaoDeveAjustarOSalario() {
    //given
    // Essa condição de set de dados já está sendo setada no @BeforeEach
    double esperado = 1100d;

    //when
    user.reajustar(5);
    double resultado = user.getSalario();

    //then
    Assertions.assertEquals(esperado, resultado);

  }

}