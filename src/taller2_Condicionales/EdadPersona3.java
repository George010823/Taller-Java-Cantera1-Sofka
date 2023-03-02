package taller2_Condicionales;

import java.util.Scanner;

public class EdadPersona3 {
	
	private static String nombrePersona;
	private static String apellidoPersona;
	private static int edadPersona;
	
	public static void main(String[] args) {
				
		System.out.println("Complete los datos solicitados a continuación:");
		Scanner inpNombrePersona = new Scanner(System.in);
		System.out.println("Escriba su Nombre:");
		nombrePersona = inpNombrePersona.nextLine();
		
		Scanner inpApellidoPersona = new Scanner(System.in);
		System.out.println("Escriba su Apellido:");
		apellidoPersona = inpApellidoPersona.nextLine();
		
		Scanner inpEdadPersona = new Scanner(System.in);
		System.out.println("Escriba su edad:");
		edadPersona = inpEdadPersona.nextInt();
		
		if(edadPersona >= 18) {
			System.out.println(nombrePersona + " " + apellidoPersona + " usted es mayor de edad, por lo tanto"
					+ " puede entrar a la fiesta.");
		}else {
			System.out.println(nombrePersona + " " + apellidoPersona + " usted es menor de edad, por lo tanto, "
					+ "no puede entrar a la fiesta, por favor devuélvase a su casa.");
		}
			
	}
}
