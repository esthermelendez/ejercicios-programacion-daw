/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E18;

/**
 *
 * @author meloc
 */
import Biblioteca.Funciones;
import java.util.Scanner;

public class E18 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
    int decimal = s.nextInt();
    
    System.out.println(decimal + " en decimal es " + Biblioteca.Funciones.decimalABinario(decimal) + " en binario.");
    
  } 
}
