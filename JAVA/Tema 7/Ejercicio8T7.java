public class Ejercicio8T7 {
  public static void main(String[] args) {
    int[] meses; 
    meses = new int[13];
    
    int i;
    int j = 0;
    
    
    
    for (i = 1; i<13; i++) {
      System.out.println("Introduce la temperatura de mes " + i + ": ");
      meses[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
        
    for (j = 0; j<meses[1]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("ENERO" + " " + meses[1]);
    System.out.println();
        
    for (j = 0; j<meses[2]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("FEBRERO" + " "+ meses[2]);
    System.out.println();
        
    for (j = 0; j<meses[3]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("MARZO" + " " + meses[3]);
    System.out.println();
        
    for (j = 0; j<meses[4]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("ABRIL" + " " + meses[4]);
    System.out.println();
        
    for (j = 0; j<meses[5]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("MAYO" + " " + meses[5]);
    System.out.println();
        
    for (j = 0; j<meses[6]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("JUNIO" + " " + meses[6]);
    System.out.println();
        
    for (j = 0; j<meses[7]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("JULIO" + " " + meses[7]);
    System.out.println();
        
    for (j = 0; j<meses[8]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("AGOSTO" + " " + meses[8]);
    System.out.println();
        
    for (j = 0; j<meses[9]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("SEPTIEMBRE" +" " + meses[9]);
    System.out.println();
        
    for (j = 0; j<meses[10]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("OCTUBRE" + " " + meses[10]);
    System.out.println();
        
    for (j = 0; j<meses[11]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("NOVIEMBRE" + " " + meses[11]);
    System.out.println();
        
    for (j = 0; j<meses[12]; j++) {
      System.out.print("*" + " ");
    }
    
    System.out.print("DICIEMBRE" + " "  + meses[12]);
  }
}
