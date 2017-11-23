public class ExamenEjercicio1 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca el numero deseado: ");
    boolean esPrimo = true;
    int contadorNoPrimo = 0;
    int suma = 0;
    long auxMenor = 999999;
    int auxMayor = 0;
    
    do {
      int numero = Integer.parseInt(System.console().readLine());
      int i = 2;
      esPrimo = true;
      
      while (i < numero) {
        if (numero % i == 0) {
          esPrimo = false;
          
        }
        i++;
        
      }
      
      
      
      if (!esPrimo) {
        contadorNoPrimo++;
        suma = suma + numero;
        
        if (numero > auxMayor) {
        auxMayor = numero;
        
        }
      
        if (numero < auxMenor) {
        auxMenor = numero;
        
        }
      }
        
    
    } while (!esPrimo);
    System.out.println("Contador no primo: " + contadorNoPrimo);
    
    int mediaNota = suma / contadorNoPrimo;
    
    System.out.println("La media es: " + mediaNota);
    System.out.println("Número menor " + auxMenor);
    System.out.println("Número mayor: " + auxMayor);
    
    
    
    
  }
}
