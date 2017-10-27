/**
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0).


*
* @author Esther
*/

public class Ejercicio5T4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el valor a del modelo de ecuación ax+b=0: ");
    double valor1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor b del modelo de ecuación ax+b=0: ");
    double valor2 = Double.parseDouble(System.console().readLine());
    
    if(valor1 ==0){
    System.out.println ( "Error.");
    }
    
    else{
    System.out.println ( "El resultado de tu ecuación es: " + (-valor1/valor2));
    }
  }
}
