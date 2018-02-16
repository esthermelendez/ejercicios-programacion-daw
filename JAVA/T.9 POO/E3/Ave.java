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
public class Ave extends Animal{
  private String raza;
  private String sexo;
  private int edad;
  private double peso;
  private int numPlumas;

  public Ave(String nombreElegido) {
    super(nombreElegido);
  }

  public Ave() {
  }

  public Ave(int numPlumas) {
    this.numPlumas = numPlumas;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexoElegido) {
    this.sexo = sexoElegido;
  }
  
  //metodos
  
  public void pia(){
    if(this.sexo.equals("macho")){
      System.out.println("PUM PUM");
    } else {
      System.out.println("PI PI");
    }
  }
  
  
  
  

  
  
}
