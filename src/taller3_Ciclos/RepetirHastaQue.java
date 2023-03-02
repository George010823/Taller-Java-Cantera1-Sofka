package taller3_Ciclos;

public class RepetirHastaQue {

	private static int alturaArbol, baseArbol, k, i, na, ne;
	private static String asterisco;
	private static boolean terminado;
	
	public static void main(String[] args) {
		
		alturaArbol = 12;
		na = 1;
		ne = 15;
		i = 1;
		terminado = false;
		
		do {
			do {
				k = 0;
				do {
					System.out.print(" ");
					k = k + 1;
				}while(k <= ne);
				asterisco = "";
				
				k = 0;
				do {
					asterisco = asterisco + "*";
					k = k + 1;
				}while(k < na);
				
				System.out.println(asterisco);
				
				na = na + 2;
				ne = ne -1;
				i ++;
			}while(i <= alturaArbol);
			
			baseArbol = 5;
			na = 1;
			ne = 13;
			k = 1;
			i = 1;
			
			do {
				k = 0;
				do {
					if(i > 2) {
						ne = 11;
						System.out.print(" ");
						k ++;
					}else {
						System.out.print(" ");
						k ++;
					}
				}while(k <= ne);
				asterisco = "";
				
				k = 0;
				do {
					if(i > 2) {
						asterisco = asterisco + "****";
						k ++;
					}else {
						asterisco = asterisco + "**";
						k ++;
					}
				}while(k <= na);
				System.out.println(asterisco);
				
				na = na;
				ne = 13;
				i = i + 1;
			}while(i < baseArbol);
			terminado = true;
		}while(terminado == false);
	}
}
 