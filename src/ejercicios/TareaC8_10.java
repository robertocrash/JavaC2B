package ejercicios;

import java.util.Scanner;

public class TareaC8_10 {

	// C8_10
	/*
	 * Realizar un convertidor monetario que pida al usuario introducir por teclado
	 * el tipo de conversión que desea realizar (Nos limitaremos a conversiones de
	 * Euros a Dolares, Yen y Libras) y la cantidad de dinero que desea cambiar. Al
	 * finalizar las peticiones, el programa realiza las conversiones adecuadas.
	 * 
	 */

	
	public static void convertidorMonetario() {
		
		Scanner teclado = new Scanner(System.in);
		
		//Creacion de variables
		
		double dolar = 1.08;
		double yen = 139.68;
		double libra = 0.83;
		
		//Pedimos al usuario introducir que conversion desea realizar
		System.out.println("1)Euros a Dolares\n2)Euros a Yen\n3)Euros a Libras");
		int numeroSelect = teclado.nextInt();
		
		if (numeroSelect == 1 || numeroSelect == 2 || numeroSelect == 3) {
			
			if (numeroSelect == 1) {
				System.out.println("Introduzca la cantidad de dinero:");
				double cantidad1 = teclado.nextDouble();
				
				double convertDolar = cantidad1 * dolar;
				System.out.println(cantidad1 + " €" + " en dolares es: " + convertDolar);
				
			}
			
			if (numeroSelect == 2) {
				System.out.println("Introduzca la cantidad de dinero");
				double cantidad2 = teclado.nextDouble();
				
				double convertYen = cantidad2 * yen;
				System.out.println(cantidad2 + " €" + " en yenes es: " + convertYen);
			}
			
			if (numeroSelect == 3) {
				System.out.println("Introduzca la cantidad de dinero");
				double cantidad3 = teclado.nextDouble();
				
				double convertLibra = cantidad3 * libra;
				System.out.println(cantidad3 + " €" + " en libras es: " + convertLibra);
			}
			
		}else {
			System.out.println("No has seleccionado ninguna de las opciones disponibles(1-3), prueba de nuevo.");
		}
	teclado.close();
	}
}
