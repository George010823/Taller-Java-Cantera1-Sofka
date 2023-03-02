package taller1_VariablesImpresion;

import java.util.Scanner;

public class NombreApellido {
	
	private static String nombre;
	private static String apellido;
	
	public static void main(String[] args) {
		
		Scanner inpNombre = new Scanner(System.in);
		System.out.println("Complete los datos solicitados a continuación:");
		System.out.println("Escriba su nombre:");
		nombre = inpNombre.nextLine();
		
		Scanner inpapellido = new Scanner(System.in);
		System.out.println("Escriba su apellido:");
		apellido = inpapellido.nextLine();
		
		System.out.println("Su Nombre completo es: " + nombre + " " + apellido);
	}

}
