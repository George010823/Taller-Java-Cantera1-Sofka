package taller4_arreglos;

import javax.swing.text.Position;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int incremento = 0;
		int posicion = 0;
		int contador = 0;
		int numeroVector = 0;
		int[ ] enteros = new int[1000];
		
		for(int i = 1; i<enteros.length; i++) {
			enteros[i] = i;	
		}
		
		for(contador = 0; contador < 1000; contador++) {
			incremento = 0;
			numeroVector = enteros[contador];
			
			for(int i = 1; i <= numeroVector; i++) {
				if(numeroVector % i == 0) {
					incremento ++;
				}
			}
			if(incremento == 2) {
				System.out.println(numeroVector + " es un número primo.");
			}
		}
	}
}
