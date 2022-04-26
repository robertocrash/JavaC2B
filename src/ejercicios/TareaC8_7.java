package ejercicios;

import java.util.Scanner;

public class TareaC8_7 {

	// C8_7
	/*
	 * Realizar un programa que pida al usuario que inserte 2 enteros X e Y por
	 * teclado y que analice su entrada por teclado. El analísis tiene que indicar
	 * al usuario si los dos números son iguales o distintos. Y en caso de ser
	 * distintos, si X es más grande o más pequeño que Y.
	 * 
	 */

	public static void analisisNumeros() {

		Scanner teclado = new Scanner(System.in);

		// Creamos 2 variables
		int x;
		int y;

		// Pedimos al usuario que introduzca el numero(x) y el numero(y)
		System.out.println("Introduce un numero(x):");
		x = teclado.nextInt();
		System.out.println("Introduce un numero(y):");
		y = teclado.nextInt();

		// Si el numero X es igual al numero Y... entonces son iguales
		if (x == y) {
			System.out.println("Los numeros introducidos son iguales");

			// Si X es mayor que Y... entonces es mayor
			if (x > y) {
				System.out.println("Es mayor");
			}
		//Por el contrario... es menor	
		} else {
			System.out.println("Es menor");
		}

		teclado.close();
	}

}
