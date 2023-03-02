package taller3_Ciclos;

import java.util.Scanner;

public class EscuelaElMaestro {

	private static String nombreCompleto; 
	private static String nombreCompleto1;
	private static String nombreCompleto2;
	private static String nombreCompleto3;
	private static String nombreCompleto4;
	private static String nombreCompleto5;
	private static String nombreCompleto6;
	private static String nombreCompleto7;
	private static String nombreCompleto8;
	private static int idUsuario ;
	private static int idUsuario1;
	private static int idUsuario2;
	private static int idUsuario3;
	private static int idUsuario4;
	private static int idUsuario5;
	private static int idUsuario6;
	private static int idUsuario7;
	private static int idUsuario8;
	private static String presentoCurso ;
	private static String presentoCurso1;
	private static String presentoCurso2;
	private static String presentoCurso3;
	private static String presentoCurso4;
	private static String presentoCurso5;
	private static String presentoCurso6;
	private static String presentoCurso7;
	private static String presentoCurso8;
	private static String pruebaUsuario; 
	private static String pruebaUsuario1;
	private static String pruebaUsuario2;
	private static String pruebaUsuario3;
	private static String pruebaUsuario4;
	private static String pruebaUsuario5;
	private static String pruebaUsuario6;
	private static String pruebaUsuario7;
	private static String pruebaUsuario8;
	private static int opcion;
	private static int marcador;
	private static boolean presento;
	
