public class Ejercicio11T7 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[10];
    
    int contadorPrimo = 0;
    int contadorNP = 0;
    
    boolean esPrimo = true;
    
    System.out.println("Introduce 10 números: ");
    
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
      esPrimo = true;
      
      for (int j = 2; j < num[i]; j++) {
        if (num[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        contadorPrimo++;
      } else {
        contadorNP++;
      }
    }
    
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i]+ " ");
    }
    
    int[] primo; 
    primo = new int[contadorPrimo];
    
    int[] noPrimo; 
    noPrimo = new int[contadorNP];
    
    int indice = 0;
    int indiceNP = 0;
    
    for (int i = 0; i < num.length; i++) {
      esPrimo = true;
      for (int j = 2; j < num[i]; j++) {
        if (num[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        primo[indice] = num[i];
        indice++;
      } else {
        noPrimo[indiceNP] = num[i];
        indiceNP++;
      }
    }
    
    System.out.println();
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
    
    
    System.out.println();
    
    for (int i = 0; i < contadorPrimo; i++) {
      System.out.print(primo[i]+ " ");
    }
    
    for (int i = 0; i < contadorNP; i++) {
      System.out.print(noPrimo[i]+ " ");
    }
  }
}
