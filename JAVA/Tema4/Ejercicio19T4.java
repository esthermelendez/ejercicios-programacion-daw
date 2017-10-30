/**
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
  puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

*
* @author Esther Melendez
*/
public class Ejercicio19T4 {
  public static void main(String[] args) {
    
    long numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ((numero >-10) && (numero <10)) {
    
      System.out.print("El número tiene 1 cifra");
    }
    
    if ((numero >=10) && (numero <100)) {
      System.out.print("El número tiene 2 cifras");
    }
    
    if ((numero >=100) && (numero <1000)) {
      System.out.print("El numero tiene 3 cifras");
    }
    
    if ((numero >=1000) && (numero <10000)) {
      System.out.print("El numero tiene 4 cifras");
    } 
    
    if ((numero >=10000) && (numero <=99999)) {
      System.out.print("El número tiene 5 cifras");
    }
    
    if (numero >99999) {
      System.out.print("No se puede realizar la operación");
    }
    
    if ((numero <=-100) && (numero >-1000)) {
      System.out.print("El numero tiene 3 cifras");
    }
    
    if ((numero <=-1000) && (numero >-10000)) {
      System.out.print("El numero tiene 4 cifras");
    } 
    
    if ((numero <=-10000) && (numero >=-99999)) {
      System.out.print("El número tiene 5 cifras");
    }
    
    if (numero <-99999)  {
      System.out.print("No es posible realizar la operación");
    }
    
      
  }
}
