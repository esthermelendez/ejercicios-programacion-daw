public class Ejercicio9T7 {
  public static void main(String[] args) {
    
    
    int[] num; 
    num = new int[8];
    
    int i;
    
    int par = 0;
    int impar = 0;
    
    System.out.println("Introduce 8 números: ");
    
    for (i = 0; i<8; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    for (i = 0; i<8; i++) {

      if ((num[i] % 2) == 0) {
         par = num[i] ;
         System.out.println(par + ":" + "par");
      }
      
      if (num[i] % 2 != 0 ) {
         impar = num[i];
        System.out.println(impar +":" + "impar");
      }
    }
  }
}
