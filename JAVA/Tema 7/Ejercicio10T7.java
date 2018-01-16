public class Ejercicio10T7 {
  public static void main(String[] args) {
    
    int i = 0;
    
    int contadorPar = 0;
    int contadorImpar = 0;
    
    
    int[] num; 
    num = new int[20];
    
    
    for (i = 0; i < 20; i++) {
      num[i] = ((int)(Math.random()*100 + 0));
      
      if ((num[i] % 2) == 0) {
        contadorPar++; 
      }
      
      if ((num[i] % 2) != 0) {
        contadorImpar++;
      }
    }
    
    int[] par; 
    par = new int[contadorPar];
    
    int[] impar; 
    impar = new int[contadorImpar];
    
    int contadorPar1 = 0;
    int contadorImpar1 = 0;
    i = 0;
    
    do {
      if ((num[i] % 2) == 0) {
        par[contadorPar1] = num[i];
        contadorPar1++; 
      }
      i++;
    } while (contadorPar1 < contadorPar);
    
    i = 0;
    
    do {
     if ((num[i] % 2) != 0) {
        impar[contadorImpar1] = num[i]; 
        contadorImpar1++;
      }
      i++;
    } while (contadorImpar1 < contadorImpar);
    
    for (int e = 0; e < contadorPar; e++) {
      System.out.print(par[e] + " ");
    }
    
    for (int s = 0; s < contadorImpar; s++) {
      System.out.print(impar[s] + " ");
    }
    
  }
}
