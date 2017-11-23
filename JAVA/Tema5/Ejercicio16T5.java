/**
* Escribe un programa que diga si un número introducido por teclado es o no
  primo. Un número primo es aquel que sólo es divisible entre él mismo y la
  unidad.

* @author Esther Melendez
*/

public class Ejercicio16T5 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el numero deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    int i = 2;
    boolean esPrimo = true;
    
    while (i < numero) {
      if (numero % i == 0) {
        esPrimo = false;
      }
      i++;
    }
    
    
    if (esPrimo) {
      System.out.print("Numero primo");
    } else {
        System.out.print("Numero no primo");
      }
    
    
  }
}
      
      
      
      
    
    
