public class Ejercicio4T3 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número: ");
    int primerNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.print("introduce otro, por favor: ");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.print("La suma de los dos números es: " + (primerNumero + segundoNumero));
    System.out.print("La resta de los dos números es: " + (primerNumero - segundoNumero));
    System.out.print("La división de los dos números es: " + (primerNumero / segundoNumero));
    System.out.print("La multiplicación de los dos números es: " + (primerNumero * segundoNumero));
  }
}
