/**
* Escribe un programa que diga cuál es la última cifra de un número entero
  introducido por teclado.
*
* @author Esther Melendez
*/
public class Ejercicio17T4 {
  public static void main(String[] args) {
    
    System.out.print("Introducza el número entero deseado: ");
    
    double numero = Double.parseDouble(System.console().readLine());
    
    if (numero % 1 == 0) {
      System.out.println("La última cifra del número introducido es: " + ((int)(numero % 10)));
    
    } 
    
    else if (numero % 1 != 0) { 
        System.out.println("El número introducido no es entero.");
      }
    
  }
}
