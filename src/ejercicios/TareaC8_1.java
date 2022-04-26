package ejercicios;

import java.util.Scanner;

public class TareaC8_1 {

	public static void conversorDinero() {

		// TareaC8_1 clase = new TareaC8_1();

		// C8_1

		/*
		 * Utilizando SWITCH, realizar un conversor monetario que pida al usuario
		 * introducir por teclado el tipo de conversión que desea realizar (Nos
		 * limitaremos a conversiones de Euros a Dolares, Yen y Libras) y la cantidad de
		 * dinero que desea cambiar. Al finalizar las peticiones, el programa realiza
		 * las conversiones adecuadas.
		 * 
		 */

		// Introducimos la lectura del teclado
		Scanner teclado = new Scanner(System.in);

		// Introduzco las variables
		double dolar = 1.08;
		double yen = 139.68;
		double libra = 0.83;

		// Creamos un booleano con valor true para hacer que nos repita el proceso en
		// caso
		// de ser True(verdadero)
		boolean repetir = true;

		// Encapsulamos el programa en un do/while para que nos repita el programa en
		// caso
		// de que el usuario no meta ninguno de los casos(1-3)
		do {
			System.out.println("Selecciona que tipo de conversion deseas realizar: \n" + "1)Euro a Dolar \n"
					+ "2)Euro a Yen \n" + "3)Euro a Libra");

			int seleccion = teclado.nextInt();

			// Creamos el switch con los casos 1-2-3

			switch (seleccion) {
			case 1:
				System.out.println("Selecciona la cantidad a convertir de Euros a Dolares:");
				double caso1 = teclado.nextDouble();

				double convertDolar = caso1 * dolar;
				System.out.println(caso1 + " €" + " en dolares es: " + convertDolar);
				repetir = false;

				break;

			case 2:
				System.out.println("Selecciona la cantidad a convertir de Euros a Yens:");
				double caso2 = teclado.nextDouble();

				double convertYen = caso2 * yen;
				System.out.println(caso2 + "€" + " en yenes es: " + convertYen);
				repetir = false;
				break;

			case 3:
				System.out.println("Selecciona la cantidad a convertir de Euros a Libras");
				double caso3 = teclado.nextDouble();

				double convertLibra = caso3 * libra;
				System.out.println(caso3 + "€" + " en libras es:" + convertLibra);
				repetir = false;
				break;

			// En caso de no introducir ninguno de los casos, saldra este por defecto
			default:
				System.out.println("Error... has introducido un numero incorrecto");

			}

		} while (repetir);
		teclado.close();
	}

}
