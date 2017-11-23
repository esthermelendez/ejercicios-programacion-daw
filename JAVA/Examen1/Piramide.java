public class Piramide {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura deseado: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura= 1;
    int asteriscos= 1;
    int espacios= alturaIntroducida - 1;
    
    while (altura < alturaIntroducida) {
      
      for (int i= 1; i <= espacios; i++) {
        System.out.print(" "); 
      }
      
      for (int i =1; i <= asteriscos; i++) {
        System.out.print("*");
      }
      
      altura++;
      asteriscos +=2;
      espacios--;
      System.out.println();
      
    }
  }
}
        
      
