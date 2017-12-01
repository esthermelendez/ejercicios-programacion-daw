public class Ejercicio7T6 {
  public static void main(String[] args) {
    
    int columna = 0;
    
    
    for (int i = 1; i <15; i++) {
      String apuesta ="";
      System.out.print(i + ".");
      for (int j= 0; j < 3; j++) {
        int num1 = ((int)(Math.random()*3) + 1);
        apuesta = String.valueOf(num1);
      
        switch (num1) {
          case 1:
          apuesta = "1";
          
          break;
        case 2:
          apuesta = "X";
          break;
        case 3:
          apuesta = "2";
          break;
        default:
        }
        System.out.print(apuesta + "|");
      }
      System.out.println();
    }
    
    System.out.print ("15.x|x|x|");
  }
}
    
