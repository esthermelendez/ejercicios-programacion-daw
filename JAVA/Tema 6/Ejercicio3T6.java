public class Ejercicio3T6 {
  public static void main(String[] args) {
    String carta = "";
    
    for (int i = 1; i<40; i++) {
      int num1 = ((int)(Math.random()*10) + 1);
      carta = String.valueOf(num1);
      
      if (num1 == 1) {
        carta = "As";
      } else if(num1 == 2) {
          carta = "2";
      } else if(num1 == 3) {
          carta = "3";
      } else if(num1 == 4) {
          carta = "4";
      } else if(num1 == 5) {
          carta = "5";
      } else if(num1 == 6) {
          carta = "6";
      } else if(num1 == 7) {
          carta = "7";
      } else if(num1 == 8) {
        carta = "Sota";
      } else if(num1 == 9) {
        carta = "Caballo";
      } else if(num1 == 10) {
        carta = "Rey";
      }
    }
    
    int num2 = ((int)(Math.random()*4) + 1);
    String palo = String.valueOf(num2);
    
    switch (num2) {
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
        break;
      case 4:
        palo = "oro";
        break;
      default:
    }
    
    System.out.print(carta + " de " + palo);
    
    
  }
}
   
      
