package taller1_VariablesImpresion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NomApeEdaEstatura {
	private static String nombre;
	private static String apellido;
	private static int edad;
	private static double estatura;
	
	public static void main(String[] args) {
		
		Scanner inpNombre = new Scanner(System.in);
		System.out.println("Complete los datos solicitados a continuación:");
		System.out.println("Escriba su nombre:");
		nombre = inpNombre.nextLine();
		
		Scanner inpApellido = new Scanner(System.in);
		System.out.println("Escriba su apellido:");
		apellido = inpApellido.nextLine();
		
		Scanner inpEdad = new Scanner(System.in);
		System.out.println("Escriba su edad:");
		try {
			edad = inpEdad.nextInt();
		}catch(InputMismatchException inex){
			System.out.println("La edad debe ser un número entero.");
		}

		Scanner inpEstatura = new Scanner(System.in);
		System.out.println("Escriba su estatura, separando el número entero del decimal con una (,):");
		try {
			estatura = inpEstatura.nextDouble();
		}catch(InputMismatchException inex){
			System.out.println("La estatura debe ser un número.");
		}
		
		System.out.println("Su Nombre completo es: " + nombre + " " + apellido + "," + 
		" su edad es: " + edad + " y su estatura es: " + estatura);
	}

}
