package ejercicios;

import java.util.Scanner;

public class TareaC8_9 {

	// C8_9
	/*
	 * Dise�a un programa que solicite un n�mero entero de 5 d�gitos, y que diga si
	 * el n�mero es capicua.
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
		      System.out.println("El n�mero introducido es capic�a.");
		      
		    } else {
		      System.out.println("El n�mero introducido no es capic�a.");
		      
		    }

	}else {
		System.out.println("No has introducido 5 digitos, prueba de nuevo.");
	}
	}
}
