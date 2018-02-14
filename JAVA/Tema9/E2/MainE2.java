/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

import java.util.Scanner;

/**
 *
 * @author meloc
 */
public class MainE2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int opcion = 0;
    int km = 0;
    Bicicleta bmx = new Bicicleta();
    Coche ferrari = new Coche();

    while (opcion != 8) {

      System.out.println("1. Coger bicicleta");
      System.out.println("2. Derrapar bicicleta");
      System.out.println("3. Coger coche");
      System.out.println("4. Derrapar coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("¿Cuántos KM quieres recorrer?");
          km = s.nextInt();
          bmx.andar(km);
          break;
        case 2:
          bmx.caballo();
          break;
        case 3:
          System.out.println("¿Cuántos KM quieres recorrer?");
          km = s.nextInt();
          ferrari.andar(km);
          break;
        case 4:
          ferrari.derrapa();
          break;
        case 5:
          System.out.println("Has recorrido con la bici " + bmx.getKilometrosRecorridos() + " KM");
          break;
        case 6:
          System.out.println("Has recorrido con el coche " + ferrari.getKilometrosRecorridos() + " KM");
          break;
        case 7:
          System.out.println("Has recorrido con la bici y el coche " + bmx.getKilometrosTotales() + " KM");
        default:
      }
    }
  }
}
