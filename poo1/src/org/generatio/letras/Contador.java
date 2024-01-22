package org.generatio.letras;

/*Contador: métodos para contar vocales, consonantes, numero y caracteres*/

public class Contador {
	
	//grupo 1
	public boolean esVocal(char caracter) {
		return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
		caracter == 'A' || caracter == 'B' || caracter == 'C' || caracter == 'D' || caracter == 'E');
	}
	public boolean esNumero(char caracter) {
		//casting para poder utilizar la tabla ASCII
		short codigoAscii = (short)caracter;
		return codigoAscii >= 48 && codigoAscii <= 57;
	}
	public boolean esConsonante(char caracter) {
		//casting para consonantes
		short codigoAscii = (short)caracter;
		return ((codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >= 97 && codigoAscii <= 122)) && !esVocal(caracter);
	}
	public boolean esSimbolo(char caracter) {
		return !(esVocal(caracter) || esNumero(caracter) || esConsonante(caracter));
	}
	
	
	
	
	//grupo 2
	public int  contarVocales(String palabra) {
		int vocales = 0;
		for (char caracter : palabra.toCharArray()) {
			if(esVocal(caracter)) {
				vocales++;
			}
		}
		return vocales;
		
	}
	public int  contarNumeros(String palabra) {
		int numeros = 0;
		for (char caracter : palabra.toCharArray()) {
			if(esNumero(caracter)) {
				numeros++;
			}
		}
		return numeros;
		
	}
	
	public int  contarConsonantes(String palabra) {
		int consonantes = 0;
		for (char caracter : palabra.toCharArray()) {
			if(esConsonante(caracter)) {
				consonantes++;
			}
		}
		return consonantes;
		
	}
	public int  contarSimbolos(String palabra) {
		int simbolos = 0;
		for (char caracter : palabra.toCharArray()) {
			if(esSimbolo(caracter)) {
				simbolos++;
			}
		}
		return simbolos;
		
	}
	
	

}
