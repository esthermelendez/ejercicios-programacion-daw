public class Ejercicio2T6 {
  public static void main(String[] args) {
    
    int carta = ((int)(Math.random()*13) + 1);
    String carta1 = "";
    
    
    if (carta == 2) {
        carta1 = "2";
    } else if(carta == 3) {
        carta1 = "3";
    } else if(carta == 4) {
        carta1 = "4";
    } else if(carta == 5) {
        carta1 = "5";
    } else if(carta == 6) {
        carta1 = "6";
    } else if(carta == 7) {
        carta1 = "7";
    } else if(carta == 8) {
        carta1= "8";
    } else if(carta == 9) {
        carta1 = "9";
    } else if(carta == 1) {
        carta1 = "A";
    } else if(carta == 10) {
        carta1 = "10";
    } else if(carta == 11) {
        carta1 = "J";
    } else if(carta == 12) {
        carta1 = "Q";
    } else if(carta == 13) {
        carta1 = "K";
    }
      
    
    int palo = ((int)(Math.random()*4));
    String palo1 = "";
    
    switch(palo) {
      case 0:
        palo1 = "picas";
        break;
      case 1:
        palo1 = "corazones";
        break;
      case 2:
        palo1 = "diamantes";
        break;
      case 3:
        palo1 = "treboles";
        break;
      default:
    }
    
    System.out.print(carta1 + " de " + palo1);
  }
}
