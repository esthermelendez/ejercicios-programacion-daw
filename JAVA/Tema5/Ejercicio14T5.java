/**
* Escribe un programa que pida una base y un exponente (entero positivo) y
  que calcule la potencia.
*
* @author Esther Melendez
*/

public class Ejercicio14T5 {
  public static void main(String[] args) {
    
    System.out.println("Introduce el número base: ");
    int base= Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el número exponente: ");
    int exponente= Integer.parseInt(System.console().readLine());
    
    int potencia= (base * base);
    int i;
    if (exponente == 0) {
      potencia = 1;
      System.out.println("El resultado es: " + potencia);
    }
    
    if (exponente == 1) {
      potencia = base;
    }
    
    if (exponente > 1){
      for ( i=2; i<exponente; i++){
        potencia= (potencia + base);
        System.out.println("El resultado es: ");
      }
    }
    System.out.println("El resultado es: " + (potencia + base));
  }
}
      
      
