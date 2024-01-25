package org.generation.employee.manager;

import org.generation.employee.Employee;

public class Manager extends Employee {
  //1. Atributos
	private int antiguedad;
	private double incremento;
	
	
	
	//2. constructor nota:


	public Manager(String nombreCompleto, int id, double salario, String puesto, int antiguedad) {
	    super(nombreCompleto, id, salario, puesto);
	    this.antiguedad = antiguedad;
	    this.calcularIncremento(); // Calcula el incremento al momento de la creación
	}

	
	//metodo del  usuario 
	
	public void organizarReunion() {
		System.out.println("El manager " + this.getNombreCompleto() + " convoca a una reunión");
		
	}
	//obtener salario sin bono
		
		double salarioBase = super.getSalario();
		
		
		
		
		//overriding (anulación de métodos)
	
	public void calcularIncremento() {
		if (this.antiguedad >= 1) {
			//operacion matematica para determinar el bono con base en la antiguedad
			double incrementoTotal = 1000 + (this.antiguedad - 1 ) *500 ;
			this.setIncremento(incrementoTotal);
		}else{
			this.setIncremento(0);
			System.out.println("No hay incremento");
		}
	}
		
		
		
		
	//4. Getters y setters
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double getIncremento() {
		return incremento;
	}
	
	public void setIncremento(double incremento) {
	    this.incremento = incremento;
	}

	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	
	
	//metodo para calcular el salario con incremento
	public void calcularSalario() {
		
		double salarioManager = salarioBase + this.getIncremento();
			System.out.println("El salario del manager " + this.getNombreCompleto() + "es de $ " + salarioManager);
		
	}
	
		
		// to string
	
	
		
		
	//5. toString. Para generar el toString y mandar a llamar los atributos de la superclase, debo seleccionar los getters de los atributos heredados. Después, puedo modificar el return según mi conveniencia
		@Override
		public String toString() {
			return "Manager [antiguedad=" + antiguedad + ", incremento=" + incremento + ", nombre="
					+ getNombreCompleto() + ", id=" + getId() + ", salario=" + getSalario() + ", puesto="
					+ getPuesto() + "]";
		}
		
		
	}

