package ejercicios;

import java.util.Scanner;

public class TareaC8_4 {

	// C8_4
	/*
	 * El programa tiene que determinar el grado conseguido basándonos sobre el
	 * resultado obtenido. El resultado está leído por teclado y el grado calculado
	 * según las condiciones siguientes:
	 * 
	 * Resultado Grado 90-100 A 80-89 B 70-79 C 50-69 D 0-49 E
	 * 
	 */

	public static void resultadoGrado() {

		Scanner teclado = new Scanner(System.in);

		int rangoMinimo = 0;
		int rangoMaximo = 100;

		System.out.println("Introduce un numero entre 0-100:");
		int numero = teclado.nextInt();
		if (numero >= rangoMinimo && numero <= rangoMaximo) {

		}
		if (numero <= 100 && numero >= 90) {
			System.out.println("Grado A");
		} else if (numero <= 89 && numero >= 80) {
			System.out.println("Grado B");
		} else if (numero <= 79 && numero >= 70) {
			System.out.println("Grado C");
		} else if (numero <= 69 && numero >= 50) {
			System.out.println("Grado D");
		} else if (numero <= 49 && numero >= 0) {
			System.out.println("Grado E");
		} else {
			System.out.println("El numero introducido esta fuera del rango (0-100)");
		}

		teclado.close();
	}

}
