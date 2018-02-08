/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9e1;

/**
 *
 * @author meloc
 */
public class Tema9E1 {
  public static void main(String[] args) {
   Caballo blanquito = new Caballo("macho");
   Caballo nieve = new Caballo("hembra");
   Caballo rocinante = new Caballo("macho");
   
   System.out.println("hola caballito");
   rocinante.relincha();
   rocinante.elige(rocinante);
  }
}
