/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.Scanner;

/**
 *
 * @author meloc
 */
public class MainE7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    int opcion1 = 0;
    Zona VIP = new Zona(13);
    Zona compra_venta = new Zona(230);
    Zona principal = new Zona(563);

    while (opcion != 3) {

      System.out.println("1.  Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = s.nextInt();

      switch (opcion) {

        case 1:
          System.out.println("En la zona principal quedan " + principal.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona VIP quedan " + VIP.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona compra_venta quedan " + compra_venta.getEntradasPorVender() + " entradas libres");
          break;
        case 2:
          System.out.println("Seleccione la zona: ");
          while (opcion1 != 4) {
            System.out.println("1.Principal");
            System.out.println("2. Compra venta");
            System.out.println("3. VIP");
            System.out.println("4. Salir");
            opcion1 = s.nextInt();

            switch (opcion1) {
              case 1:
                System.out.println("Seleccione el número: ");
                principal.vender(s.nextInt());
                break;
              case 2:
                System.out.println("Seleccione el número: ");
                VIP.vender(s.nextInt());
                break;
              case 3:
                System.out.println("Seleccione el número: ");
                compra_venta.vender(s.nextInt());
                break;
              default:
            }
          }
          break;
      }
    }
  }
}
