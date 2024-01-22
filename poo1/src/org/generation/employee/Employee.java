package org.generation.employee;

public class Employee {


//1.Atributos o priopiedades

String nombre;
String apellido;
int id;
double salario;
String puesto;



//2. Método constructor.
Employee(String nombre, String apellido, int id, double salario, String puesto){
	this.nombre = nombre;
	this.apellido = apellido;
	this.id = id;
	this.salario = salario;
	this.puesto = puesto;
}


// 3. Métodos de comportamiendo
void trabajar() {
	System.out.println("Estoy Trabajando");
	
}

void calcularSalario() {
	System.out.println("El salario del empleado es de " + this.salario + " pesos");
}


void capacitarse() {
	System.out.println("El trabajador del puesto " + this.puesto + " se capacita");
}

void infoGeneral() {
	System.out.println("Id: " + this.id + " Nombre: " + this.nombre + " Apellido " + this.apellido);
}





//4. getters and setters 

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public String getPuesto() {
	return puesto;
}


public void setPuesto(String puesto) {
	this.puesto = puesto;
}


//5. metodo ToString
@Override
public String toString() {
	return "Employee ["
			+ "nombre=" + nombre + 
			", apellido=" + apellido + 
			", id=" + id + 
			", salario=" + salario + 
			", puesto=" + puesto + "]";
}







}
