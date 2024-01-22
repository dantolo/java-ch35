package org.generatio.letras;
import java.util.Scanner;
public class Letras {

	
	//interactuar
	Scanner scanner = new Scanner(System.in);
	
	//metemos el scanner dentro de un metodo
	public String leerEntrada() {
		return scanner.nextLine();
	}
	//Metodo para proporcionar contexto al usuario
	
	public void mostrarMensaje(String mensaje){
	System.out.println(mensaje);
	}
	
}
