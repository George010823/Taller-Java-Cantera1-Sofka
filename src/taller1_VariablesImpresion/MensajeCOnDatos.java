package taller1_VariablesImpresion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MensajeCOnDatos {
	private static String nombreHijo;
	private static String apellidoHijo;
	private static String nombreMadre;
	private static String apellidoMadre;
	private static String nombrePadre;
	private static String apellidoPadre;
	
	public static void main(String[] args) {
		
		Scanner inpNombreHijo = new Scanner(System.in);
		System.out.println("Complete los datos solicitados a continuación:");
		System.out.println("Escriba su nombre:");
		nombreHijo = inpNombreHijo.nextLine();
		
		Scanner inpApellidoHijo = new Scanner(System.in);
		System.out.println("Escriba su apellido:");
		apellidoHijo = inpApellidoHijo.nextLine();
		
		Scanner inpNombreMadre = new Scanner(System.in);
		System.out.println("Escriba el nombre de su madre:");
		nombreMadre = inpNombreMadre.nextLine();
		
		Scanner inpApellidoMadre = new Scanner(System.in);
		System.out.println("Escriba el apellido de su madre:");
		apellidoMadre = inpApellidoMadre.nextLine();
		
		Scanner inpNombrePadre = new Scanner(System.in);
		System.out.println("Escriba el nombre de su padre:");
		nombrePadre = inpNombrePadre.nextLine();
		
		Scanner inpApellidoPadre = new Scanner(System.in);
		System.out.println("Escriba el apellido de su padre:");
		apellidoPadre = inpApellidoPadre.nextLine();
		
		System.out.println("Yo " + nombreHijo + " " + apellidoHijo + " soy hijo de " + nombreMadre
				+ " " + apellidoMadre + " y " + nombrePadre + " " + apellidoPadre);
	}

}
