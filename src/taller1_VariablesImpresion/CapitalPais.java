package taller1_VariablesImpresion;

import java.util.Scanner;

public class CapitalPais {

	private static String nombreCapital;
	private static String nombrePais;
	
public static void main(String[] args) {
		
		System.out.println("Complete los datos solicitados a continuación:");
		Scanner inpNombreCapital = new Scanner(System.in);
		System.out.println("Escriba el Nombre de una ciudad capital de su interes:");
		nombreCapital = inpNombreCapital.nextLine();
		
		Scanner inpNombrePais = new Scanner(System.in);
		System.out.println("Escriba el nombre del país de la ciudad capital escrita anteriormente:");
		nombrePais = inpNombrePais.nextLine();
		
		System.out.println("La ciudad " + nombreCapital + " es la capital de país " + nombrePais);
	}

}
