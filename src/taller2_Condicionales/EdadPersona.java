package taller2_Condicionales;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class EdadPersona implements AutoCloseable {
	
	private static String edadPersona;
	
	public static void main(String[] args) throws Exception {
        
        System.out.println("Complete los datos solicitados a continuación:");
        System.out.print ("Introduzca un número de 2 dígitos para la edad: ");
		Scanner inpEdadPersona = new Scanner(System.in);
		edadPersona = inpEdadPersona.nextLine();
		
        if (edadPersona.length() != 2) {
        	throw new Exception("La cantidad de digitos de la edad estan fuera de rango.");
        } else if(Character.isDigit(edadPersona.charAt(0)) == false || Character.isDigit(edadPersona.charAt(1)) == false) {
        	throw new Exception(" ... no es un número, entrada no válida.");
        	}else if(Integer.parseInt(edadPersona) >= 18) {
    			System.out.println("Usted es mayor de edad.");
    		}   
    }

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
