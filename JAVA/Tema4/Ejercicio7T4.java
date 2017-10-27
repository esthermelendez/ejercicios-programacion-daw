/**
* Realiza un programa que calcule la media de tres notas


*
* @author Esther
*/

public class Ejercicio7T4 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    System.out.println("La media de tus notas es: "+ (nota1+nota2+nota3)/3);
  
  }
}
    
