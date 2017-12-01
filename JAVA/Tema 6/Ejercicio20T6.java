public class Ejercicio20T6 {
  public static void main(String[] args) {
    
    System.out.print("Introducela capacidad deseada: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int num1=((int)(Math.random() * capacidad) + 1);
    int altura = (capacidad - num1);
    
    if ((altura < capacidad) || (altura == capacidad)) {
      
      for (int i= 0; i<altura; i++) {
        System.out.println("*    *");
      }
      
      for (int i= 0; i<num1; i++) {
        System.out.println("*====*");
      }
      
      
    }
    System.out.println("******");
   
  }
}
