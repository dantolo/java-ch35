package excercises;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {

	public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        String nombreEstudiante;
        do {
            System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' para finalizar.");
            nombreEstudiante = scanner.nextLine();
            
            if (!nombreEstudiante.equalsIgnoreCase("Salir")) {
                estudiantes.add(nombreEstudiante);
                System.out.println("Estudiante agregado.");
            }

        } while (!nombreEstudiante.equalsIgnoreCase("Salir"));

        // Mostrar lista de estudiantes antes de la eliminación
        System.out.println("************Lista de Estudiantes************");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Eliminar un estudiante (insensible a mayúsculas/minúsculas)
        System.out.println("Ingresa el nombre del estudiante que deseas eliminar:");
        String estudianteEliminar = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
        estudiantes.removeIf(estudiante -> estudiante.toLowerCase().equals(estudianteEliminar));

        // Mostrar lista de estudiantes después de la eliminación
        System.out.println("************Lista Actualizada de Estudiantes************");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        scanner.close();
    }
}
