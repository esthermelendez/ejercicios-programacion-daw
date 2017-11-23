public class PiramideHueca {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura deseado: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 1;
    int asteriscos = 1;
    
    for (int i= 1; i <= espacios; i++) {
      System.out.print(" ");
    }
    
    System.out.print("*");
    altura++;
    espacios--;
    System.out.println();
    asteriscos+=2;
      
    
    
    
    while (altura < alturaIntroducida) {
      for (int i = 1; i<= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      for (int i=1; i<=espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      altura++;
      espacios--;
      espaciosInternos +=2;
      System.out.println();
      asteriscos+=2;
      
    }
    
    for (int i = 1; i<=asteriscos; i++) {
      System.out.print("*");
    }
    
    
  }
}
