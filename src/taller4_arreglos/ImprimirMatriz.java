package taller4_arreglos;

public class ImprimirMatriz {

	public static void main(String[] args) {
		int fila, columna;
		int[][] matriz = new int[4][5];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[1][0] = 6;
		matriz[1][1] = 7;
		matriz[1][2] = 8;
		matriz[1][3] = 9;
		matriz[1][4] = 10;
		matriz[2][0] = 11;
		matriz[2][1] = 12;
		matriz[2][2] = 13;
		matriz[2][3] = 14;
		matriz[2][4] = 15;
		matriz[3][0] = 16;
		matriz[3][1] = 17;
		matriz[3][2] = 18;
		matriz[3][3] = 19;
		matriz[3][4] = 20;
		
		for(fila = 0; fila <= 0; fila++) {
			for(columna = 0; columna <= 4; columna++) {
				System.out.print("0" + matriz[fila][columna] + " ");
			}
			System.out.println("");
		}
		for(fila = 1; fila <= 1; fila++) {
			for(columna = 4; columna >= 0; columna--) {
				if(matriz[fila][columna] != 10) {
					System.out.print("0" + matriz[fila][columna] + " ");
				}else {
					System.out.print(matriz[fila][columna] + " ");
				}
			}
			System.out.println("");
		}
		for(fila = 2; fila <= 2; fila++) {
			for(columna = 0; columna <= 4; columna++) {
				System.out.print(matriz[fila][columna] + " ");
			}
			System.out.println("");
		}
		for(fila = 3; fila <= 3; fila++) {
			for(columna = 4; columna >= 0; columna--) {
				if(matriz[fila][columna] != 10) {
					System.out.print(matriz[fila][columna] + " ");
				}
			}
			System.out.println("");
		}
	}
}
