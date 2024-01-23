package org.generation.banco;


// en esta clase se definen los metodos que arrojan excepciones, siempre que en la clase cajero se dispare 
/*
 * Requerimientos:
 * 1. Trabajar bajo el paradigma POO
 * 2. Indicar que la clase es una Exception mediante herencia (extends)
 * 3. Crear variables y metodos para instanciar objetos
 * 4. instanciar objetos
 * 
 * 
 * */
public class FondosInsuficientesException extends Exception {
	private static final long serialVersionUID = 1L;
		//Atributos
	private double monto;
		//Constructor
	public FondosInsuficientesException(double monto) {
		this.monto = monto;
	}
		//getter y setter
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
}
