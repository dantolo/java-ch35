package collections;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {
        // Crear un HashSet de tipo String
        HashSet<String> set = new HashSet<>();

        // Agregar elementos al HashSet
        set.add("Elemento 1");
        set.add("Elemento 2");
        set.add("Elemento 3");

        // Mostrar el HashSet
        System.out.println("HashSet: " + set);

        // Crear un HashSet de tipo Integer
        HashSet<Integer> set1 = new HashSet<>();

        // Agregar elementos al HashSet (con duplicados)
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2); // Duplicado, no se agrega

        // Mostrar el HashSet sin duplicados
        System.out.println("HashSet sin duplicados: " + set1);

        HashSet<String> set11 = new HashSet<>();

        // Agregar elementos al HashSet
        set11.add("Elemento 1");
        set11.add("Elemento 2");
        set11.add("Elemento 3");

        // Verificar si un elemento está presente
        boolean contieneElemento = set11.contains("Elemento 2");
        System.out.println("¿Contiene 'Elemento 2'? " + contieneElemento);
    }
}

