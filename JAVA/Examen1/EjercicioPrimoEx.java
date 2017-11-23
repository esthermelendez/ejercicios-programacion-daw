public class EjercicioPrimoEx {
  public static void main(String[] args) {
    
    System.out.println("Introduce 10 numeros: ");
    
    int contadorPrimo = 0;
    double suma = 0;
    int contadorNoPrimo = 0;
    
    for (int i= 0; i<10; i++) {
      int numero = Integer.parseInt(System.console().readLine());
      int j = 2;
      boolean esPrimo = true; //para resetear el boolean
      
      while (j < numero) {
        if (numero % j == 0) {
          esPrimo = false;
        }
        
        j++;
      }
      
      if (esPrimo) {
        suma = suma + numero;
        contadorPrimo++;
        
        } else {
           contadorNoPrimo++;
          }
      
    }
    double mediaNumero = suma / contadorPrimo;
    System.out.print("La media es: " + mediaNumero);
  }
}
  
    
    
      
