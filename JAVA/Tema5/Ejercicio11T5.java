/**
* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
  los 5 primeros números enteros a partir de uno que se introduce por teclado
*
* @author Esther Melendez
*/

public class Ejercicio11T5 {
  public static void main(String[] args) {

    System.out.print("Introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int contador = 0;
    
    do {
      System.out.println("Numero" + "       Numero (2)  " + "          Numero (3)");
      System.out.println(numero + "                   " + numero * numero + "                  " + numero * numero * numero);
      numero++;
      contador++;
      
    } while ( contador < 5 );
  }
}
  

 
