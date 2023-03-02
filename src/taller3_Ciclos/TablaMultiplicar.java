package taller3_Ciclos;

import java.util.Scanner;

public class TablaMultiplicar {

	private static int multiplo, incremento, resultado;
	
	public static void main(String[] args) {
		
		System.out.println("Escriba el número del cual desea obtener la tabla de multiplicación:");
		Scanner inpMultiplo = new Scanner(System.in);
		multiplo = inpMultiplo.nextInt();
		
		for(incremento = 1; incremento <= 10; incremento++) {
			resultado = incremento * multiplo;
			System.out.println(incremento + " x " + multiplo + " = " + resultado);
		}		
	}
}
