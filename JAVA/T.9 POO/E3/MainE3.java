/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E3;

/**
 *
 * @author meloc
 */
public class MainE3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Animal rocinante = new Animal("rocinante");
    Ave blanca = new Ave("blanca");
    
    Canario monu = new Canario("monu");
    Canario lulu = new Canario("lulu");
    Canario to = new Canario("to");
    Canario cria1 = new Canario();
    Canario cria2 = new Canario();
    
    rocinante.setPeso(45);
    rocinante.anda();
    blanca.setPeso(25);
    
    blanca.anda();
    blanca.setSexo("hembra");
    blanca.getSexo();
    blanca.pia();
    System.out.println(blanca.getSexo());
    
    monu.setSexo("hembra");
    monu.getSexo();
    to.setSexo("macho");
    to.getSexo();
    lulu.setSexo("macho");
    lulu.getSexo();
    lulu.seApareaCon(to, "Piolino", "Piolina", "Periquito", "Cuervo");
    cria1 = monu.seApareaCon(to, "Piolino", "Piolina", "Periquito", "Cuervo");
    System.out.println(cria1);

  } 
}
