public class Ejercicio42T5 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean esPrimo = true;
    
    
    
    for (int i= numero; i <= numero + 5; i++) {
      
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
      System.out.println(i+" primo");
    } else {
        System.out.println(i+" no primo");
      }
      
      esPrimo = true;
    }
  }
}
