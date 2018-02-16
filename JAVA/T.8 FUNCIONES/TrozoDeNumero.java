import biblioteca.Biblioteca;
public class TrozoDeNumero {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int i = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el inicio: ");
    int e = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el inicio: ");
    int j = Integer.parseInt(System.console().readLine());
    
    int x = biblioteca.Biblioteca.voltea(i);
    
    do {
     x = x / 10;
   } while ( x % 10 != e);
   
    System.out.println(x);
    
    int x2 = biblioteca.Biblioteca.voltea(x);
    
    do {
     x2 = x2 / 10;
   } while ( x2 % 10 != j);
   
    System.out.println(x2);
    
    
    
    
    
    
    
    
    
  }
}
