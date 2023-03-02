package taller2_Condicionales;

import java.util.Scanner;

public class Pasteleria {

	private static String nombreCliente;     			
	private static String cantidadPorciones;    			
	private static String TipoDecoracionTorta;     			
	private static String saborTorta;    			
	private static int valorTorta;   			
	private static int valorCantidadPorciones;       		  	
	private static int valorDecoracion;        		    
	private static int tortasDisponibles = 0; 		
	private static int adicionarTortas;
	private static int totalVentas; 	
	private static int aumentarInventario; 					
	private static int opcion;
	
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a su Pasteleria Don Carlos, por favor seleccione una de las opciones "
				+ "presentadas a continuación:");
		System.out.println("1. Registrar inventario de tortas disponibles.");
		System.out.println("2. Registrar pedido nuevo.");
		System.out.println("3. Revisar total ventas diarias");
		
		Scanner inpOpcion = new Scanner(System.in);
		Scanner inptortasDisponibles = new Scanner(System.in);
		Scanner inpAumentarInventario = new Scanner(System.in);
		Scanner inpNombreCliente = new Scanner(System.in);
		Scanner inpSaborTorta = new Scanner(System.in);
		Scanner inpvalorCantidadPorciones = new Scanner(System.in);
		Scanner inpTotalVentas = new Scanner(System.in);
		
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
		
		if(opcion == 1) {
			System.out.println("Digite el número de tortas disponibles para el día de hoy:");
			tortasDisponibles = inptortasDisponibles.nextInt();
			System.out.println("Total de tortas disponibles. " + tortasDisponibles);
			System.out.println("");
			System.out.println("Desea agregar mas tortas al inventario?");
			System.out.println("1. Si.");
			System.out.println("2. No.");
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			if(opcion == 1) {
				System.out.println("Escriba el número de tortas que desea agregar:");
				aumentarInventario = inpAumentarInventario.nextInt();
				tortasDisponibles += aumentarInventario;
				System.out.println("Total de tortas disponibles. " + tortasDisponibles);
			}
		}else if(opcion == 2) {
			System.out.println("Digite el número de tortas disponibles para el día de hoy:");
			tortasDisponibles = inptortasDisponibles.nextInt();
			if(tortasDisponibles == 0) {
				System.out.println("No hay inventario dipsonibles para ventas el dÍa de hoy");
			}else {
				System.out.println("Registre el pedido, diligenciando los datos a continuación:");
				System.out.println("Nombre cliente.");
				nombreCliente = inpNombreCliente.nextLine();
				System.out.println("Sabor de la torta.");
				saborTorta = inpSaborTorta.nextLine();
				System.out.println("Seleccione la cantidad de porciones que desea para la torta.");
				System.out.println("1. 10 porciones --> 1000.");
				System.out.println("2. 20 porciones --> 2000.");
				System.out.println("3. 30 porciones --> 3000.");
				System.out.println("4. 40 porciones --> 4000.");
				opcion = inpOpcion.nextInt();
				
				if(opcion == 1) {
					valorCantidadPorciones = 1000;	
				}else if(opcion == 2) {
					valorCantidadPorciones = 2000;	
				}else if(opcion == 3) {
					valorCantidadPorciones = 3000;	
				}else if(opcion == 4) {
					valorCantidadPorciones = 4000;	
				}
				
				System.out.println("Seleccione el tipo de decoración que desea incluir en la torta.");
				System.out.println("1. Matrimonio --> 300.");
				System.out.println("2. Cumpleaños --> 200.");
				System.out.println("3. Dia del Padre/Madre --> 100.");
				opcion = inpOpcion.nextInt();
				
				if(opcion == 1) {
					valorDecoracion = 300;	
				}else if(opcion == 2) {
					valorDecoracion = 200;	
				}else if(opcion == 3) {
					valorDecoracion = 100;	
				}
				valorTorta = valorCantidadPorciones + valorDecoracion;
				System.out.println("El costo total de la torta con sabor a " + saborTorta + " para el cliente " 
				+ nombreCliente +  " es de: " + valorTorta);
				System.out.println("Total de tortas disponibles: " + (tortasDisponibles - 1));
			}
		}else if(opcion == 3) {
			System.out.println("Escriba el total de ventas del dia de hoy:");
			totalVentas = inpTotalVentas.nextInt();
			System.out.println("Total de ventas del dia. " + totalVentas);
		}
	}
}
