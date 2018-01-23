public class Ejercicio2BT7 {
  public static void main(String[] args) {
    
    int[][] n = new int[4][5];
    
    
    System.out.println("Introduce 20 números: ");
    
    int fila;
    int columna;
    int suma = 0;
    int suma2 = 0;
    int suma10 = 0;
    int aux = 0;
    
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
      columna = 0;
    }
    
    for(fila = 0; fila < 4; fila++) {
      System.out.print("Fila: " + fila);
      
      for(columna = 0; columna < 5; columna++) {
        suma = suma + n[fila][columna];
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.printf("%10d ", + suma);
      suma = 0;
      
      System.out.println();
    }
    
    System.out.print("SF    : ");
    for (columna = 0; columna < 5; columna++) {
      
      for(fila = 0; fila < 4; fila++) {
        suma10 = suma10 + n[fila][columna];
      }
      System.out.printf("%10d ", suma10);
      aux = aux + suma10;
      suma10 = 0;
    }
    
    System.out.printf("%10d ", aux);
  }
}
