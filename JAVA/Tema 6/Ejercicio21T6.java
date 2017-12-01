public class Ejercicio21T6 {
  public static void main(String[] args) {
  
    for (int i = 0; i < 5; i++) {
      int num1=((int)(Math.random() * 8) + 1);
      String moneda1 = "";
      switch(num1) {
        case 1:
            moneda1 = "1 cent";
            break;
          case 2:
            moneda1 = "2 cent";
            break;
          case 3:
            moneda1 = "5 cent";
            break;
          case 4:
            moneda1 = "10 cent";
            break;
          case 5:
            moneda1 = "20 cent";
            break;
          case 6:
            moneda1 = "50 cent";
            break;
          case 7:
            moneda1 = "2 euros";
            break;
          case 8:
            moneda1 = "1 euro";
            break;
          default:
        }
        
      int num2=((int)(Math.random() * 2) + 1);
      String lado1 = "";
    
      switch(num2) {
        case 1:
            lado1 = "cara";
            break;
          case 2:
            lado1 = "cruz";
            break;
          default:
      }
    
      System.out.println(moneda1 + "-" + lado1);
    }
  }
}

