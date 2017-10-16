public class Ejercicio2T3 {
  public static void main(String[] args) {
    String linea;
     
    System.out.print("Por favor, introduce el número de euros: ");
    double euros = Integer.parseInt( System.console().readLine() );
    
    System.out.print(+ euros + " euros son " + (euros*166.386) + " pesetas ");
  }
}
