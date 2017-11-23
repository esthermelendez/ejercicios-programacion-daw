/**
* Escribe un programa que lea una lista de diez números y determine cuántos
  son positivos, y cuántos son negativos.
*
* @author Esther Melendez
*/

public class Ejercicio13T5 {
  public static void main(String[] args) {
    
    int pre =0;
    int contadorPositivo= 0;
    int contadorNegativo= 0;
    int rep =0;
    int numero;
    System.out.print
    ("Introduza 10 números: ");
    
    while(pre<10){
      
      pre++;
      numero = Integer.parseInt(System.console().readLine());
        
        if (numero >= 0)  {
           
          contadorPositivo++;
           
        } else {
           
           contadorNegativo++;
          
        }
      }
      
      System.out.println("Numeros positivos: " + contadorPositivo);
      System.out.println("Numeros negativos: " + contadorNegativo);
  }
}
        
        


    
