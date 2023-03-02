package taller2_Condicionales;

import java.util.Scanner;

public class IMC {
	
	private static String nombreEncuestado;
	private static double pesoKilogramos;
	private static double alturaMetros;
	private static double valorIMC;
	private static String rangoIMC;
	private static String terminarEncuesta;
	private static String rangoPeso;
	
	public static void main(String[] args) {
		
		Scanner inpNombreEncuestado = new Scanner(System.in);
		Scanner inpPesoKilogramos = new Scanner(System.in);
		Scanner inpAlturaMetros = new Scanner(System.in);
		
		System.out.println("Documente los campos presentados a continuación:");
		System.out.println("Nombre Completo.");
		nombreEncuestado = inpNombreEncuestado.nextLine();
		System.out.println("Peso en Kilogramos.");
		pesoKilogramos = inpPesoKilogramos.nextDouble();
		System.out.println("Altura en Metros. Con una (,) como separador");
		alturaMetros = inpAlturaMetros.nextDouble();
		
		valorIMC = (pesoKilogramos/(alturaMetros * alturaMetros));
		
		if(valorIMC < 18.5) {
			rangoPeso = "Bajo peso";
			System.out.println("El encuestado " + nombreEncuestado + " tiene un IMC de " + valorIMC + " y el "
					+ "rango en que se encuentra es " + rangoPeso);
		}else if(valorIMC >= 18.5 && valorIMC <= 24.9) {
			rangoPeso = "Normal";
			System.out.println("El encuestado " + nombreEncuestado + " tiene un IMC de " + valorIMC + " y el "
					+ "rango en que se encuentra es " + rangoPeso);
		}else if(valorIMC >= 25.0 && valorIMC <= 29.9) {
			rangoPeso = "Sobrepeso";
			System.out.println("El encuestado " + nombreEncuestado + " tiene un IMC de " + valorIMC + " y el "
					+ "rango en que se encuentra es " + rangoPeso);
		}else if(valorIMC >= 30) {
			rangoPeso = "Obeso";
			System.out.println("El encuestado " + nombreEncuestado + " tiene un IMC de " + valorIMC + " y el "
					+ "rango en que se encuentra es " + rangoPeso);
		}
	}
}
