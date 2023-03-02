package taller2_Condicionales;

import java.util.Scanner;

public class ElMaquinista {

	private static String fechaRevision;     			
	private static String fechaEntrega;    			
	private static String nombreCliente;     			
	private static String cilindrajeMoto;    			
	private static String modeloMoto;   			
	private static String marcaMoto;       		  	
	private static String placaMoto;        		    
	private static String placaMotoObservaciones; 		
	private static String observacionesMoto;
	private static String observacionesMotoEntrega; 	
	private static String verObservacionesMoto; 		
	private static String salir; 						
	private static String nombreMecanico; 				
	private static String observacionesArreglos; 		
	private static String repuestos; 					
	private static String valorRepuestos; 				
	private static int opcion;
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a su taller EL Maquinista, por favor seleccione una de las opciones "
				+ "presentadas a continuación:");
		System.out.println("1. Registrar servicio nuevo.");
		System.out.println("2. Revisar observaciones del cliente.");
		System.out.println("3. Registrar entrega de motocicleta.");
		System.out.println("4. Detalle de repuestos cambiados de la motocicleta.");
		System.out.println();
		
		Scanner inpFechaRevision = new Scanner(System.in);
		Scanner inpNombreCliente = new Scanner(System.in);
		Scanner inpCilindrajeMoto = new Scanner(System.in);
		Scanner inpModeloMoto = new Scanner(System.in);
		Scanner inpMarcaMoto = new Scanner(System.in);
		Scanner inpPlacaMoto = new Scanner(System.in);
		Scanner inpNombreMecanico = new Scanner(System.in);
		Scanner inpObservacionesMoto = new Scanner(System.in);
		Scanner inpPlacaMotoObservaciones = new Scanner(System.in);
		Scanner inpFechaEntrega = new Scanner(System.in);
		Scanner inpObservacionesMotoEntrega = new Scanner(System.in);
		Scanner inpRepuestos = new Scanner(System.in);
		Scanner inpValorRepuestos = new Scanner(System.in);	
		Scanner inpOpcion = new Scanner(System.in);
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
		
		if(opcion == 1) {
			System.out.println("Documente los campos presentados a continuación:");
			System.out.println("Fecha de revision de la motocicleta.");
			fechaRevision = inpFechaRevision.nextLine();
			System.out.println("Nombre del dueño o cliente.");
			nombreCliente = inpNombreCliente.nextLine();
			System.out.println("Cilindraje de la motocicleta.");
			cilindrajeMoto = inpCilindrajeMoto.nextLine();
			System.out.println("Modelo-/Año de la motocicleta.");
			modeloMoto = inpModeloMoto.nextLine();
			System.out.println("Marca de la motocicleta.");
			marcaMoto = inpMarcaMoto.nextLine();
			System.out.println("Placa de la motocicleta.");
			placaMoto = inpPlacaMoto.nextLine();
			System.out.println("Nombre del mecanico que recibe la motocicleta.");
			nombreMecanico = inpNombreMecanico.nextLine();
			System.out.println("Describa la solicitud del cliente en cuanto a los problemas presentados en la "
					+ "motocicleta.");
			observacionesMoto = inpObservacionesMoto.nextLine();
			
			System.out.println("La motocicleta de placas " + placaMoto + " perteneciente al cliente " 
			+ nombreCliente + "." + " Fue ingresada al taller el dia " + fechaRevision + " para su respectiva "
					+ "revisión. Fue recibida por el mecanico " + nombreMecanico + "." + " Se anexan detalles "
							+ "de la motocicleta: ");
			System.out.println("Cilindraje de la motocicleta: " + cilindrajeMoto);
			System.out.println("Modelo-/Año de la motocicleta: " + modeloMoto);
			System.out.println("Marca de la motocicleta: " + marcaMoto);
		
		}else if(opcion == 2) {
			System.out.println("Escriba las placas de la moto a revisar:");
			placaMotoObservaciones = inpPlacaMotoObservaciones.nextLine();
			System.out.println("Escriba las observaciones sobre la inspeccion de la moto a revisar:");
			observacionesMoto = inpObservacionesMoto.nextLine();
			
			System.out.println("Las observaciones realizadas por el cliente para la inspección de la moto "
						+ "con placas " + placaMotoObservaciones + " son las siguientes:");
			System.out.println(observacionesMoto);
			
		}else if(opcion == 3) {
			System.out.println("Escriba las placas de la moto a entregar:");
			placaMotoObservaciones = inpPlacaMotoObservaciones.nextLine();
			System.out.println("Escriba la fecha de entrega de la moto:");
			fechaEntrega = inpFechaEntrega.nextLine();
			System.out.println("Escriba los cambios realizados a la motocicleta durante la inspección:");
			observacionesMotoEntrega = inpObservacionesMotoEntrega.nextLine();
			
			System.out.println("A continuación se detalla y entrega el registro de la inspección de la "
					+ "motocicleta:");
			System.out.println("Se hace entrega de la motocicleta de placas " + placaMotoObservaciones
					+ " el dia " + fechaEntrega + " y se relacionan los cambios realizados, " 
					+ observacionesMotoEntrega); 
		}
		else if(opcion == 4) {
			System.out.println("Describa a continuación el nombre y precio de los repuestos utilizados en la "
					+ "inspeccion de la motocilceta:");
			System.out.println("Escriba las placas de la moto a entregar:");
			placaMotoObservaciones = inpPlacaMotoObservaciones.nextLine();
			System.out.println("Escriba el nombre del repuesto.");
			repuestos = inpRepuestos.nextLine();
			System.out.println("Digite el valor del repuesto.");
			valorRepuestos = inpValorRepuestos.nextLine();
			
			System.out.println("Los repuestos utilizados en la motocicleta de placas " + placaMotoObservaciones 
					+ " son " + repuestos +", y el costo del repuesto es de " + valorRepuestos);
		}
	}
	
}
