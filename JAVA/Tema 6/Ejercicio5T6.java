public class Ejercicio5T6 {
  public static void main(String[] args) {
    
    int maximo = 0;
    int minimo = 1000;
    
    for (int i = 0; i <50; i++) {
      
      int num1 = ((int)(Math.random()*99) + 100);
      System.out.print(num1 + " ");
      
      if (maximo < num1) {
        maximo = num1;
      }
      if (num1 < minimo) {
        minimo = num1;
      }
    }
    
    System.out.println();
    System.out.println("Máximo = " + maximo);
    System.out.println("Mínimo = " + minimo);
  }
}
