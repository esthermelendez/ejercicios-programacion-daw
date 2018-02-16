/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

/**
 *
 * @author meloc
 */
public class Vehiculo {
  private static int kilometrosTotales;
  private int vehiculosCreados;
  private int kilometrosRecorridos;
  
  //constructor

  public Vehiculo(int kilometrosRecorridos) {
    this.kilometrosRecorridos = 0;
  }

  public Vehiculo() {
  }
  
  //getter y setter

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  public int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public void setKilometrosTotales(int kilometrosTotales) {
    this.kilometrosTotales = kilometrosTotales;
  }

  public int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public void setVehiculosCreados(int vehiculosCreados) {
    this.vehiculosCreados = vehiculosCreados;
  }
  
  //metodos
  
  public void andar(int km){
    this.kilometrosRecorridos = kilometrosRecorridos + km;
    Vehiculo.kilometrosTotales = kilometrosTotales + km;
  }
}
