public class Ejercicio3T7 {
  public static void main(String[] args) {

    System.out.println("Introduce 10 números: ");
    
    int[] num; 
    num = new int[10];
    
    for (int i = 0; i<10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
      System.out.print("");
    }
    
    for (int i= 0; i<10; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
    
