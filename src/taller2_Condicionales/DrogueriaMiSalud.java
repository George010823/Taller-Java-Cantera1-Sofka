package taller2_Condicionales;

import java.util.Scanner;

public class DrogueriaMiSalud {

	private static int opcion;
	private static String producto;
	
	public static void main(String[] args) {
		
		System.out.println("Seleccione una opción a continuación:");
		System.out.println("1. Comprar Producto.");
		System.out.println("2. Consultar Precios.");
		System.out.println("3. Devoluciones.");
		System.out.println();
		
		Scanner inpProducto = new Scanner(System.in);
		Scanner inpOpcion = new Scanner(System.in);
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
		
		if(opcion == 1) {
			System.out.println("Seleccione el producto que quiere comprar:");
			System.out.println("1. Acetaminofem.");
			System.out.println("2. Ibuprofeno");
			System.out.println("3. Dolex");
			System.out.println("4. Vitamina C");
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Muchas gracias por su compra, reciba su factura del producto Acetaminofen "
						+ "y regrese pronto.");	
			}else if(opcion == 2) {
				System.out.println("Muchas gracias por su compra, reciba su factura del producto Ibuprofeno "
						+ "y regrese pronto.");
			}
			else if(opcion == 3) {
				System.out.println("Muchas gracias por su compra, reciba su factura del producto Dolex "
						+ "y regrese pronto.");
			}
			else if(opcion == 4) {
				System.out.println("Muchas gracias por su compra, reciba su factura del producto Vitamina C "
						+ "y regrese pronto.");
			}else {
				System.out.println("La opcion elegida no existe.");
			}
		}else if(opcion == 2) {
			System.out.println("Seleccione el producto del cual desea conocer el precio:");
			System.out.println("1. Acetaminofem.");
			System.out.println("2. Ibuprofeno");
			System.out.println("3. Dolex");
			System.out.println("4. Vitamina C");
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Tableta de Acetaminofem x 10 Und 1500 pesos.");	
			}else if(opcion == 2) {
				System.out.println("Tableta de Ibuprofeno x 2 Und 2500 pesos.");
			}
			else if(opcion == 3) {
				System.out.println("Dolex por unidad 700 pesos.");
			}
			else if(opcion == 4) {
				System.out.println("Tableta de Vitamina C x 10 Und 3500 pesos.");
			}else {
				System.out.println("La opcion elegida no existe.");
			}
		}else if(opcion == 3) {
			System.out.println("Escriba el nombre del producto que desea devolver:");
			producto = inpProducto.nextLine();
			System.out.println("1. Cambio de producto.");
			System.out.println("2. Devolucion de dinero.");
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			if(opcion == 1) {
				System.out.println("Disculpe las molestias, su producto " + producto + " sera cambiado. Aplican"
						+ " terminos y condiciones.");	
			}else if(opcion == 2) {
				System.out.println("Disculpe las molestias, el dinero de su producto " + producto + " sera "
						+ "devuelto.");
			}else {
				System.out.println("La opcion elegida no existe.");
			}
		}
	}
}
