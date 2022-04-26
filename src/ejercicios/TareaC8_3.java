package ejercicios;

import java.util.Scanner;

public class TareaC8_3 {

	// C8_3

	/*
	 * Recuperamos los datos del usuario y los manipulamos: Diseña un programa que
	 * solicite un número entero de 5 dígitos, separe el número en sus dígitos
	 * individuales y los muestre por pantalla
	 * 
	 */
	
	
	public static void diseccionarNumero() {
	
	
	boolean repetir = true;
		
	Scanner teclado = new Scanner(System.in);	
	
	do {
	System.out.println("Introduzca un numero de 5 digitos:");
	int numero = teclado.nextInt();
	
	String lecturaNumero = Integer.toString(numero);
	
	int longitudNumero = lecturaNumero.length();
	
	
	
	if (longitudNumero != 5) {
		
		System.out.println("No has introducido 5 digitos, por favor introduce 5 digitos:");
		repetir = true;
		
	} else {
		
		for (int i = 0; i < lecturaNumero.length(); i++) {
			System.out.println("Numero:"+lecturaNumero.charAt(i));
			repetir = false;
		}

	}
	}while(repetir);	
		
	}
	
	
	
}
