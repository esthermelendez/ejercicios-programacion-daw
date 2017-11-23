/**
* Realiza un programa que nos diga cuantos digitos 
* tiene un numero introducido por teclado.

*
* @author Esther Melendez
*/

public class Ejercicio9T5 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el numero deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int contadorCifra = 0;
    
    do {
      numero = numero / 10;
      contadorCifra++;
    } while (numero != 0);
    
    System.out.print("El numero introducido tiene: " + contadorCifra + " cifras.");
  }
}
