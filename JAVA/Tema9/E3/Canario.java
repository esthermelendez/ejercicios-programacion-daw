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
public class Canario extends Ave{
  //puedo quitar los atributos usados en constructores anteriores
  private String raza;
  private String sexo;
  private int edad;
  private double peso;
  private String nombre;
  
  //constructores

  public Canario(String nombreElegido) {
    super(nombreElegido);
  }

  public Canario() {
  }

  public Canario(int numPlumas) {
    super(numPlumas);
  }

  //getter y setter 
  
  public void setSexo(String sexoElegido) {
    this.sexo = sexoElegido;
  }

  public String getSexo() {
    return sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  
  
  
  
  //metodos
  
  public Canario seApareaCon(Canario pareja, String nombreNiño, String nombreNiña, String razaNiño,String razaNiña){
    if(this.sexo.equals(pareja.getSexo())) {
      System.out.println("No puedo poner huevos");
      return null;
    } else {
      Canario Piolin = new Canario();
      if((int)(Math.random()*2)==0){
       Piolin.setSexo("hembra");
       Piolin.setNombre(nombreNiña);
       Piolin.setRaza(razaNiña);
      } else {
        Piolin.setSexo("macho");
        Piolin.setNombre(nombreNiño);
        Piolin.setRaza(razaNiño);
      }
      return Piolin;
    }
  }

  @Override
  public String toString() {
    return "Canario{" + "raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", nombre=" + nombre + '}';
  }
  
  
}