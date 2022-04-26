package ejercicios;

import java.util.Scanner;

public class TareaC8_9 {

	// C8_9
	/*
	 * Diseña un programa que solicite un número entero de 5 dígitos, y que diga si
	 * el número es capicua.
	 * 
	 */

	public static void kapikua() {

		Scanner teclado = new Scanner(System.in);

		int numeroIntroducido = 0;
		boolean capicua = false;

		System.out.println("Introduzca por favor un numero de 5 digitos");
		numeroIntroducido = teclado.nextInt();
		 String numeroConvertido =Integer.toString(numeroIntroducido);
		
	if (numeroConvertido.length() == 5) {
		
		
		
		 if (numeroIntroducido >= 10000) {
		      if (((numeroIntroducido / 10000) == (numeroIntroducido % 10) ) && ((((numeroIntroducido / 1000) % 10)) == ((numeroIntroducido / 10) % 10))) {
		        capicua = true;
		      }
		    }
		 if (capicua) {
		      System.out.println("El número introducido es capicúa.");
		      
		    } else {
		      System.out.println("El número introducido no es capicúa.");
		      
		    }

	}else {
		System.out.println("No has introducido 5 digitos, prueba de nuevo.");
	}
	}
}
