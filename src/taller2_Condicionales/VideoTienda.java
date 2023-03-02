package taller2_Condicionales;

import java.util.Scanner;

public class VideoTienda {

	private static int opcion;
	private static String pelicula;
	private static String comentario;
	
	public static void main(String[] args) {
		
		System.out.println("Seleccione una opción a continuación para la gestión de alquiler de películas:");
		System.out.println("1. Consultar Películas Disponibles.");
		System.out.println("2. Alquilar Película.");
		System.out.println("3. Recibir Películas.");
		System.out.println();
		
		Scanner inpOpcion = new Scanner(System.in);
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
		
		if(opcion == 1) {
			System.out.println("A continuación se muestra el listado de películas disponibles:");
			System.out.println("1. Armagedon.");
			System.out.println("2. 2012");
			System.out.println("3. Contra Cara");
			System.out.println("4. Interstellar");
		}else if(opcion == 2){
			System.out.println("Seleccione la película deseada dentro de la lista de películas disponibles:");
			System.out.println("1. Armagedon.");
			System.out.println("2. 2012");
			System.out.println("3. Contra Cara");
			System.out.println("4. Interstellar");
			
			System.out.println();
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1 | opcion == 2 | opcion == 3 | opcion == 4 ) {
				System.out.println("Muchas gracias por su compra, el alquiler es por 7 dias a partir "
						+ "de la fecha.");
			}else {
				System.out.println("Opción no disponible");
			}
		}else if(opcion == 3) {
			Scanner inpPelicula = new Scanner(System.in);
			System.out.println("Cual es el nombre de la pelicula que desea entregar:");
			pelicula = inpPelicula.nextLine();
			System.out.println("Desea realizar anotaciones del estado de entrega de la pelicula?");
			System.out.println("1. Si");
			System.out.println("2. No");
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Describa las novedades del estado de la pelicula y la fecha de "
						+ "entrega.");	
				
				Scanner inpComentario = new Scanner(System.in);
				comentario = inpComentario.nextLine();
				System.out.println("La pelicula " + pelicula + " se encuentra en el siguiente estado: " +
				comentario);
			}else if(opcion == 2) {
				System.out.println("Comentario automatico: La pelicula " + pelicula + " se encuentra "
						+ "en buen estado y sin comentarios.");
			}
		}
	}
}
