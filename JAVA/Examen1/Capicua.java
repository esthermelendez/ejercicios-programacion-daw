public class Capicua {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el numero deseado: ");
    int numero = Integer.parseInt(System.console().readLine());
    int aux = numero;
    int volteado= 0;
    boolean capicua=false;
    
    while(numero > 0) {
      volteado = volteado + (numero % 10);
      volteado = volteado * 10;
      numero = numero / 10;
    }
    
    volteado= volteado /10;
    
    System.out.print(volteado); //Este codigo vale para darle la vuelta al numero.
    
    if (volteado==aux) {
      System.out.print("Es capicua");
    } else {
      System.out.println("El numero NO es capicua,");
    }
  }
}
