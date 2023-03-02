package taller3_Ciclos;

import java.util.Scanner;

public class AdminiTelefonos {

	private static String nombreCompleto;
	private static String nombreCompleto1;
	private static String nombreCompleto2;
	private static String nombreCompleto3;
	private static int telefonoNuevo;
	private static int telefono1; 
	private static int telefono2; 
	private static int telefono3; 
	private static String organizacion;
	private static String organizacion1;
	private static String organizacion2;
	private static String organizacion3;
	private static int opcion;
	private static int marcador;
	private static boolean entrar;
	
	public static void main(String[] args) {
		
		marcador = 0;
		telefono1 = 0;
		telefono2 = 0;
		telefono3 = 0;
		
		do {
			System.out.println("Bienvenidos a su sistema de administración de números telefónicos:");
			System.out.println("1. Añadir contacto.");
			System.out.println("2. Buscar contacto.");
			System.out.println("3. Eliminar contacto.");
			System.out.println("4. Salir del sistema.");
			
			Scanner inpNombreCompleto = new Scanner(System.in);
			Scanner inptelefonoNuevo = new Scanner(System.in);
			Scanner inpOrganizacion = new Scanner(System.in);
			Scanner inpOpcion = new Scanner(System.in);
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Escriba su nombre completo.");
				nombreCompleto = inpNombreCompleto.nextLine();
				System.out.println("Escriba su número telefónico.");
				telefonoNuevo = inptelefonoNuevo.nextInt();
				System.out.println("Escriba el nombre de su organización.");
				organizacion = inpOrganizacion.nextLine();
				
				if(marcador < 3) {
					if(telefono1 == 0) {
						telefono1 = telefonoNuevo;
						nombreCompleto1 = nombreCompleto;
						organizacion1 = organizacion;
						System.out.println("Su número de contacto ha sido agregado a nuestro sistema.");
						marcador = 1;
					}else if(telefono2 == 0 & telefonoNuevo != telefono1){
						telefono2 = telefonoNuevo;
						nombreCompleto2 = nombreCompleto;
						organizacion2 = organizacion;
						System.out.println("Su número de contacto ha sido agregado a nuestro sistema.");
						marcador = 2;
					}else if(telefono3 == 0 & telefonoNuevo != telefono1 & telefonoNuevo != telefono2) {
						telefono3 = telefonoNuevo;
						nombreCompleto3 = nombreCompleto;
						organizacion3 = organizacion;
						System.out.println("Su número de contacto ha sido agregado a nuestro sistema.");
						marcador = 3;
					}else {
						System.out.println("El contacto que desea agregar ya existe.");
					}
				}else {
					System.out.println("No se pueden adicionar mas números telefónicos al sistema.");
				}
			}else if(opcion == 2) {
				System.out.println("Escriba el número de telefóno que desea buscar.");
				telefonoNuevo = inptelefonoNuevo.nextInt();
				
				if(telefonoNuevo == telefono1) {
					System.out.println("El número de contacto " + telefono1 + " pertenece a " + nombreCompleto1 
							+ " y su organización es  " + organizacion1);
				}else if(telefonoNuevo == telefono2) {
					System.out.println("El número de contacto " + telefono2 + " pertenece a " + nombreCompleto2 
							+ " y su organización es  " + organizacion2);
				}else if(telefonoNuevo == telefono3) {
					System.out.println("El número de contacto " + telefono3 + " pertenece a " + nombreCompleto3 
							+ " y su organización es  " + organizacion3);
				}else {
					System.out.println("El número buscado no se encuentra en nuestro sistema.");
				}
			}else if(opcion == 3) {
				System.out.println("Escriba el número de telefóno del contacto que desea eliminar.");
				telefonoNuevo = inptelefonoNuevo.nextInt();
				
				if(telefonoNuevo == telefono1) {
					System.out.println("El número de contacto " + telefono1 + " pertenece a " + nombreCompleto1 
							+ " y la organización  " + organizacion1 + " será eliminado.");
					telefono1 = 0;
					nombreCompleto1 = "";
					organizacion1 = "";
					marcador = marcador - 1;
					System.out.println("El número de contacto " + telefonoNuevo + " fue eliminado.");
				}else if(telefonoNuevo == telefono2) {
					System.out.println("El número de contacto " + telefono2 + " pertenece a " + nombreCompleto2 
							+ " y la organización es  " + organizacion2 + " será eliminado.");
					telefono2 = 0;
					nombreCompleto2 = "";
					organizacion2 = "";
					marcador = marcador - 1;
					System.out.println("El número de contacto " + telefonoNuevo + " fue eliminado.");
				}else if(telefonoNuevo == telefono3) {
					System.out.println("El número de contacto " + telefono3 + " pertenece a " + nombreCompleto3 
							+ " y la organización es  " + organizacion3 + " será eliminado.");
					telefono3 = 0;
					nombreCompleto3 = "";
					organizacion3 = "";
					marcador = marcador - 1;
					System.out.println("El número de contacto " + telefonoNuevo + " fue eliminado.");
				}else {
					System.out.println("El número buscado no se encuentra en nuestro sistema.");
				}
			}
		}while(opcion != 4);
	}
}
