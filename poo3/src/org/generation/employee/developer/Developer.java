package org.generation.employee.developer;

import org.generation.employee.Employee;

public class Developer extends Employee {
    private String lenguajeProgramacion;

    public Developer(String nombreCompleto, int id, double salario, String puesto, String lenguajeProgramacion) {
        super(nombreCompleto, id, salario, puesto);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void codear() {
        System.out.println("El empleado " + this.getNombreCompleto() + " utiliza " + this.lenguajeProgramacion);
    }

    // Método override para el trabajo específico del desarrollador
    @Override
    public void trabajar() {
        System.out.println("El desarrollador " + this.getNombreCompleto() + " está programando en " + this.lenguajeProgramacion);
    }

    @Override
    public String toString() {
        return "Developer [lenguajeProgramacion=" + lenguajeProgramacion + ", getNombreCompleto()="
                + getNombreCompleto() + ", getId()=" + getId() + ", getSalario()=" + getSalario() + ", getPuesto()="
                + getPuesto() + "]";
    }
}

