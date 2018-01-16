public class Ejercicio14T7 {
  public static void main(String[] args) {
    
    String[] palabra;
    palabra = new String[8];
    
    int contadorColor = 0;
    int contadorNC = 0;
    
    
    System.out.println("Introduce 8 palabras: ");
    
    for (int i = 0; i < 8; i++) {
      palabra[i] = System.console().readLine();
      
      if (palabra[i].equals("verde")) {
        contadorColor++;
      }else if (palabra[i].equals("amarillo")) {
        contadorColor++;
      }else if (palabra[i].equals("blanco")) {
        contadorColor++;
      }else if (palabra[i].equals("morado")) {
        contadorColor++;
      }else if (palabra[i].equals("naranja")) {
        contadorColor++;
      }else if (palabra[i].equals("azul")) {
        contadorColor++;
      }else if (palabra[i].equals("negro")) {
        contadorColor++;
      }else if (palabra[i].equals("rosa")) {
        contadorColor++;
      }else if (palabra[i].equals("rojo")) {
        contadorColor++;
      } else {
        contadorNC++;
      }
    }
    
    String[] colores; 
    colores = new String[contadorColor];
    
    String[] noColores; 
    noColores = new String[contadorNC];
    
    int indice = 0;
    int indiceNC = 0;
    
    for (int i = 0; i < palabra.length; i++) {
      
      if (palabra[i].equals("verde")) {
         colores[indice] = palabra[i];
         indice++;
      }else if (palabra[i].equals("amarillo")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("blanco")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("morado")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("naranja")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("azul")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("negro")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("rosa")) {
        colores[indice] = palabra[i];
        indice++;
      }else if (palabra[i].equals("rojo")) {
        colores[indice] = palabra[i];
        indice++;
      } else { 
        noColores[indiceNC] = palabra[i];
        indiceNC++;
        
      }
      
    }
    
    System.out.println(contadorColor);
    System.out.println();
    System.out.println(contadorNC);
    System.out.println();
    
    for ( int i = 0; i < contadorColor; i++){
      System.out.print(colores[i] + " ");
    }
    for ( int i = 0; i < contadorNC; i++){
      System.out.print(noColores[i] + " ");
    }
  }
}
