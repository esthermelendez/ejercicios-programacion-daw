public class Ejercicio9T6 {
  public static void main(String[] args) {
    
    int num1 =0;
    int contadorPar = 0;
    do {
        num1 = ((int)(Math.random()*100) + 1);
        if (num1 % 2 == 0) {
          System.out.print(num1+ " ");
          contadorPar++;
        }
    }while(num1 !=24);
    
    System.out.println();
    System.out.print("Numeros totales: " + contadorPar++);
     
  }
}
    
    
