public class Figura2Vacia {
  public static void main(String[] args) {
 
    
    int alturaIntroducida = 7;
    int altura = 1;
    int asteriscos = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 1;
    
    
    for (int i = 1; i<=espacios; i++) {
        System.out.print(" ");
      }
    
    System.out.print("*");
    System.out.println("");
    asteriscos +=2;
    altura++;
    espacios--;
    
    while (altura < alturaIntroducida) {
      
      for (int i = 1; i<=espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      for (int i =1; i<=espaciosInternos; i++) {
        System.out.print(" "); 
      }
      
      System.out.print("*");
      altura++;
      System.out.println();
      espacios--;
      espaciosInternos +=2;
      asteriscos += 2;
    }
    
    for (int i = 1; i<=asteriscos; i++) {
        System.out.print("*");
      }
  }
}
    
