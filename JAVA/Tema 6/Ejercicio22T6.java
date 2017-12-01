public class Ejercicio22T6 {
  public static void main(String[] args) {
    
    System.out.println("Introduce la longitud: ");
    int longitud = Integer.parseInt(System.console().readLine());
    System.out.println("            @");
    
    
    for (int i = 1; i<longitud; i++) {
      int num1=((int)(Math.random() * 3) - 1);
      String caso1 = "";
      switch(num1) {
        case 1:
            caso1 = "         *";
            break;
          case 2:
            caso1 = "           *";
            break;
          case 3:
            caso1 = "         *";
            break;
      }
      
      System.out.println(caso1);
    }
  }
}
