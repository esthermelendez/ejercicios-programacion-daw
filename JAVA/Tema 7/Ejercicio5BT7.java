public class Ejercicio5BT7 {
  public static void main(String[] args)
    throws InterruptedException {
    
    int[][] n = new int[6][10];
    
    int maximo = 0;
    int minimo = 1000;
    int fila;
    int columna;
    
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        n[fila][columna] =  (int)(Math.random()*1001 + 0);
        if (maximo < n[fila][columna]) {
          maximo = n[fila][columna];
        }
        if (n[fila][columna] < minimo) {
          minimo = n[fila][columna];
        }
      }
      columna = 0;
    }
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("Fila: " + fila);
      
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        
      }
      
      System.out.println();
      
    }
    
    System.out.println();
    System.out.println("Máximo = " + maximo);
    System.out.println("Mínimo = " + minimo);
  }
}
