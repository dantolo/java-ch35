package org.generation.employee.manager;

public class ManagerMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager Fernanda = new Manager("Fernanda Ramos", 136, 45365.20, "Manager", 2);
		System.out.println(Fernanda);
		
		//metodo calcular salario
		
		double salarioFer = Fernanda.getSalarioBase();
		
		System.out.println("El salario de " + Fernanda.getNombreCompleto() + " con posicion de " + Fernanda.getPuesto() + " es de $ " + salarioFer + " pero posee una antiguedad de " + Fernanda.getAntiguedad() +  " años, por lo tanto su salario incrementa a " + Fernanda.getSalario() );
		
				}

}
