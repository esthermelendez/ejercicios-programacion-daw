public class Capicua2 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el numero deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    int aux;
    int volteado= 0;
    boolean esCapicua = false;

    do{
      volteado=0;
       numero = Integer.parseInt(System.console().readLine());
        volteado = volteado + (numero % 10);
        volteado = volteado * 10;
        numero = numero / 10;
       
        aux=numero;
        
        volteado= volteado /10;
        
        if (volteado == aux) {
          esCapicua= true;
        }
      }while ((numero >= 0) && (esCapicua== false));
  }
}
