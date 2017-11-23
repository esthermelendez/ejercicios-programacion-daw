public class Ejercicio1T6 {
  public static void main(String[] args) {
    
    int resultadoDado3 = ((int)(Math.random()*6) + 1);
    int resultadoDado2 = ((int)(Math.random()*6) + 1);
    int resultadoDado1 = ((int)(Math.random()*6) + 1);
  
    System.out.print("Dado 1: ");
    
    if (resultadoDado1 == 1) {
      System.out.println("⚀  " + resultadoDado1);
    } else if (resultadoDado1 == 2) {
        System.out.println("⚁  " + resultadoDado1);
    } else if(resultadoDado1 == 3) {
        System.out.println("⚂  " + resultadoDado1);
    } else if(resultadoDado1== 4) {
        System.out.println("⚃  " + resultadoDado1);
    } else if(resultadoDado1 == 5) {
        System.out.println("⚄  " + resultadoDado1);
    } else if(resultadoDado1 == 6) {
        System.out.println("⚅  "+ resultadoDado1);
    }
    
    System.out.print("Dado 2: ");
    
    if (resultadoDado2 == 1) {
      System.out.println("⚀  " + resultadoDado2);
    } else if (resultadoDado2 == 2) {
        System.out.println("⚁  " + resultadoDado2);
    } else if(resultadoDado2 == 3) {
        System.out.println("⚂  " + resultadoDado2);
    } else if(resultadoDado2== 4) {
        System.out.println("⚃  " + resultadoDado2);
    } else if(resultadoDado2 == 5) {
        System.out.println("⚄  " + resultadoDado2);
    } else if(resultadoDado2 == 6) {
        System.out.println("⚅  "+ resultadoDado2);
    }
    
    System.out.print("Dado 3: ");
    
    if (resultadoDado3 == 1) {
      System.out.println("⚀  " + resultadoDado3);
    } else if (resultadoDado3 == 2) {
        System.out.println("⚁  " + resultadoDado3);
    } else if(resultadoDado3 == 3) {
        System.out.println("⚂  " + resultadoDado3);
    } else if(resultadoDado3== 4) {
        System.out.println("⚃  " + resultadoDado3);
    } else if(resultadoDado3 == 5) {
        System.out.println("⚄  " + resultadoDado3);
    } else if(resultadoDado3 == 6) {
        System.out.println("⚅  "+ resultadoDado3);
    }
    
    System.out.print("Suma total: " + (resultadoDado1 + resultadoDado2 + resultadoDado3));
    }
}
