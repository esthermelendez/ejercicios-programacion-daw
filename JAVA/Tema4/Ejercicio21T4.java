/**
* Calcula la nota de un trimestre de la asignatura Programación. El programa
  pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
  Si la media de los dos controles da un número mayor o igual a 5, el alumno
  está aprobado y se mostrará la media. En caso de que la media sea un número
  menor que 5, el alumno habrá tenido que hacer el examen de recuperación
  que se califica como apto o no apto, por tanto se debe preguntar al usuario
  ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
  resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
  mantiene la nota media anterior.
*
* @author Esther Melendez
*/
public class Ejercicio21T4 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la nota del primer trimestre: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la nota del segundo trimestre: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2)/2;
    
    
    
    if (media >=5)  {
    
      System.out.print("La nota media de los dos trimestres es: " + (nota1 + nota2)/2);
    }
    
    else if (media <5) {
      
      System.out.print("¿Cual es el resultado de la recuperación? (apto/no apto): ");
      String respuesta = System.console().readLine();
  
      if (respuesta.equals("apto")) {
      
      System.out.println("Tu nota es un 5");
      }
    
      if (respuesta.equals("no apto")) {
      
      System.out.print("Tu nota es: " + (nota1 + nota2)/2);
      }
    }
  }
}
    
    
    
