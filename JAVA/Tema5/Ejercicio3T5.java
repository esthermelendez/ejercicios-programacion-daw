/**
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
*
* @author Esther Melendez
*/

public class Ejercicio3T5 {
  public static void main(String[] args) {
    
    int numero=0;

    do {
      System.out.println(numero);
      
      numero+=5;
    
    } while((numero>=0) && (numero<=100));
  }
}
