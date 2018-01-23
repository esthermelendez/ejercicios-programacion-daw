import biblioteca.Biblioteca;
public class TrozoDeNumero {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro numero: ");
    int j = Integer.parseInt(System.console().readLine());
    
    System.out.println(biblioteca.Biblioteca.juntaNumeros(x,j));
    
    
    
    
    
    
    
    
  }
}
