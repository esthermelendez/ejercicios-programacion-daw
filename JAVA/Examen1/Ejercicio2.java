public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("¿Qué ha tomado de comer? palmera, donut o pitufo?: ");
    String respuesta = System.console().readLine();
    
    double donut= 1;
    double palmera = 1.40;
    double zumo = 1.50;
    double cafe = 1.25;
    double café = 1.25;
    double pitufoComplemento = 0;
    double total= 0;
    double totalBebida =0;
    String respuesta1 = " ";
    
    if (respuesta.equals("pitufo")) {
      
      System.out.print("¿Con qué se ha tomado el pitufo? aceite o tortilla: ");
      respuesta1 = System.console().readLine();
    }
        
    System.out.print("¿Qué ha tomado de beber? zumo o cafe: ");
    String respuesta2 = System.console().readLine();
    
    if (respuesta2.equals("zumo")) {
    totalBebida= 1.5;
    System.out.println("Zumo........ " + totalBebida);
    } else {
         totalBebida = 1.25;
         System.out.println("Cafe........ " + totalBebida);
      }
    
    if (respuesta1.equals("aceite")) {
          total = 1.20;
          System.out.println("Pitufo con aceite........ " + total);
    }
    if (respuesta1.equals("tortilla")) {
          total = 1.80;
          System.out.println("Pitufo con tortilla........ " + total);
    }
    
    if (respuesta.equals("palmera")) {
      total = 1.40;
      System.out.println("Palmera........ " + total);
      
    }
    
   if (respuesta.equals("donut")) {
      total = 1;
      System.out.println("Donut........ " + total); 
    }
    
    System.out.print("PRECIO: " + (total+totalBebida));
  }
}

    
   

     

    
      
    
    
    
      
          
          
    
