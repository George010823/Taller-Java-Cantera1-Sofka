package taller3_Ciclos;

public class CicloPara {
	
	private static int columna, fila;
	
	public static void main(String[] args) {
		
		for(columna = 1; columna <= 10; columna++) {
			for(fila = 1; fila <= columna; fila++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
