/**
* Escribe un programa que pida por teclado un día de la semana y que diga qué
  asignatura toca a primera hora ese día.
*
* @author Esther
*/

public class Ejercicio1T4 {
  public static void main(String[] args) {
    
  System.out.print("Por favor, introduzca un día de la semana: ");
  
  String dia = (System.console().readLine());
  
  String nombreDeAsignatura = "a";
  switch (dia) {

    case "lunes":
      nombreDeAsignatura = "Sist Infor";
      break;
      


    case "martes":
      nombreDeAsignatura = "Programación";
      break;

    case "miercoles":
      nombreDeAsignatura = "Sist Infor";
      break;

    case "jueves":
      nombreDeAsignatura = "Programación";
      break;
  
    case "viernes":
      nombreDeAsignatura = "Programación";
      break;
  
    default: System.out.print("\nLo siento, no existe asignatura ese día.");
    }
  System.out.println(" " + dia + ": " + nombreDeAsignatura);

  }
}
  
 
