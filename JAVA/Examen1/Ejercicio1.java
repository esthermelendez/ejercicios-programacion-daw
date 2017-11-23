public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca un numero: ");
    
    int numero = 0;
    int contadorCapicua = 0;
    
    while (numero>=0) {
      numero= Integer.parseInt(System.console().readLine());
      int volteado= 0;
      int aux = numero;
      while (numero>0) {
        volteado = volteado + (numero % 10);
        volteado = volteado * 10;
        numero = numero / 10;
      } 
      
      volteado= volteado /10;
      
      if (aux==volteado) {
        contadorCapicua++;
      } 
      
    }
    
    System.out.print ("Numeros capicuas: " + contadorCapicua0);
  }
}
      
    
