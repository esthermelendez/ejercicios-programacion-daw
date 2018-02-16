/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author meloc
 */
public class Caballo {
  
  // atributos
  String raza;
  String nombre;
  String sexo;
  int edad;
  
  //constructor
  
  public Caballo() {
  }

  public Caballo(String nombre) {
    this.nombre = nombre;
  }
  

  public Caballo(int edad) {
    this.edad = edad;
  }

  public Caballo(String raza, String nombre, String sexo, int edad) {
    this.raza = raza;
    this.nombre = nombre;
    this.sexo = sexo;
    this.edad = edad;
  }
  
  void relincha() {
    System.out.println("YIIHII");
  }
  
  String getSexo() {
    return this.sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  
  public void elige(Caballo elegido) {
    if(this.sexo.equals("hembra")) {
     System.out.println("duermo");
    } 
    if(this.sexo.equals("macho")) {
      System.out.println("cabalgo");
    }
  }
}
