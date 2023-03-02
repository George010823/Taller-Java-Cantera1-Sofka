package taller2_Condicionales;

import java.util.Scanner;

public class EdadPersona2 {
	
	private static int edadPersona;
	
	public static void main(String[] args) {
				
		System.out.println("Complete los datos solicitados a continuación:");
		Scanner inpEdadPersona = new Scanner(System.in);
		System.out.println("Escriba su edad:");
		edadPersona = inpEdadPersona.nextInt();
		
		if(edadPersona < 18) {
			System.out.println("Usted aún es un niñ(a).");
		}
	}
}
