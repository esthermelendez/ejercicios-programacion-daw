public class Ejercicio16T6 {
  public static void main(String[] args) {
    
    int moneda = 1;
    
    do{
    
      int num1=((int)(Math.random() * 5) + 1);
      String figura1= "";
        
        
      switch(num1) {
        case 1:
            figura1 = "corazón";
            break;
          case 2:
            figura1 = "diamante";
            break;
          case 3:
            figura1 = "herradura";
            break;
          case 4:
            figura1 = "campana";
            break;
          case 5:
            figura1 = "limón";
            break;
          default:
        }
      
        int num2=((int)(Math.random()*5) + 1);
        String figura2= "";
      
        switch(num2) {
          case 1:
            figura2 = "corazón";
            break;
          case 2:
            figura2 = "diamante";
            break;
          case 3:
            figura2 = "herradura";
            break;
          case 4:
            figura2 = "campana";
            break;
          case 5:
            figura2 = "limón";
            break;
          default:
        }
      
        int num3=((int)(Math.random()*5) + 1);
        String figura3= "";
        
        
        switch(num3) {
          case 1:
            figura3 = "corazón";
            break;
          case 2:
            figura3 = "diamante";
            break;
          case 3:
            figura3 = "herradura";
            break;
          case 4:
            figura3 = "campana";
            break;
          case 5:
            figura3 = "limón";
            break;
          default:
        }
        
        System.out.println(figura1 + " " + figura2 + " " + figura3);
        
        if (((figura1!=figura2) && (figura1==figura3)) || ((figura1==figura2) && (figura1!=figura3)) || ((figura2!=figura1) && (figura2==figura3))) {
          System.out.println("Has recuperado tu moneda.");
          System.out.println("Monedas: " + moneda);
        } 
        
        if ((figura1==figura2) && (figura2==figura3)) {
          System.out.println("Has ganado 10 monedas. "); 
          moneda+=9;
          System.out.println("Monedas: " + moneda);
        } 
        
        if (((figura1!=figura2) && (figura2!=figura3)) && (figura1!=figura3)) {
          System.out.println("Has perdido");
          moneda--;
          System.out.println("Monedas: " + moneda);
        }
        
    }while ( moneda>0);
           
    
  }
}

