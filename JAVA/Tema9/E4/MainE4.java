/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

/**
 *
 * @author meloc
 */
public class MainE4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Fracciones f1 = new Fracciones();
    Fracciones f2 = new Fracciones();
    Fracciones f3 = new Fracciones();
    Fracciones f4 = new Fracciones();
    
    
    System.out.println("Aquí se va a inventir una fracción: ");
    f1.invierte(5, 17);
    System.out.println(f1);
    
    System.out.println("Aquí se va a multiplicar una fracción: ");
    f2.multiplica(3,31);
    System.out.println(f2);
    
    System.out.println("Aquí se va a dividir una fracción: ");
    f3.divide(3,12,3,4);
    System.out.println(f3);
    
    System.out.println("Aquí se va a simplificar una fracción: ");
    f4.simplifica(12,9);
    System.out.println(f4);
    
  }
  
}
