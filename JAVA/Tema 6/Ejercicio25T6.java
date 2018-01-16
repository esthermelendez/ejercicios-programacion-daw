public class Ejercicio25T6 {
  public static void main(String[] args) {
    
    int num1 = 0;
    int i = 2;
    boolean esPrimo = true;
    
    for (int j = 0 ; j<100; j++) {
      num1 = ((int)(Math.random()*190) + 10);
      esPrimo = true;
      i = 2;
      while (i < num1) {
        if (num1 % i == 0) {
          esPrimo = false;
        }
        i++;
      }
      
      if (esPrimo) {
        System.out.print(" " + "#" + num1 + "#" + " ");
      }
      
      if (num1 % 5 == 0) {
        System.out.print(" " + "[" + num1 + "]" + " ");
      }
      
      if ((num1 % 5 != 0) && (esPrimo == false)) {
         System.out.print(" " + num1 + " ");
      }
    }
  }
}
      
        
       
      
      
