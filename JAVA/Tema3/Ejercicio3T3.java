public class Ejercicio3T3 {
  public static void main(String[] args) {
    String linea;
     
    System.out.print("Por favor, introduce el número de euros: ");
    int pesetas = Integer.parseInt( System.console().readLine() );
    
    System.out.print(+ pesetas + " pesetas son " + (pesetas/166.386) + " euros.");
  }
}
