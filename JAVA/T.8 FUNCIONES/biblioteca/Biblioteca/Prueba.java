/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author meloc
 */
public class Prueba {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el tamaño del array: ");
    int tamaño = s.nextInt();
    
    System.out.println("Introduce el minimo del array: ");
    int minimo = s.nextInt();
    
    System.out.println("Introduce el maximo del array: ");
    int maximo =s.nextInt();
    
    
    
    int[] x = Biblioteca.FuncionesArrays.generaArrayInt(tamaño, minimo, maximo);
    
    for(int i = 0; i<tamaño; i++) {
      System.out.println(x[i]);
    }
  
     
  }
}