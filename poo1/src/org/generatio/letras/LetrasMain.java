package org.generatio.letras;

public class LetrasMain {
	public static void main(String[] args) {
		//Instanciar objetos (letras y contador)
		Letras letras = new Letras();
		letras.mostrarMensaje("Escribe un texto y te mostraré el numero de vocales, consonantes, simbolos y números");
		String palabra = letras.leerEntrada();// guardamos el texto en palabra
		
		//invocar los metodos 
		Contador contador = new Contador();
		int totalVocales = contador.contarVocales(palabra);
		System.out.println("Hay " + totalVocales + " Vocales");
		int totalNumeros = contador.contarNumeros(palabra);
		System.out.println("Hay " + totalNumeros + " Números");
		int totalConsonantes = contador.contarConsonantes(palabra);
		System.out.println("Hay " + totalConsonantes + " Consonantes");
		int totalSimbolos = contador.contarSimbolos(palabra);
		System.out.println("Hay " + totalSimbolos + " Simbolos");
	}
}
