package ejercicios;

import java.util.Scanner;

public class TareaC8_2 {

	// C8_2

	/*
	 * El programa siguiente tiene que determinar si un año es bisiesto o no. Un año
	 * es bisiesto si cumple los siguientes criterios: Es divisible entre 4. Si
	 * termina en 00, debe ser divisible entre 400 (2000 y 2400 son bisiestos)
	 * (2100, 2200 y 2300 no lo son). Desde un enfoque algorítmico, se consideran
	 * las proposiciones o enunciados lógicos siguientes: p: Es divisible entre 4 q:
	 * Es divisible entre 100 r: Es divisible entre 400
	 * 
	 */

	public static void esBisiestoNoEsBisiesto() {

		int anio;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el año:");
		anio = teclado.nextInt();
		teclado.close();

		if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}

	}

}
