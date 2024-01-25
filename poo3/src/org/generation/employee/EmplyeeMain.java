package org.generation.employee;

public class EmplyeeMain {
	public static void main (String[] args) {
		Employee Rocio = new Employee ("Rocio Hernandez", 42013, 12000 , "Desarollador Frontend");
		Employee Rene = new Employee ("René Goméz", 97565, 15499 , "Desarollador Backend");
		Employee Diego = new Employee ("Diego Gonzalez", 0054, 25120.52 , "Desarollador móvil");
		
		Rocio.trabajar();
		Rene.infoGeneral();
		Diego.CalcularSalario();
		
		
		
	}
	
}
