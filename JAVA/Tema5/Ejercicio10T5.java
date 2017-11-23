/**
* Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. A priori, el programa no sabe cuántos números se
  introducirán. El usuario indicará que ha terminado de introducir los datos
  cuando meta un número negativo.

*
* @author Esther Melendez
*/

public class Ejercicio10T5 {
  public static void main(String[] args) {
    System.out.print("Introduzca el numero deseado: ");
    int contadorPreguntas = 0;
    int numero;
    int suma = 0;
  
  do { 
      numero = Integer.parseInt(System.console().readLine());
      if (numero >=0) {
        contadorPreguntas++;
        suma = suma + numero; 
      }
    } while (numero >= 0);
  
  int mediaNota = suma / contadorPreguntas;
  System.out.print("La media es: " + mediaNota);
  
  
  }
}
    
    

