package taller2_Condicionales;

import java.util.Scanner;

public class CalcularArea {

	private static double largoRectangulo;
	private static double anchoRectangulo;    
	private static double baseTriangulo;      
	private static double alturaTriangulo;    
	private static double baseUnoTrapecio;    
	private static double baseDosTrapecio;    
	private static double alturaTrapecio;     
	private static double areaFigura;         
	private static int opcion; 
	
	public static void main(String[] args) {
		
		System.out.println("Seleccione la operación que desea realizar:");
		System.out.println("1. Calcular area de un rectangulo.");
		System.out.println("2. Calcular area de un triangulo.");
		System.out.println("3. Calcular area de un trapecio.");
		
		Scanner inpLargoRectangulo = new Scanner(System.in);
		Scanner inpAnchoRectangulo = new Scanner(System.in);
		Scanner inpBaseTriangulo = new Scanner(System.in);
		Scanner inpAlturaTriangulo = new Scanner(System.in);
		Scanner inpBaseUnoTrapecio = new Scanner(System.in);
		Scanner inpBaseDosTrapecio = new Scanner(System.in);
		Scanner inpAlturaTrapecio = new Scanner(System.in);
		Scanner inpOpcion = new Scanner(System.in);
		
		System.out.println("Escriba su opción:");
		opcion = inpOpcion.nextInt();
				
		if(opcion == 1) {
			System.out.println("RECTANGULO AREA = BASE * ALTURA");
			System.out.println("Escriba el valor del largo del rectangulo:");
			largoRectangulo = inpLargoRectangulo.nextDouble();
			System.out.println("Escriba el valor del ancho del rectangulo:");
			anchoRectangulo = inpAnchoRectangulo.nextDouble();
						
			areaFigura = largoRectangulo * anchoRectangulo;
			System.out.println("El area del rectangulo es: " + areaFigura + " metros cuadrados.");
			
		}else if(opcion == 2) {
			System.out.println("TRIANGULO AREA = (BASE * ALTURA)/2");
			System.out.println("Escriba el valor de la base del triangulo:");
			baseTriangulo = inpBaseTriangulo.nextDouble();
			System.out.println("Escriba el valor de la altura del triangulo:");
			alturaTriangulo = inpAlturaTriangulo.nextDouble();
						
			areaFigura = (baseTriangulo * alturaTriangulo) / 2;
			System.out.println("El area del triangulo es: " + areaFigura + " metros cuadrados.");
			
		}else if(opcion == 3) {
			System.out.println("TRAPECIO AREA = ((BASE + BASE) * ALTURA)/2");
			System.out.println("Escriba el valor de la base 1 del trapecio:");
			baseUnoTrapecio = inpBaseUnoTrapecio.nextDouble();
			System.out.println("Escriba el valor de la base 2 del trapecio:");
			baseDosTrapecio = inpBaseDosTrapecio.nextDouble();
			System.out.println("Escriba el valor de la altura del trapecio:");
			alturaTrapecio = inpAlturaTrapecio.nextDouble();
						
			areaFigura = ((baseUnoTrapecio + baseDosTrapecio) * alturaTrapecio) / 2;
			System.out.println("El area del trapecio es: " + areaFigura + " metros cuadrados.");
		}
	}
}
