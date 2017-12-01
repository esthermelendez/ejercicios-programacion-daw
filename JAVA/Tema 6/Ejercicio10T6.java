public class Ejercicio10T6 {
  public static void main(String[] args) {
    
    int num1 = ((int)(Math.random()*6) + 1);
    String caracter = String.valueOf(num1);
    
    switch (num1) {
      case 1:
        caracter = "*";
        break;
      case 2:
        caracter = "-";
        break;
      case 3:
        caracter = "=";
        break;
      case 4:
        caracter = ".";
        break;
      case 5:
        caracter = "/";
        break;
      case 6:
        caracter = "@";
        break;
      default:
    }
    
    int num2 = ((int)(Math.random()*40) + 1);
    
    for (int j = 0; j < 10; j++) {
    
      for (int i = 0; i<num2; i++) {
        System.out.print(caracter);
      }
      
      System.out.println();
    }
  }
}
      
    
    
    
    
