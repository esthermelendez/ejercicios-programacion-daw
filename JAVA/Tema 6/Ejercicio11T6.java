public class Ejercicio11T62 {
  public static void main(String[] args) {
    
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;
    
    
    
    
    for (int i = 0; i<20; i++) {
      int nota = ((int)(Math.random()*10) + 1);
      String nota1 = String.valueOf(nota);
      
        
    switch (nota) {
      case 1:
        nota1 = "Insuficiente";
        contadorSuspenso++;
        break;
      case 2:
        nota1 = "Insuficiente";
        contadorSuspenso++;
        break;
      case 3:
        nota1 = "Insuficiente";
        contadorSuspenso++;
        break;
      case 4:
        nota1 = "Insuficiente";
        contadorSuspenso++;
        break;
      case 5:
        nota1 = "Suficiente";
        contadorSuficiente++;
        break;
      case 6:
        nota1 = "Bien";
        contadorBien++;
        break;
      case 7:
        nota1 = "Notable";
        contadorNotable++;
        break;
      case 8:
        nota1 = "Notable";
        contadorNotable++;
        break;
      case 9:
        nota1 = "Sobresaliente";
        contadorSobresaliente++;
        break;
      case 10:
        nota1 = "Sobresaliente";
        contadorSobresaliente++;
        break;
      default:

      
      }
      System.out.println(nota1);
    }
    
    System.out.println();
    System.out.println("Suspensos = " + contadorSuspenso);
    System.out.println("Suficientes = " + contadorSuficiente);
    System.out.println("Bienes = " + contadorBien);
    System.out.println("Notables = " + contadorNotable);
    System.out.println("Sobresalientes = " + contadorSobresaliente);
    
    
  }
}
