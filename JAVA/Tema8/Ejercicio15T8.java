import biblioteca.Biblioteca;
public class Ejercicio15T8 {
  public static void main(String[] args) {
    for (int i = 0; i < 1001; i++) {
      if (biblioteca.Biblioteca.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
