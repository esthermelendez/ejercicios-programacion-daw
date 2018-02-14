/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

/**
 *
 * @author meloc
 */
public class Fracciones {
  private int numerador;
  private int denominador;
  
  //constructor

  public Fracciones() {
  }

  public Fracciones(int num, int den) {
    this.numerador = num;
    this.denominador = den;
  }
  
  //getter y setter

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int num) {
    this.numerador = num;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int den) {
    this.denominador = den;
  }
  
  //metodos
  
  public Fracciones invierte(int num, int den){
    this.numerador=den;
    this.denominador=num;
    return new Fracciones();
    
  }
  
  public Fracciones multiplica(int num, int den){
    this.numerador=num * num;
    this.denominador=den * den;
    return new Fracciones();
    
  }
  
  public Fracciones divide(int num, int den, int num2, int den2){
    this.numerador= num * den2;
    this.denominador=den * num2;
    return new Fracciones();
  }
  
  public Fracciones simplifica(int num, int den){
    for (int i = 2; i < Math.min(num,den); i++) {
      while (((num % i) == 0) && ((den % i) == 0)) {
        num /= i;
        den /= i;
      }
    }
    return new Fracciones();
  }
  
  @Override
  public String toString() {
    return "Fracciones{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
  }
  
  
}
