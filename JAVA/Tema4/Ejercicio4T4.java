/**
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.


*
* @author Esther
*/

public class Ejercicio4T4 {
  public static void main(String[] args) {
     
    System.out.print("Horas laborables a la semana: ");
    
    int horasLaborables = Integer.parseInt(System.console().readLine());
    
    
    
    
    if (horasLaborables >=41){
    System.out.println ( "El sueldo es de " + (horasLaborables*16) + " euros.");
    }
    
    else {
    System.out.println ("El sueldo es de " + ((horasLaborables*12 + (horasLaborables-40)*16)) + " euros.");
    }
    
    
  }
}
    
    
    
