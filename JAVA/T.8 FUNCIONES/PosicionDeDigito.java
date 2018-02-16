import biblioteca.Biblioteca;
public class PosicionDeDigito {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el digito: ");
    int e = Integer.parseInt(System.console().readLine());
    
    int volteado = biblioteca.Biblioteca.voltea(x);
    System.out.println(volteado);
    
    int n = 1;
    
    if (volteado / 10 == 0) {
    } else { 
      do {
        volteado = volteado / 10;
        n++;
        if (volteado % 10 == e) {
          System.out.println("Posición = " + n);
        }
          
      } while(volteado != 0);
    }
  }
}
