public class Ejercicio13T6 {
  public static void main(String[] args) {
    
    int resultadoDado2 = 0;
    int resultadoDado1 = 0;
    
    do {
      resultadoDado2 = ((int)(Math.random()*6) + 1);
      resultadoDado1 = ((int)(Math.random()*6) + 1);
      System.out.println("Dado1: " + resultadoDado1);
      System.out.println("Dado2: " + resultadoDado2);
      System.out.println();
      
      
    }while(resultadoDado1 != resultadoDado2);
  }
}
      
      
