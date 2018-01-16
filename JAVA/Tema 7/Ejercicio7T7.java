public class Ejercicio7T7 {
  public static void main(String[] args) {
   
    System.out.println("Introduce el numero que deseas cambiar");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el numero que deseas establecer");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    int[] num; 
    num = new int[100];
    
    int i;
    int aux = numero;
    
    
    for (i = 0; i<100; i++) {
      num[i]= ((int)(Math.random()*20 + 0));
    }
      
    
    for (i = 0; i<100; i++) {
      
      
      if (num[i] == numero2) {
        num[i] = aux;
        System.out.print( "'" + aux + "'");
      } else {
        System.out.print( " " + num[i] + " ");
      }
        
      
    }
  }
}
    