	public static void main(String[] args) {
		
		idUsuario1 = 0;
		idUsuario2 = 0;
		idUsuario3 = 0;
		idUsuario4 = 0;
		idUsuario5 = 0;
		idUsuario6 = 0;
		idUsuario7 = 0;
		idUsuario8 = 0;
		presentoCurso1 = "";
		presentoCurso2 = "";
		presentoCurso3 = "";
		presentoCurso4 = "";
		presentoCurso5 = "";
		presentoCurso6 = "";
		presentoCurso7 = "";
		presentoCurso8 = "";
		presento = false;
		
		do {
			System.out.println("Bienvenidos a la escuela automovilística el Maestro:");
			System.out.println("1. Registrar Usuario.");
			System.out.println("2. Consultar Usuario.");
			System.out.println("3. Consultar Resultados de la Pruebas de Usuario.");
			System.out.println("4. Salir del sistema.");
			
			Scanner inpNombreCompleto = new Scanner(System.in);
			Scanner inpIdUsuario = new Scanner(System.in);
			Scanner inpPruebaUsuario = new Scanner(System.in);
			Scanner inpMarca = new Scanner(System.in);
			Scanner inpOpcion = new Scanner(System.in);
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Escriba el nombre completo del usuario.");
				nombreCompleto = inpNombreCompleto.nextLine();
				System.out.println("Escriba el número de identificación del usuario.");
				idUsuario = inpIdUsuario.nextInt();
				System.out.println("El usuario presento el curso?. Responda 1.SI 2.NO.");
				opcion = inpOpcion.nextInt();
				
				if(opcion == 1) {
					presentoCurso = "SI";
					System.out.println("El usuario presento prueba. Responda 1.SI 2.NO.");
					opcion = inpOpcion.nextInt();
					if(opcion == 1) {
						System.out.println("El usuario aprobo la prueba. Responda SI NO.");
						pruebaUsuario = inpPruebaUsuario.nextLine();
						//pruebaUsuario = pruebaUsuario;
					}else {
						pruebaUsuario = "NO";
					}
				}
					
				if(marcador < 8) {
					if(idUsuario1 == 0) {
						nombreCompleto1 = nombreCompleto;
						idUsuario1 = idUsuario;
						presentoCurso1 = presentoCurso;
						pruebaUsuario1 = pruebaUsuario;
						System.out.println("El usuario " + nombreCompleto1 + " ha sido registrado en la "
								+ "escuela.");
						marcador = 1;
					}else if(idUsuario2 == 0  & idUsuario != idUsuario1) {
						nombreCompleto2 = nombreCompleto;
						idUsuario2 = idUsuario;
						presentoCurso2 = presentoCurso;
						pruebaUsuario2 = pruebaUsuario;
						System.out.println("El usuario " + nombreCompleto2 + " ha sido registrado en la "
								+ "escuela.");
						marcador = 2;
					}else if(idUsuario3 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2) {
						nombreCompleto3 = nombreCompleto;
						idUsuario3 = idUsuario;
						presentoCurso3 = presentoCurso;
						pruebaUsuario3 = pruebaUsuario;
						System.out.println("El usuario " + nombreCompleto3 + " ha sido registrado en la "
								+ "escuela.");
						marcador = 3;
					}else if(idUsuario4 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2 & idUsuario != idUsuario3) {
							nombreCompleto4 = nombreCompleto;
							idUsuario4 = idUsuario;
							presentoCurso4 = presentoCurso;
							pruebaUsuario4 = pruebaUsuario;
							System.out.println("El usuario " + nombreCompleto4 + " ha sido registrado en la escuela.");
							marcador = 4;
					}else if(idUsuario5 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2 & idUsuario != idUsuario3 & idUsuario != idUsuario4) {
								nombreCompleto5 = nombreCompleto;
								idUsuario5 = idUsuario;
								presentoCurso5 = presentoCurso;
								pruebaUsuario5 = pruebaUsuario;
								System.out.println("El usuario " + nombreCompleto5 + " ha sido registrado en la escuela.");
								marcador = 5;
					}else if(idUsuario6 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2 & idUsuario != idUsuario3 & idUsuario != idUsuario4 & idUsuario != idUsuario5) {
								nombreCompleto6 = nombreCompleto;
								idUsuario6 = idUsuario;
								presentoCurso6 = presentoCurso;
								pruebaUsuario6 = pruebaUsuario;
								System.out.println("El usuario " + nombreCompleto6 + " ha sido registrado en la escuela.");
								marcador = 6;
					}else if(idUsuario7 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2 & idUsuario != idUsuario3 & idUsuario != idUsuario4 & idUsuario != idUsuario5 & idUsuario != idUsuario6){
								nombreCompleto7 = nombreCompleto;
								idUsuario7 = idUsuario;
								presentoCurso7 = presentoCurso;
								pruebaUsuario7 = pruebaUsuario;
								System.out.println("El usuario " + nombreCompleto7 + " ha sido registrado en la escuela.");
								marcador = 7;
					}else if(idUsuario8 == 0  & idUsuario != idUsuario1 & idUsuario != idUsuario2 & idUsuario != idUsuario3 & idUsuario != idUsuario4 & idUsuario != idUsuario5 & idUsuario != idUsuario6 & idUsuario != idUsuario7) {
								nombreCompleto8 = nombreCompleto;
								idUsuario8 = idUsuario;
								presentoCurso8 = presentoCurso;
								pruebaUsuario8 = pruebaUsuario;
								System.out.println("El usuario " + nombreCompleto8 + " ha sido registrado en la escuela.");
								marcador = 8;
					}else {
						System.out.println("El usuario que desea registrar ya se encuentra matriculado.");
					}						
				}else {
					System.out.println("No se pueden registrar mas usuarios+ la escuela ya tiene el cupo "
							+ "completo.");
					}
			}else if(opcion == 2) {
				System.out.println("Solo se mostrarán aquellos usuarios que hayan presentado el curso.");
				System.out.println("");		
				if(presentoCurso1.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto1 +  " con número de identificación " +  idUsuario1 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;
				}
				if(presentoCurso2.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto2 +  " con número de identificación " +  idUsuario2 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso3.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto3 +  " con número de identificación " +  idUsuario3 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso4.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto4 +  " con número de identificación " +  idUsuario4 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso5.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto5 +  " con número de identificación " +  idUsuario5 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso6.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto6 +  " con número de identificación " +  idUsuario6 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso7.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto7 +  " con número de identificación " +  idUsuario7 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presentoCurso8.equals("SI")) {
					System.out.println("Nombre Usuario: " +  nombreCompleto8 +  " con número de identificación " +  idUsuario8 +  " se encuentra matriculado en nuestra escuela.");
					presento = true;	
				}
				if(presento == false) {
					System.out.println("Ninguno de los usuarios registrados en la escuela ha presentado el curso");
				}
				System.out.println("");
			}else if(opcion == 3) {
				System.out.println("Solo se mostrarán los resultados de los usuarios que hayan presentado el curso.");
				System.out.println("");
				
				if(presentoCurso1.equals("SI")){
					System.out.println("El usuario " + nombreCompleto1 + " con número de identificación " 
				+ idUsuario1 + " se encuentra en estado " + pruebaUsuario1 + " aprobado.");
					presento = true;
				}
				if(presentoCurso2.equals("SI")){
					System.out.println("El usuario " + nombreCompleto2 + " con número de identificación " 
							+ idUsuario2 + " se encuentra en estado " + pruebaUsuario2 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso3.equals("SI")){
					System.out.println("El usuario " + nombreCompleto3 + " con número de identificación " 
							+ idUsuario3 + " se encuentra en estado " + pruebaUsuario3 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso4.equals("SI")){
					System.out.println("El usuario " + nombreCompleto4 + " con número de identificación " 
							+ idUsuario4 + " se encuentra en estado " + pruebaUsuario4 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso5.equals("SI")){
					System.out.println("El usuario " + nombreCompleto5 + " con número de identificación " 
							+ idUsuario5 + " se encuentra en estado " + pruebaUsuario5 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso6.equals("SI")){
					System.out.println("El usuario " + nombreCompleto6 + " con número de identificación " 
							+ idUsuario6 + " se encuentra en estado " + pruebaUsuario6 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso7.equals("SI")){
					System.out.println("El usuario " + nombreCompleto7 + " con número de identificación " 
							+ idUsuario7 + " se encuentra en estado " + pruebaUsuario7 + " aprobado.");
					presento = true;	
				}
				if(presentoCurso8.equals("SI")){
					System.out.println("El usuario " + nombreCompleto8 + " con número de identificación " 
							+ idUsuario8 + " se encuentra en estado " + pruebaUsuario8 + " aprobado.");
					presento = true;	
				}
				
				if(presento == false) {
					System.out.println("Ninguno de los usuarios registrados en la escuela ha presentado el curso");
				}
				System.out.println("");		
			}
		}while(opcion != 4);
	}
}
