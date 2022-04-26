package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaC8_5 {

	// C8_5

	/*
	 * El programa tiene que devolver el inverso de un entero insertado por teclado
	 * por el usuario Si el usuario inserta 5 (A=5), el sistema devuelve 0.20 (-->
	 * 1/A) si es igual a 0, imprimir un mensaje que diga numero nulo.
	 * 
	 */

	public static void invertirNumero() {

		Scanner teclado = new Scanner(System.in);

		// Declaro variables
		double numero = 0;

		System.out.println("Introduce un numero:");
		numero = teclado.nextDouble();

		if (numero > 0) {

			double inverso = 1 / numero;
			System.out.println("El inverso es:" + inverso);

		} else {
			System.out.println("Numero nulo");
		}
		teclado.close();
	}

}
