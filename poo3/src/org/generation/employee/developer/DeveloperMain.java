package org.generation.employee.developer;

public class DeveloperMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Developer Baruch = new Developer("Baruch Moreno", 418005, 18632, "Programador", "Java");
        System.out.println(Baruch);

        Baruch.CalcularSalario();
    }

}
