package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martinez", 5274, 19754.20d, "Desarrolladora Front End");
		Employee Arturo = new Employee("Arturo", "Avila", 4403, 18000, "Desarrollador Backend");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		//invocando metodos definidos
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		
		//Utilizar informacion especifica de cada objeto mediantes sus propiedades 
		
		System.out.println(Daniel.getNombre()+ " " + Daniel.getApellido() + " ocupa el puesto de " + Daniel.getPuesto());
		
		//actualizando mediante setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
		
	}

}
