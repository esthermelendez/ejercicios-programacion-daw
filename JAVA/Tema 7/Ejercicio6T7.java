public class Ejercicio6T7 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[15];
    
    int i = 0;
    
    System.out.println("Introduce 15 números: ");
    
    for (i = 14; i > -1; i--) {
      
      num[i] = Integer.parseInt(System.console().readLine());
      
    }
    
    System.out.println();
    
    for (i = 0; i<15; i++) {
      System.out.println(num[i]);
    }
  }
}
