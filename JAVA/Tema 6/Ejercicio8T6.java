public class Ejercicio8T6 {
  public static void main(String[] args) {
    int columna = 0;
    
    
    for (int i = 1; i <15; i++) {
      String apuesta ="";
      System.out.print(i + ".");
      for (int j= 0; j < 3; j++) {
        int num1 = ((int)(Math.random()*6) + 1);
        apuesta = String.valueOf(num1);
      
        switch (num1) {
          case 1:
          apuesta = "1";
          break;
        case 2:
          apuesta = "1";
          break;
        case 3:
          apuesta = "1";
          break;
        case 4:
          apuesta = "x";
          break;
          case 5:
          apuesta = "x";
          break;
          case 6:
          apuesta = "2";
          break;
        }
        System.out.print(apuesta + "|");
      }
      System.out.println();
    }
    
    System.out.print ("15.x|x|x|");
  }
}
