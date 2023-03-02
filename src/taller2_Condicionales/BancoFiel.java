package taller2_Condicionales;

import java.util.Scanner;

public class BancoFiel {

	private static String nombreTitular;
	private static String identificacionTitular;
	private static int cantidadCuenta = 1500;
	private static int cantidadDeposito;
	private static int cantidadRetiro;
	private static int opcion;
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a su sistema bancario Su Banco Fiel, por favor seleccione una de las "
				+ "opciones presentadas a continuación:");
		System.out.println("1. Consultar saldo cuenta.");
		System.out.println("2. Depositar.");
		System.out.println("3. Retirar.");
		
		Scanner inpNombreTitular = new Scanner(System.in);
		Scanner inpIdentificacionTitular = new Scanner(System.in);
		Scanner inpCantidadDeposito = new Scanner(System.in);
		Scanner inpCantidadRetiro = new Scanner(System.in);
		Scanner inpOpcion = new Scanner(System.in);
		
		
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
		
		if(opcion == 1) {
			System.out.println("Digite los siguientes campos para validar su identidad:");
			System.out.println("Nombre Titular.");
			nombreTitular = inpNombreTitular.nextLine();
			System.out.println("Identificación Titular.");
			identificacionTitular = inpIdentificacionTitular.nextLine();
			
			System.out.println("El saldo de la cuenta del titular " + nombreTitular + " con identificación " 
					+ identificacionTitular + " es de $ " + cantidadCuenta);

		}else if(opcion == 2) {
			cantidadCuenta = 1500;
			System.out.println("Digite los siguientes campos para validar su identidad:");
			System.out.println("Nombre Titular.");
			nombreTitular = inpNombreTitular.nextLine();
			System.out.println("Identificación Titular.");
			identificacionTitular = inpIdentificacionTitular.nextLine();
			System.out.println("Digite el saldo a depositar:");
			cantidadDeposito = inpCantidadDeposito.nextInt();
			
			if(cantidadDeposito > 0) {
				System.out.println("Usted ha depositado $" + cantidadDeposito + " pesos a nombre del titular " +
						nombreTitular);
				cantidadCuenta += cantidadDeposito;
				System.out.println("Cuenta completa con saldo depositado " + cantidadCuenta); 
			}else {
				System.out.println("El saldo depositado no puede ser negativo o 0, por favor valide la cantidad "
						+ "a depositar.");
			}
			
		}else if(opcion == 3) {
			System.out.println("Digite los siguientes campos para validar su identidad:");
			System.out.println("Nombre Titular.");
			nombreTitular = inpNombreTitular.nextLine();
			System.out.println("Identificación Titular.");
			identificacionTitular = inpIdentificacionTitular.nextLine();
			System.out.println("Digite el saldo a retirar:");
			cantidadRetiro = inpCantidadRetiro.nextInt();
			
			if(cantidadRetiro > cantidadCuenta) {
				System.out.println("El monto a retirar supera el saldo de la cuenta, por favor verifique de "
						+ "nuevo el monto a retirar o el saldo de su cuenta.");
			}else {
				System.out.println("Acaba de retirar $ " + cantidadRetiro + " de la cuenta del titular " 
						+ nombreTitular);
				cantidadCuenta -= cantidadRetiro;
				System.out.println("Cuenta completa despues de retiro de saldo " + cantidadCuenta); 
			}
		}
	}
}
