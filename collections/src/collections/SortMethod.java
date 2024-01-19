package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
        // Crear una lista de Strings
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Zebra");
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Kiwi");

        // Ordenar la lista
        Collections.sort(lista);

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada: " + lista);
        
        
        // Crear una lista de enteros
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(5);
        lista1.add(2);
        lista1.add(8);
        lista1.add(1);

        // Ordenar la lista
        Collections.sort(lista1);

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada: " + lista1);
        
  
                // Crear un array de caracteres
        char[] array = {'c', 'a', 'e', 'b'};

        // Ordenar el array
        Arrays.sort(array);

        // Mostrar el array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
 
}
