/**
* Realiza el control de acceso a una caja fuerte. La combinación será un
  número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
  acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
  Tendremos cuatro oportunidades para abrir la caja fuerte.
*
* @author Esther Melendez
*/

public class Ejercicio7T5 {
  public static void main(String[] args) {
    
    for (int rep = 0; rep < 4; rep++) {
        
        System.out.print("Introduzca el código: ");
    
        int codigo = Integer.parseInt(System.console().readLine());
         
        if(codigo == 1999)  {
          System.out.print("Caja abierta");
          rep =rep+4;
    
        } else {
            System.out.print("Código incorrecto. Vuelve a intentarlo: ");
          }
      }
  }
}

    
 
    
  
        
   
    
    
  
 
