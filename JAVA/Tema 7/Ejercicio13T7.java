public class Ejercicio13T7 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[100];
    
    int i = 0;
    
    int maximo = 0;
    int minimo = 1000;
    
    for (i = 0; i < 100; i++) {
      num[i] = ((int)(Math.random()*501) + 0);
      System.out.print(num[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (opcion == 1) {
      for (i = 0;i < 100; i++) {
        if (maximo < num[i]) {
          maximo = num[i];
        } 
      }
    }
    
    if (opcion == 2) {
      for (i = 0; i < 100; i++) {
        if (minimo > num[i] ) {
          minimo = num[i];
          
        } 
      }
    }
    
    if (opcion == 1) {
      for (i = 0; i < 100; i++) {
        if (maximo == num[i]) {
          System.out.print("**" + maximo + "**");
        } else {
          System.out.print(num[i] + " ");
        }
      }
    }
    
    if (opcion == 2) {
      for (i = 0; i < 100; i++) {
        if (maximo == num[i]) {
          System.out.print("**" + minimo + "**");
        } else {
          System.out.print(num[i] + " ");
        }
      }
    }
  }
}


