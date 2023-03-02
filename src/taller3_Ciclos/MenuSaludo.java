package taller3_Ciclos;

import java.util.Scanner;

public class MenuSaludo {

	private static int opcion;
	private static String nombre;
	private static String saludo;
	
	public static void main(String[] args) {
		
		do {
			System.out.println("Menu de usuario:");
			System.out.println("1. Captura de nombre.");
			System.out.println("2. Saludar persona.");
			System.out.println("3. Salir del sistema.");
			
			Scanner inpNombre = new Scanner(System.in);
			Scanner inpSaludo = new Scanner(System.in);
			Scanner inpOpcion = new Scanner(System.in);
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Escriba el nombre que desea capturar:");
				System.out.println("Nombre.");
				nombre = inpNombre.nextLine();
				if(nombre.trim().isEmpty()) {
					System.out.println("EL nombre no puede estar vacio.");
				}else {
					System.out.println("El nombre es: " + nombre);
					System.out.println("");	
				}
			}else if(opcion == 2) {
				if(nombre == null) {
					System.out.println("No ha escrito un nombre para el saludo, por favor complete la opción 1");
				}else {
					System.out.println("Escriba el saludo que desea que la persona reciba:");
					saludo = inpSaludo.nextLine();
					System.out.println(saludo + " " + nombre);
				}
			}else if(opcion == 3) {
				System.out.println("Gracias por utilizar nuestro sistema de saludos.");
			}
		}while(opcion != 3);
	}
}
