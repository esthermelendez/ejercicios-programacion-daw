/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author meloc
 */
public class FuncionesArrays {
  
  public static void muestraArray(int x[]){
    for(int i=0;i<x.length;i++){
      System.out.print(x[i]+" ");      
    }
    System.out.println();    
  }

  public static int[] generaArrayInt(int a, int min, int max) {
    int[] num;
    num = new int[a];

    for (int i = 0; i < a; i++) {
      num[i] = ((int) (Math.random() * max + min));

    }
    return num;
  }

  public static int minimoArrayInt(int x[]) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < x.length; i++) {
      if (x[i] < min) {
        min = x[i];
      }
    }
    return min;
  }
  
  public static int maximoArrayInt(int x[]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < x.length; i++) {
      if (x[i] > max) {
        max = x[i];
      }
    }
    return max;
  }
  
  public static double mediaArrayInt(int x[]) {
    double aux = 0;
    for (int i= 0; i<x.length; i++){
      aux = x[i] + aux;
    }
    double auxFinal= aux/x.length;
    return auxFinal;
  }
  
  public static boolean estaEnArrayInt(int x[], int num) {
    boolean siEsta = false;
    
    int i = 0;
    
    while(i<x.length){
      if (num == x[i]) {
        siEsta = true;
      } 
      i++;
    }
    if (siEsta) {
       return true;
    } else{
       return false;
    }
    
  }
  
  public static int posicionEnArray(int x[], int num) {
    int posicion = 0;
    
    boolean siEsta = false;
    
    int i = 0;
    
    while(i<x.length){
      if (num == x[i]) {
        siEsta = true;
        posicion =i;
      } 
      
      i++;
    }
    
    if (siEsta) {
       return posicion;
    } else{
      return -1;
    }
  }

  public static int[] volteaArrayInt(int x[]) {
    for ( int i=x.length - 1; i >=0; i--) {
      System.out.print(x[i] + " "); 
    } 
    return x;
  }
  
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
    return a;
  }
  
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
    return a;
  }
}
