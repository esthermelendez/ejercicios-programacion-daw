/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meloc
 */
public class Prueba2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el tamaño del array: ");
    int tamano = s.nextInt();

    System.out.println("Introduce el minimo del array: ");
    int minimo = s.nextInt();

    System.out.println("Introduce el maximo del array: ");
    int maximo = s.nextInt();
    
    System.out.println("Introduce el numero del array: ");
    int numero = s.nextInt();
    

    int[] x = Biblioteca.FuncionesArrays.generaArrayInt(tamano, minimo, maximo);
    Biblioteca.FuncionesArrays.muestraArray(x);

    int num= Biblioteca.FuncionesArrays.maximoArrayInt(x);
    System.out.println("maximo: " +num);
    
    System.out.println();
    
    double media = Biblioteca.FuncionesArrays.mediaArrayInt(x);
    System.out.println("media: " + media);
    
    if (Biblioteca.FuncionesArrays.estaEnArrayInt(x,numero)== false) {
      System.out.println("No");
    }else {
      System.out.println("si");
    }
    
    System.out.println();
    
    int posicion = Biblioteca.FuncionesArrays.posicionEnArray(x, numero);
    System.out.println("Posicion : " + posicion);
    
    Biblioteca.FuncionesArrays.muestraArray(x);
    
    System.out.println();
    
   
    System.out.println("Array volteado: ");
    Biblioteca.FuncionesArrays.volteaArrayInt(x);
     System.out.println();
     System.out.println();
    
     
    System.out.println("Introduce el numero de rotaciones: ");
    int rotaciones = s.nextInt();
    
    int[] a = Biblioteca.FuncionesArrays.rotaDerechaArrayInt(x, rotaciones);
    System.out.println(Arrays.toString(a) + " ");
    
    int[] n = Biblioteca.FuncionesArrays.rotaIzquierdaArrayInt(x, rotaciones);
    System.out.println(Arrays.toString(n) + " ");
    

  }
}