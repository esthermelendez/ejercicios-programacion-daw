public class Ejercicio4T7 {
  public static void main(String[] args) {
    
    int[] numero; 
    numero = new int[20];
    
    
    int[] cuadrado; 
    cuadrado = new int[20];
    
    int[] cubo; 
    cubo = new int[20];
    
    for (int i = 0; i<20; i++) {
      numero[i] = ((int)(Math.random()*100 + 0));
      cuadrado[i] = (numero[i] * numero[i]);
      cubo[i] = (numero[i] * numero[i] * numero[i]);
      System.out.println(numero[i] + "|" + cuadrado[i] + "|" + cubo[i]);

    }
  }
}
