/**
 * 
 */
package org.generation.overloading;

import java.math.BigDecimal;

public class Suma {
	
	// Creando dos métodos llamados sumar, el primero recibirá dos parámetros de tipo int,
	// mientras que el segundo recibirá dos parámetros de tipo double	
	
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	static double sumar(double num1, double num2) {
		return num1 + num2;
	}
	//Big Decimal
	static BigDecimal sumar(BigDecimal num1, BigDecimal num2) {
return num1.add(num2);// metodo para sumar dos numeros

}
	
}
