public class Ejercicio1T3 {
  public static void main(String[] args) {
    String linea;
     
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = primerNumero * segundoNumero;
    System.out.print("La multiplicación de los dos números introducidos es " + total);
  }
}

