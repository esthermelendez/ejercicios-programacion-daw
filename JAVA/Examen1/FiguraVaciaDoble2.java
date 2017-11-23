public class FiguraVaciaDoble2 {
  public static void main(String[] args) {
    
    
    
    System.out.print("Introduce la altura mayor o igual a 5: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int anchura = alturaIntroducida ;
    int altura = 3; // controlar anchura de la imagen*/
    double espacios = anchura - 4;
    
    for (int i =1; i<=anchura; i++) { // 1 de dos primeras lineas figura
      System.out.print("*");
    }
    
    System.out.println();//pasar al segundo piso
    
    for (int i =1; i<=anchura; i++) { //2 de dos primeras lineas figura
      System.out.print("*");
    }
    
    altura++; //llevar cuenta de nº piso
    System.out.println();//pasar al  piso
    
    while (altura < alturaIntroducida) {
      System.out.print("*");
      
      System.out.print("*");//* izquierda
      
      for (int i = 1 ; i <= espacios; i++) {
        
       System.out.print(" ");
       
       
        //espacios
        
      }
      
      System.out.print("*");
      
      System.out.print("*"); //* derecha
       
      altura++; 
      System.out.println();//salto de piso
       
    }//while
    
    for (int i=1; i<=anchura; i++) {
      System.out.print("*"); //suelo
     
    }
    System.out.println();//pasar al segundo piso
    
    for (int i =1; i<=anchura; i++) { //2 de dos primeras lineas figura
      System.out.print("*");
      
    }
  }
}
