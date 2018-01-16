public class EjercicioDAM {
  public static void main(String[] args) {
    
    boolean esPrimo = true;
    int j = 0;
    
    for (int i = 0; i <20; i++) {
      esPrimo = true;
      
      int num1 = ((int)(Math.random()*98) + 2);
      
      if (num1 % j == 0) {
          esPrimo = false;
      } else {
        System.out.print(num1);
      }
      j++;
    }
  }
}
