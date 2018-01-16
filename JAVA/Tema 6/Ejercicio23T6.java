public class Ejercicio23T6 {
  public static void main(String[] args) {
    
    String dado1 = "";
    int num1 = 0;
    
    for (int i= 0; i<5; i++) {
      num1 = ((int)(Math.random()*6) + 1);
      switch(num1) {
        case 1:
          dado1 = "As ";
          break;
        case 2:
          dado1 = "K ";
          break;
        case 3:
          dado1 = "Q ";
          break;
        case 4:
          dado1 = "J ";
          break;
        case 5:
          dado1 = "7 ";
          break;
        case 6:
          dado1 = "8 ";
          break;
        default:
      }
      System.out.print(dado1);
    }
    
  }
}
