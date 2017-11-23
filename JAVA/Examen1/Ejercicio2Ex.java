public class Ejercicio2Ex {
  public static void main(String[] args) {
    
    System.out.print("Seleccione el modelo de coche (1) Modelo 5 (2) Modelo 8: ");
    String respuesta = System.console().readLine();
    
    int precioBaseA = 30000;
    int precioBaseB = 36000;
    int bateriaBase = 125; 
    double subvencionEstatalA = (precioBaseA * 0.05);
    double subvencionEstatalB = (precioBaseB * 0.05);
    String bateria1 = "bateria1";
    String bateria2 = "bateria2";
    String respuestaAutonomia = "autonomia";
    
    if (respuesta.equals("1")) {
      
      System.out.print("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
      bateria1 = System.console().readLine();
    
    
      if (bateria1.equals("a")) {
        System.out.println();
        System.out.println("Netsla Modelo 5");
        System.out.println("Precio Base ..... " + precioBaseA + "€");
        System.out.println("Bateria de 50 ..... " + (bateriaBase * 50) + "€");
        System.out.println("Subvención Estatal ..... " + subvencionEstatalA+ "€");
        System.out.println("Total ..... " +  (precioBaseA - subvencionEstatalA + (bateriaBase * 50)) + "€");
      } else if (bateria1.equals("b")) {
          System.out.println();
          System.out.println("Netsla Modelo 5");
          System.out.println("Precio Base ..... " + precioBaseA + "€");
          System.out.println("Bateria de 70 ..... " + (bateriaBase * 70) + "€");
          System.out.println("Subvención Estatal ..... " + subvencionEstatalA + "€");
          System.out.println("Total ................... " +  (precioBaseA - subvencionEstatalA + (bateriaBase * 70)) + "€");
        } 
    
    }else if (respuesta.equals("2")) {
      
      System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
      bateria2 = System.console().readLine();
      
      System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
      respuestaAutonomia = System.console().readLine();
    
      if (respuestaAutonomia.equals("s")) {
          if (bateria2.equals("a")) {
          System.out.println("Netsla Modelo 8");
          System.out.println("Precio Base ..... " + precioBaseB + "€");
          System.out.println("Bateria de 80 ..... " + (bateriaBase * 80) + "€");
          System.out.println("Subvención Estatal ..... " + subvencionEstatalA+ "€");
          System.out.println("Paquete de Autonomía ..... 1800€");
          System.out.println("Total ..... " +  (1800 + precioBaseB - subvencionEstatalB + (bateriaBase * 80)) + "€");
          } else if (bateria2.equals("b")) {
            System.out.println("Netsla Modelo 120");
            System.out.println("Precio Base ..... " + precioBaseB + "€");
            System.out.println("Bateria de 120 ..... " + (bateriaBase * 120) + "€");
            System.out.println("Subvención Estatal ..... " + subvencionEstatalA+ "€");
            System.out.println("Paquete de Autonomía ..... 1800€");
            System.out.println("Total ..... " +  (1800 + precioBaseB - subvencionEstatalB + (bateriaBase * 120)) + "€");
            } 
      } else if (respuestaAutonomia.equals("n")) {
          if (bateria2.equals("a")) {
            System.out.println();
            System.out.println("Netsla Modelo 8");
            System.out.println("Precio Base ..... " + precioBaseB + "€");
            System.out.println("Bateria de 80 ..... " + (bateriaBase * 80) + "€");
            System.out.println("Subvención Estatal ..... " + subvencionEstatalA + "€");
            System.out.println("Paquete de Autonomía ..... 0.00€");
            System.out.println("Total ................... " +  (precioBaseB - subvencionEstatalB + (bateriaBase * 80)) + "€");
          } else if (bateria2.equals("b")) {
            System.out.println();
            System.out.println("Netsla Modelo 8");
            System.out.println("Precio Base ..... " + precioBaseB + "€");
            System.out.println("Bateria de 120 ..... " + (bateriaBase * 120) + "€");
            System.out.println("Subvención Estatal ..... " + subvencionEstatalA + "€");
            System.out.println("Paquete de Autonomía ..... 0.00€");
            System.out.println("Total ................... " +  (precioBaseB - subvencionEstatalB + (bateriaBase * 120)) + "€");
          }
        }
    }
  }
}
