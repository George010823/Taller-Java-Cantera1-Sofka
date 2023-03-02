package taller3_Ciclos;

public class MientrasHacer {

	private static int columna, fila, simbolo;
	
	public static void main(String[] args) {
		
		columna = 10;
		while(columna >= 1) {
			fila = 1;
			while(fila <= columna) {
				System.out.print(" ");
				fila ++;
			}
			for(simbolo = 10; simbolo >= columna; simbolo--) {
				System.out.print("*");
			}
			columna --;
			System.out.println("");
		}
	}
}
