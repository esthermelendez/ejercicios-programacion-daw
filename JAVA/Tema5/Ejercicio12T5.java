/**
* Escribe un programa que muestre los n primeros términos de la serie de
  Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
  y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
  los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
  debe introducir por teclado
*
* @author Esther Melendez
*/

public class Ejercicio12T5 {
  public static void main(String[] args) {
      
      System.out.print("Introduzca el numero deseado: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      
      int a = 0;
      int b = 1;
      int c = a + b;
      int contador;
      
      if (numero == 1) {
        System.out.println(0);
      }
      
      if (numero ==2) {
        System.out.print(0+" "+1);
      }
      
      if (numero >2)
        System.out.println(0);
        System.out.println(1);
        for (contador = numero-2; contador > 0; contador--) {
          System.out.println(c);
          a = b;
          b = c;
          c= a + b;
          
        
      }
  }
} 
      
      
      
