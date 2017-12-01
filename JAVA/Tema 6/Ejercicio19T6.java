public class Ejercicio19T6 {
  public static void main(String[] args) {
    
    int maximo = 0;
    int minimo = 1000;
    int suma = 0;
    int contadorNum = 0;
    
    for (int i= 0; i<50; i++) {
      
      int num1=((int)(Math.random() *301) + (-100));
      contadorNum++;
      suma = suma + num1;
      
      System.out.print(num1 + " ");
      
      if (num1 % 2 == 0) {
        if (maximo < num1) {
          maximo = num1;
        }
      }
      
      if (num1 % 2 != 0) {
        if (num1 < minimo) {
          minimo = num1;
        }
      }
        
    }
    
    int media = suma / contadorNum;
    System.out.println("");
    System.out.println("La media es: " + media);
    System.out.println("El maximo de los pares es: " + maximo);
    System.out.println("El minimo de los impares es: " + minimo);
  }
}
