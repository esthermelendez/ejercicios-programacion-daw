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
public class Caballo {
  
  // atributos
  String raza;
  String nombre;
  String sexo;
  int edad;
  
  //constructor
  
  public Caballo() {
  }
  
  public Caballo(String raza) {
    this.raza = raza;
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
  
  void elige(Caballo elegido) {
    if (this.sexo.equals("hembra")) {
     System.out.println("duermo");
    } else 
      System.out.println("cabalgo");
      }
  }
