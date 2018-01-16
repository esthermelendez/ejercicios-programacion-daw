public class Ejercicio1 {
  public static void main(String[] args) {
    
    boolean esPrimo = true;
    int j = 2;
    int contadorPrimo = 0;
    
    int[] num1; 
    num1 = new int[20];
    
    int i = 0;
    
    
    for ( i = 0; i <20; i++) {
      
      esPrimo = true;
      
      num1[i] = ((int)(Math.random()*99) + 2);
      
      System.out.print(num1[i] + " ");
    }
    
    i= 0;
    
    for ( j = 2; j < num1[i]; j++) {
      if (num1[i] % j == 0) {
        esPrimo = false;
      } else {
        contadorPrimo++;
      }
      i++;
    }
      System.out.println();
      System.out.print(contadorPrimo + " ");
      
    
    
    int[] primo; 
    primo = new int[contadorPrimo];
    
    int indice = 0;
    i = 0;
    
    for ( j = 2; j < num1[i]; j++) {
      esPrimo = true;
      if (num1[i] % j == 0) {
        esPrimo = false;
      } 
      
      if (esPrimo) {
        primo[indice] = num1[i];
        indice++;
      }
      i++;
      
    }
    
    if (contadorPrimo == 0) {
      System.out.println("No hay primos");
    }
    
    System.out.println();
    
    if (contadorPrimo != 0) {
     System.out.print("Números primos : ");
      for (i = 0; i < contadorPrimo; i++) {
        System.out.print( primo[i]+ " ");
      }
    }
  }
}
