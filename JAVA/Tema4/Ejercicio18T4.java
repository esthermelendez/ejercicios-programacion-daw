/**
* Escribe un programa que diga cuál es la primera cifra de un número entero
  introducido por teclado. Se permiten números de hasta 5 cifras.

*
* @author Esther Melendez
*/
public class Ejercicio18T4 {
  public static void main(String[] args) {
    
    System.out.print("Introducza el número entero deseado: ");
    
    long numero = Integer.parseInt (System.console().readLine());
    
    if ((numero >=0) && (numero <10)) {
    
      System.out.print("La primera cifra del numero es: " + numero);
    }
    
    if (numero <0) {
      System.out.print("No se puede realizar la operación");
    }
    
    
    if ((numero >=10) && (numero <100)) {
      System.out.print("La primera cifra del numero es: " + (numero/10));
    }
    
    if ((numero >=100) && (numero <1000)) {
      System.out.print("La primera cifra del numero es: " + (numero/100));
    }
    
    if ((numero >=1000) && (numero <10000)) {
      System.out.print("La primera cifra del numero es: " + (numero/1000));
    } 
    
    if ((numero >=10000) && (numero <99999))  {
      System.out.print("La primera cifra del numero es: " + (numero/10000));
    }
    
    if (numero >99999) {
      System.out.print("No se puede realizar la operación");
    }
      
  }
}
    




