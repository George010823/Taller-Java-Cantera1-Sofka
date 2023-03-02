package taller1_VariablesImpresion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mascota {
	
	private static String nombreMascota;
	private static int edadMascota;
	private static String tipoMascota;
	private static String nombreCompleto;
	
	public static void main(String[] args) {
		
		Scanner inpNombreMascota = new Scanner(System.in);
		System.out.println("Complete los datos solicitados a continuación:");
		System.out.println("Escriba el nombre de su mascota:");
		nombreMascota = inpNombreMascota.nextLine();
		
		Scanner inpedadMascota = new Scanner(System.in);
		System.out.println("Escriba la edad de su mascota:");
		try {
			edadMascota = inpedadMascota.nextInt();
		}catch(InputMismatchException inex){
			System.out.println("La edad de la mascota debe ser un número entero.");
		}
		
		Scanner inptipoMascota = new Scanner(System.in);
		System.out.println("Que tipo de mascota tiene:");
		tipoMascota = inptipoMascota.nextLine();
		
		Scanner inpnombreCompleto = new Scanner(System.in);
		System.out.println("Escriba su Nombre completo:");
		nombreCompleto = inpnombreCompleto.nextLine();
		
		System.out.println(nombreMascota + " es un(a) " + tipoMascota + " el cual, tiene " + edadMascota
				+ " años de edad y " + nombreCompleto + " es actualmente su dueñ(a)");
	}
}
