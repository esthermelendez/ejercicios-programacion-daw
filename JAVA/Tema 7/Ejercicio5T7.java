public class Ejercicio5T7 {
  public static void main(String[] args) {
  
    int maximo = 0;
    int minimo = 1000;
    
    int[] num; 
    num = new int[10];
    
    int i;
    
    System.out.println("Introduce 10 números: ");
    
    for (i = 0; i<10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    for (i = 0; i<10; i++) {

      if (maximo < num[i]) {
        maximo = num[i];
      }
      if (minimo > num[i] ) {
        minimo = num[i];
      }
    }
    
    for (i = 0; i<10; i++) {
      System.out.println(num[i]);
      
      if (maximo == num[i]) {
        
        System.out.println(maximo + ":" + "max");
      }
      
      if (minimo == num[i]) {
        
        System.out.println(minimo +":" + "min");
      }
    }
  }
}
  
    
