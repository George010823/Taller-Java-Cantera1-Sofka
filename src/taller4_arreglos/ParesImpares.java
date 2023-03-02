package taller4_arreglos;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		int incrementoPar = 0;
		int incrementoImpar = 0;
		int[ ] enteros = new int[100];
		
		for(int i=0; i<enteros.length; i++) {
			enteros[i] = (int) (Math.random()*100)+1;
		}
		
		for(int i=0; i < 19; i++) {
			if(enteros[i] % 2 == 0) {
				if(incrementoPar == 0) {
					System.out.println("");
					incrementoPar = 1;
					System.out.print("Números pares: ");
				}
				if(i == 19) {
					System.out.print(enteros[i]);
				}else {
					System.out.print(enteros[i] + ", ");
				}
			}
		}
		System.out.println("");
		
		for(int i=0; i < 19; i++) {
			if(enteros[i] % 2 != 0) {
				if(incrementoImpar == 0) {
					System.out.println("");
					incrementoImpar = 1;
					System.out.print("Números impares: ");
				}
				if(i == 19) {
					System.out.print(enteros[i]);
				}else {
					System.out.print(enteros[i] + ", ");
				}
			}
		}
	}
}
