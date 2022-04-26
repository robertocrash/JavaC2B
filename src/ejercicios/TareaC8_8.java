package ejercicios;

import java.util.Scanner;

public class TareaC8_8 {

	// C8_8
	/*
	 * Realizar un programa que pida al usuario que inserte 2 enteros X e Y por
	 * teclado y realice las operaciones siguientes: Sacar el valor de X y Y en
	 * pantalla realizar la suma combinada de X y de Y. (X+=Y) realizar la resta
	 * combinada de X y de Y. (X-=Y) realizar el producto combinado de X y de Y: (x
	 * *= y) realizar la división combinada de X y de Y: (x /= y) realizar la resta
	 * combinada de X y de Y: (x %= y)
	 * 
	 * 
	 */

	public static void operacionesNumericas() {

		Scanner teclado = new Scanner(System.in);

		// Creacion de variables
		int x;
		int y;

		// Pedimos que introduzca ambos numeros(x,y) al usuario
		System.out.println("Introduce un entero(X): ");
		x = teclado.nextInt();

		System.out.println("Introduce un entero(Y):");
		y = teclado.nextInt();

		// Cierro teclado
		teclado.close();
		// Variables de las operaciones a realizar
		int suma = x + y;
		int resta = x - y;
		int producto = x * y;
		int division = x / y;
		int resto = x % y;

		// Mostramos por pantalla los datos

		System.out.println("X=" + x + " || Y=" + y);

		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("El producto es: " + producto);
		System.out.println("La division es: " + division);
		System.out.println("El resto es: " + resto);

	}

}
