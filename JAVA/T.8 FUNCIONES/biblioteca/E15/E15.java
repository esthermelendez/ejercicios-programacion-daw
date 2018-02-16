/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E15;

/**
 *
 * @author meloc
 */
import Biblioteca.Funciones;
public class E15 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    for (int i = 0; i < 1001; i++) {
      if (Biblioteca.Funciones.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
