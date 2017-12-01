public class Ejercicio18T6 {
  public static void main(String[] args) {
    
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    String pared1= "";
    String pared2= "";
    String pared3= "";
    do {
      
      num1=((int)(Math.random() * 6) + 1);
      
        
        
      switch(num1) {
        case 1:
            pared1 = "rojo";
            break;
          case 2:
            pared1 = "azul";
            break;
          case 3:
            pared1 = "verde";
            break;
          case 4:
            pared1 = "amarillo";
            break;
          case 5:
            pared1 = "violeta";
            break;
          case 6:
            pared1 = "naranja";
            break;
          default:
      }
        
      num2=((int)(Math.random() * 6) + 1);
      
        
        
      switch(num2) {
        case 1:
            pared2 = "rojo";
            break;
          case 2:
            pared2 = "azul";
            break;
          case 3:
            pared2 = "verde";
            break;
          case 4:
            pared2 = "amarillo";
            break;
          case 5:
            pared2 = "violeta";
            break;
          case 6:
            pared2 = "naranja";
            break;
          default:
      }
      
      num3=((int)(Math.random() * 6) + 1);
      
        
        
      switch(num3) {
        case 1:
            pared3 = "rojo";
            break;
          case 2:
            pared3 = "azul";
            break;
          case 3:
            pared3 = "verde";
            break;
          case 4:
            pared3 = "amarillo";
            break;
          case 5:
            pared3 = "violeta";
            break;
          case 6:
            pared3 = "naranja";
            break;
          default:
      }
      
      if ((pared1!=pared2) && (pared2!=pared3))  {
      
      System.out.println(pared1 + " " + pared2 + " " + pared3);
      
      }
      
    } while ((pared1 == pared2) || (pared2 == pared3) || (pared1 == pared3));
  }
}
