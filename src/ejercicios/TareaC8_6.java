package ejercicios;

import java.util.Scanner;

public class TareaC8_6 {

	// C8_6
	/*
	 * El programa tiene que devolver el valor absoluto de un entero insertado por
	 * teclado por el usuario Si el usuario inserta 5, el sistema devuelve 5 Si el
	 * usuario inserta -5, el sistema devuelve 5 si es igual a 0, imprimir un
	 * mensaje que diga numero nulo.
	 * 
	 */

	public static void valorAbsoluto() {

		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Introduce un numero");
		numero = teclado.nextInt();
		
		if (numero == 0) {
			
			System.out.println("Numero nulo");
		} else {
			System.out.println("El valor absoluto del numero "+numero+" es: "+Math.abs(numero));
		}
		teclado.close();
	}

}
