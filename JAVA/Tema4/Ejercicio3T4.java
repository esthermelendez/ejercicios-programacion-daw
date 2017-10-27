/**
* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.


*
* @author Esther
*/

public class Ejercicio3T4 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca el número deseado: ");
  
    int numero = Integer.parseInt(System.console().readLine());
  
    String nombreDelDia = "a";
    switch (numero) {

    case 1 :
      nombreDelDia = "Lunes";
      break;
      
    case 2:
      nombreDelDia = "Martes";
      break;

    case 3:
      nombreDelDia = "Miercoles";
      break;

    case 4:
      nombreDelDia = "Jueves";
      break;
  
    case 5:
      nombreDelDia = "Viernes";
      break;
      
    case 6:
      nombreDelDia = "Sábado";
      break;
    
    case 7:
      nombreDelDia = "Domingo";
      break;
      
    default:
      System.out.print("\nLo siento, no existe día asignado a ese número.");
    }
    
  
    if ((numero>=1) && (numero <=7)) {
      System.out.println("El número " + numero + " es el día " + nombreDelDia);
    }

  }
}
  
 
