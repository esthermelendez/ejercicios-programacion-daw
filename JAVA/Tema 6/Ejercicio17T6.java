public class Ejercicio17T6 {
  public static void main(String[] args) {
  
    int asterisco = 1;
    int espacios = 0;
    int altura = 2;
    
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura: ");
    
    int anchuraIntroducida = Integer.parseInt(System.console().readLine());
    int x=((int)(Math.random() * (anchuraIntroducida - 2)) + 2);
    int y=((int)(Math.random() * (alturaIntroducida -2)) + 2);
    int j= 0;
      
    for (int i = 1; i<=anchuraIntroducida; i++) {
        System.out.print("* ");
    }
    System.out.println("");
     
    while (altura < alturaIntroducida) {
     System.out.print("* ");
      
      for (j = 2; j<anchuraIntroducida; j++) {
        if ((y==altura) && (x==j)) {
          System.out.print("& ");
        } else {
          System.out.print("  ");
        }
      }
      
      System.out.println("* ");
      altura++;
    }
    
    for (int i = 1; i<=anchuraIntroducida; i++) {
        System.out.print("* ");
    }
  }
} 
