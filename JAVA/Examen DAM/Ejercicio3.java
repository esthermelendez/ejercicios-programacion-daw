public class Ejercicio3 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[15];
    
    int i=0;
    
    for (i = 0; i < 15; i++) {
      num[i] = ((int)(Math.random()*501) + 0);
      System.out.print(num[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    
    int[] array2; 
    array2 = new int[15];

    
    for (i = 0; i < 15; i++) {
      if (num[i] % 5 == 0) {
        array2[i] = num[i];
      } else {
        array2[i] = num[i] - (num[i] % 5) + 5;
      }
    }
    
    for (i = 0; i < 15; i++) {
      System.out.print (array2[i] + " ");
    }
  }
}
