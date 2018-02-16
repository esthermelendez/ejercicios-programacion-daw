/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

/**
 *
 * @author meloc
 */
public class Pizza {
  private String tamano;
  private String estado;
  private String tipo;
  private static int totalServidas;
  private static int totalPedidas = 0;
  
  //constructores

  public Pizza(String tipo, String tamano) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado= "pedida";
    totalPedidas++;
  }
  
  
  //getter y setter

  public String getTamano() {
    return tamano;
  }

  public void setTamano(String tamaño) {
    this.tamano = tamano;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  
  
  //metodo
  
  public void sirve(){
    if (this.estado=="pedida") {
    this.estado= "servida";
    this.totalServidas++;
    } else{
      System.out.println("Lo siento, ya esta pedida");
      
    }
  } 

  @Override
  public String toString() {
    return "Pizza " + tipo + " tamaño " + tamano + ", " + estado;
  }
  
}
