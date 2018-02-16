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
public class Animal {
  private String nombre;
  private String raza;
  private String sexo;
  private int edad;
  private double peso;
  
  //constructores

  public Animal() {
    
  }

  public Animal(String nombreElegido) {
    this.nombre = nombreElegido;
  }
  
  //getter setter

  public void setSexo(String sexoElegido) {
    this.sexo = sexoElegido;
  }

  public String getSexo() {
    return sexo;
  }

  public void setPeso(double pesoElegido) {
    this.peso = pesoElegido;
  }

  public double getPeso() {
    return peso;
  }
  
  //metodos
  
  public void anda(){
    if (this.getPeso() > 30){
      System.out.println("No quiero andar, peso demasiado");
    } else {
      System.out.println("Estoy en el gym");
    }
  }
}
  
  
  
  
  
  
  
  
  
  
  
}
