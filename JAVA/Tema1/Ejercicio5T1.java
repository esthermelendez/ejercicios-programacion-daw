/**
* Tema 1
* Ejercicio 5
* Modifica el programa anterior añadiendo colores. Puedes mostrar cada 
* asignatura de un color diferente.
*
* @author Esther
*/

public class Ejercicio5T1 { // Clase principal 
	public static void main(String[] args) { 
		String rojo = "\033[31m"; 
		String verde = "\033[32m"; 
		String naranja = "\033[33m"; 
		String azul = "\033[34m"; 
		String morado = "\033[35m"; 
		String blanco = "\033[37m";
		String web = "\033[38;5;218m";
		System.out.println("	LUN	MAR	MIE	JUE	VIE"); 
		System.out.println("__________________________________________________________________"); 
		System.out.println(rojo + "\n8:15"	+ morado +	"\tSIST" + azul +	"\tPROG" + morado +	"\tSIST"	+ azul +	"\tPROG"	+ azul + "\tPROG"); 
		System.out.println(rojo + "\n9:15"	+ morado +	"\tSIST" + azul +	"\tPROG" + morado +	"\tSIST"	+ azul +	"\tPROG"	+ azul + "\tPROG"); 
		System.out.println(rojo + "\n10:15"	+ morado +	"\tSIST" + azul +	"\tPROG" + morado +	"\tSIST"	+ azul +	"\tPROG"	+ naranja + "\tENTOR"); 
		System.out.println(rojo + "\n11:45"	+ blanco +	"\tFOL" + web +	"\tBASES" + naranja +	"\tENTOR"	+ web +	"\tBASES"	+ verde + "\tLENGU"); 
		System.out.println(rojo + "\n12:45"	+ blanco +	"\tFOL" + web +	"\tBASES" + naranja +	"\tENTOR"	+ web +	"\tBASES"	+ verde + "\tLENGU"); 
		System.out.println(rojo + "\n13:45"	+ blanco +	"\tFOL" + web +	"\tBASES" + verde +	"\tLENG"	+ web +	"\tBASES"	+ verde + "\tLENGU");
	}
}
