public class Ejercicio17T7 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[10];
    
    int i = 0;
    
    for ( i = 0; i <10; i++) {
      num[i] = ((int)(Math.random()*101));
    }
    
    System.out.println("Introduce el numero deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for ( i = 0; i <10; i++) {
      if (numero == num[i]) {
        num[0] = numero;
      } else {
        System.out.println("Introduce el numero de nuevo: ");
      }
    }
  }
}
