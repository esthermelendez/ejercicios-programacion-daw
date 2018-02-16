/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E16;

/**
 *
 * @author meloc
 */
import Biblioteca.Funciones;
public class E16 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
      if (Biblioteca.Funciones.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
