package taller4_arreglos;

import java.util.Scanner;

public class LLenarArreglo {

	public static void main(String[] args) {
		
		Scanner inpNumeros = new Scanner(System.in);
		int[ ] enteros = new int[5];
		
		for(int i = 0; i < enteros.length; i++) {
			System.out.println("Ingrese el número de la posicion " + i + " para llenar el arreglo.");
			int numero = inpNumeros.nextInt();
			enteros[i] = numero;
		}
		
		for(int i = 0; i < enteros.length; i++) {
			System.out.println("[" + i + "] = " + enteros[i]);
		}
	}
}
