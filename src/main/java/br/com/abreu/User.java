package br.com.abreu;

public class User {

  private double salario;
  private String nome;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void reajustar(int nota){
    if (nota > 8){
      this.salario = salario * 1.50;
    }else {
      this.salario = salario * 1.10;
    }
  }

}