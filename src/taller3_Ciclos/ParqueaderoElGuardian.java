package taller3_Ciclos;

import java.util.Scanner;

public class ParqueaderoElGuardian {

	private static String nombreCompleto ;
	private static String nombreCompleto1;
	private static String nombreCompleto2;
	private static String nombreCompleto3;
	private static String nombreCompleto4;
	private static String nombreCompleto5;
	private static int telefonoNuevo;
	private static int telefono1;
	private static int telefono2;
	private static int telefono3;
	private static int telefono4;
	private static int telefono5;
	private static String placa ;
	private static String placa1;
	private static String placa2;
	private static String placa3;
	private static String placa4;
	private static String placa5;
	private static String marca ;
	private static String marca1;
	private static String marca2;
	private static String marca3;
	private static String marca4;
	private static String marca5;
	private static int opcion;
	private static int marcador;

	
	public static void main(String[] args) {
		
		marcador = 0;
		placa1 = "";
		placa2 = "";
		placa3 = "";
		placa4 = "";
		placa5 = "";
		
		do {
			System.out.println("Bienvenidos a su sistema parqueadero El Guardian:");
			System.out.println("1. Ingresar vehiculo.");
			System.out.println("2. Buscar vehiculo.");
			System.out.println("3. Retirar vehiculo.");
			System.out.println("4. Salir del sistema.");
			
			Scanner inpNombreCompleto = new Scanner(System.in);
			Scanner inpTelefonoNuevo = new Scanner(System.in);
			Scanner inpPlaca = new Scanner(System.in);
			Scanner inpMarca = new Scanner(System.in);
			Scanner inpOpcion = new Scanner(System.in);
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Escriba su nombre completo.");
				nombreCompleto = inpNombreCompleto.nextLine();
				System.out.println("Escriba su número telefónico.");
				telefonoNuevo = inpTelefonoNuevo.nextInt();
				System.out.println("Escriba el nombre de la placa de su vehiculo.");
				placa = inpPlaca.nextLine();
				System.out.println("Escriba el nombre de la marca de su vehiculo.");
				marca = inpMarca.nextLine();
				
				if(marcador < 5) {
					if(placa1.equals("")) {
						telefono1 = telefonoNuevo;
						nombreCompleto1 = nombreCompleto;
						placa1 = placa;
						marca1 = marca;
						System.out.println("Su vehiculo ha sido registrado e ingresado al parqueadero. Z1");
						marcador = 1;
					}else if(placa2.equals("")){
						if(placa.equals(placa1)){
							break;
						}else {
							telefono2 = telefonoNuevo;
							nombreCompleto2 = nombreCompleto;
							placa2 = placa;
							marca2 = marca;
							System.out.println("Su vehiculo ha sido registrado e ingresado al parqueadero. Z2");
							marcador = 2;
						}
					}else if(placa3.equals("")){
						if(placa.equals(placa1) | placa.equals(placa2)){
							break;
						}else {
							telefono3 = telefonoNuevo;
							nombreCompleto3 = nombreCompleto;
							placa3 = placa;
							marca3 = marca;
							System.out.println("Su vehiculo ha sido registrado e ingresado al parqueadero. Z3");
							marcador = 3;
						}
					}else if(placa4.equals("")){
						if(placa.equals(placa1) | placa.equals(placa2) | placa.equals(placa3)){
							break;
						}else {
							telefono4 = telefonoNuevo;
							nombreCompleto4 = nombreCompleto;
							placa4 = placa;
							marca4 = marca;
							System.out.println("Su vehiculo ha sido registrado e ingresado al parqueadero. Z4");
							marcador = 4;
						}
					}else if(placa5.equals("")){
						if(placa.equals(placa1) | placa.equals(placa2) | placa.equals(placa3) | placa.equals(placa4)){
							break;
						}else {
							telefono5 = telefonoNuevo;
							nombreCompleto5 = nombreCompleto;
							placa5 = placa;
							marca5 = marca;
							System.out.println("Su vehiculo ha sido registrado e ingresado al parqueadero. Z5");
							marcador = 5;
						}
					}
				}else {
					System.out.println("No se pueden adicionar mas números telefónicos al sistema.");
				}
			}if(opcion == 2) {
				System.out.println("Escriba la placa del vehiculo que desea buscar.");
				placa = inpPlaca.nextLine();
				
				if(placa.equals(placa1)) {
					System.out.println("El vehiculo con placas " + placa1 + " se encuentra en la zona azul Z1.");
				}else if(placa.equals(placa2)) {
					System.out.println("El vehiculo con placas " + placa2 + " se encuentra en la zona azul Z2.");
				}else if(placa.equals(placa3)) {
					System.out.println("El vehiculo con placas " + placa3 + " se encuentra en la zona azul Z3.");
				}else if(placa.equals(placa4)) {
					System.out.println("El vehiculo con placas " + placa4 + " se encuentra en la zona azul Z4.");
				}else if(placa.equals(placa5)) {
					System.out.println("El vehiculo con placas " + placa5 + " se encuentra en la zona azul Z5.");
				}else {
					System.out.println("El número buscado no se encuentra en nuestro sistema.");
				}
			}else if(opcion == 3) {
				System.out.println("Escriba el número de la placa del vehiculo que desea retirar.");
				placa = inpPlaca.nextLine();
				
				if(placa.equals(placa1)) {
					System.out.println("El vehiculo de placa " + placa1 +" perteneciente a " + nombreCompleto1 
							+ " será retirado del parqueadero.");
					nombreCompleto1 = "";
					telefono1 = 0;
					placa1 = "";
					marca1 = "";
					marcador = marcador - 1;
				}else if(placa.equals(placa2)) {
					System.out.println("El vehiculo de placa " + placa2 +" perteneciente a " + nombreCompleto2 
							+ " será retirado del parqueadero.");
					nombreCompleto2 = "";
					telefono2 = 0;
					placa2 = "";
					marca2 = "";
					marcador = marcador - 1;
				}else if(placa.equals(placa3)) {
					System.out.println("El vehiculo de placa " + placa3 +" perteneciente a " + nombreCompleto3 
							+ " será retirado del parqueadero.");
					nombreCompleto3 = "";
					telefono3 = 0;
					placa3 = "";
					marca3 = "";
					marcador = marcador - 1;
				}else if(placa.equals(placa4)) {
					System.out.println("El vehiculo de placa " + placa4 +" perteneciente a " + nombreCompleto4 
							+ " será retirado del parqueadero.");
					nombreCompleto4 = "";
					telefono4 = 0;
					placa4 = "";
					marca4 = "";
					marcador = marcador - 1;
				}else if(placa.equals(placa5)) {
					System.out.println("El vehiculo de placa " + placa5 +" perteneciente a " + nombreCompleto5 
							+ " será retirado del parqueadero.");
					nombreCompleto5 = "";
					telefono5 = 0;
					placa5 = "";
					marca5 = "";
					marcador = marcador - 1;
				}else {
					System.out.println("El vehiculo con placas " + placa + " no se encuentra en el parqueadero.");
				}
			}

		}while(opcion != 4);
	}
}
