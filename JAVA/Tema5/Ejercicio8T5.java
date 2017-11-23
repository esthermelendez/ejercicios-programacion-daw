/**
* Muestra la tabla de multiplicar de un número introducido por teclado.
*
* @author Esther Melendez
*/

public class Ejercicio8T5 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el número deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    int contador = 0;
    
    do {
      System.out.println(numero + " x " + contador + "=" + (numero * contador));
      contador++;
    } while (contador < 11);
  }
}
