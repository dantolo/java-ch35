package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        /*mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        // Elegir un elemento específico usando la clave
        int valorElegido = mapa.get("clave2");  // Seleccionar el valor asociado a la clave "clave2"

        // Mostrar el valor seleccionado
        System.out.println("Valor seleccionado: " + valorElegido);*/
        
        
        //************ Ejemplo 02********///
        Map<String, Integer> calificaciones = new HashMap<String, Integer>();

        // Agregar elementos al HashMap
        calificaciones.put("Rene", 9);
        calificaciones.put("Dante", 7);
        calificaciones.put("Alberto", 10);
        calificaciones.put("Jorge", 5);
        calificaciones.put("Carlos", 8);

        // Iterar sobre el HashMap e imprimir las calificaciones
        for (Map.Entry<String, Integer> calificacion : calificaciones.entrySet()) {
            System.out.println("La calificación de " + calificacion.getKey() + " es de " + calificacion.getValue());
        }

	}

}
