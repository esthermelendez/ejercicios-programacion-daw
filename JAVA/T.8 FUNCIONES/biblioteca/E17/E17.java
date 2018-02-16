/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E17;

import java.util.Scanner;

/**
 *
 * @author meloc
 */
public class E17 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    long decimal = 0;
    int bits = Biblioteca.Funciones.digitos(binario);

    for (int i = 0; i < bits; i++) {
      decimal += Biblioteca.Funciones.digitoN(binario, bits - i - 1) * Biblioteca.Funciones.potencia(2, i);
    }

    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}
