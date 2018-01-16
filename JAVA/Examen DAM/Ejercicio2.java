public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("1. Primavera \n2. Verano \n3. Otoño \n4. Invierno \n  \nSeleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(System.console().readLine());
    
    int[] verano; 
    verano = new int[20];
    
    int[] invierno; 
    invierno = new int[25];
    
    int[] otoño; 
    otoño = new int[10];
    
    int[] primavera; 
    primavera = new int[15];
    
    int indice = 0;
    
    int tiempo = (int)(Math.random()*10 + 1);
    
    for (int i = 25; i < 45; i++) {
      verano[indice] = i;
      indice++;
    }
    
    indice = 0;
    
    for (int i = 0; i <25; i++) {
      invierno[indice] = i;
      indice++;
    }
    
    indice = 0;
    
    for (int i = 20; i < 30; i++) {
      otoño[indice] = i;
      indice++;
    }
    
    indice = 0;
    
    for (int i = 15; i < 30; i++) {
      primavera[indice] = i;
      indice++;
    }
    
    int maxima = 0;
    int minima = 0;
    
    if (estacion == 1) {
      do {
        maxima = ((int)(Math.random()*16) + 15);
        minima = ((int)(Math.random()*16) + 15);
      } while (maxima < minima);
      
      System.out.println("Temperatura máxima : " + maxima + "ºC");
      System.out.println("Temperatura mínima : " + minima + "ºC");
      String temperatura1 = "";
    
      switch(tiempo) {
        case 0:
          temperatura1 = "soleado";
          break;
        case 1:
          temperatura1 = "soleado";
          break;
        case 2:
          temperatura1 = "soleado";
          break;
        case 3:
          temperatura1 = "soleado";
          break;
        case 4:
          temperatura1 = "soleado";
          break;
        case 5:
          temperatura1 = "soleado";
          break;
        case 6:
          temperatura1 = "nublado";
          break;
        case 7:
          temperatura1 = "nublado";
          break;
        case 8:
          temperatura1 = "nublado";
          break;
        case 9:
          temperatura1 = "nublado";
          break;
        default:
      }
    
      System.out.println(temperatura1);
    }
    
    maxima = 0;
    minima = 0;
    
    if (estacion == 2) {
      do {
        maxima = ((int)(Math.random()*21) + 25);
        minima = ((int)(Math.random()*21) + 25);
      } while (maxima < minima);
      
      System.out.println("Temperatura máxima : " + maxima + "ºC");
      System.out.println("Temperatura mínima : " + minima + "ºC");
      String temperatura1 = "";
    
      switch(tiempo) {
        case 0:
          temperatura1 = "soleado";
          break;
        case 1:
          temperatura1 = "soleado";
          break;
        case 2:
          temperatura1 = "soleado";
          break;
        case 3:
          temperatura1 = "soleado";
          break;
        case 4:
          temperatura1 = "soleado";
          break;
        case 5:
          temperatura1 = "soleado";
          break;
        case 6:
          temperatura1 = "soleado";
          break;
        case 7:
          temperatura1 = "soleado";
          break;
        case 8:
          temperatura1 = "nublado";
          break;
        case 9:
          temperatura1 = "nublado";
          break;
        default:
      }
    
      System.out.println(temperatura1);
    }
    
    maxima = 0;
    minima = 0;
    
    if (estacion == 3) {
      do {
        maxima = ((int)(Math.random()*11) + 20);
        minima = ((int)(Math.random()*11) + 20);
      } while (maxima < minima);
      
      System.out.println("Temperatura máxima : " + maxima + "ºC");
      System.out.println("Temperatura mínima : " + minima + "ºC");
      String temperatura1 = "";
    
      switch(tiempo) {
        case 0:
          temperatura1 = "soleado";
          break;
        case 1:
          temperatura1 = "soleado";
          break;
        case 2:
          temperatura1 = "soleado";
          break;
        case 3:
          temperatura1 = "soleado";
          break;
        case 4:
          temperatura1 = "nublado";
          break;
        case 5:
          temperatura1 = "nublado";
          break;
        case 6:
          temperatura1 = "nublado";
          break;
        case 7:
          temperatura1 = "nublado";
          break;
        case 8:
          temperatura1 = "nublado";
          break;
        case 9:
          temperatura1 = "nublado";
          break;
        default:
      }
    
      System.out.println(temperatura1);
    }
    
    maxima = 0;
    minima = 0;
    
    if (estacion == 4) {
      do {
        maxima = ((int)(Math.random()*26) + 0);
        minima = ((int)(Math.random()*26) + 0);
      } while (maxima < minima);
      
      System.out.println("Temperatura máxima : " + maxima + "ºC");
      System.out.println("Temperatura mínima : " + minima + "ºC");
      String temperatura1 = "";
    
      switch(tiempo) {
        case 0:
          temperatura1 = "soleado";
          break;
        case 1:
          temperatura1 = "soleado";
          break;
        case 2:
          temperatura1 = "nublado";
          break;
        case 3:
          temperatura1 = "nublado";
          break;
        case 4:
          temperatura1 = "nublado";
          break;
        case 5:
          temperatura1 = "nublado";
          break;
        case 6:
          temperatura1 = "nublado";
          break;
        case 7:
          temperatura1 = "nublado";
          break;
        case 8:
          temperatura1 = "nublado";
          break;
        case 9:
          temperatura1 = "nublado";
          break;
        default:
      }
    
      System.out.println(temperatura1);
    }
  }
}
