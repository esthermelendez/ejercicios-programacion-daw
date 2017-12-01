public class Ejercicio6T6 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    int num1 = ((int)(Math.random()*100) + 1);
    int contadorIntentos = 5;
    
    for (int i = 0; i < 5; i++) {
      
      if ( numIntroducido < num1 ) {
        contadorIntentos--;
        System.out.println("Has fallado, el numero introducido es menor al numero elegido, te quedan " + contadorIntentos + ". Introduce un numero : ");
        numIntroducido = Integer.parseInt(System.console().readLine());
      }
      
      if (numIntroducido > num1 ) {
        contadorIntentos--;
        System.out.println("Has fallado, el numero introducido es mayor al numero elegido, te quedan " + contadorIntentos + ". Introduce un numero : ");
        numIntroducido = Integer.parseInt(System.console().readLine());
      }
    }
    
    if (numIntroducido == num1) {
      System.out.println("Has acertado el numero.");
    }
  }
}

