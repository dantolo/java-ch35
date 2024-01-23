package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableMain {
	public static void main(String[] args) {
		// 1. iteracion ciclo for-each
		List <String> nombres = new ArrayList<String>();
		nombres.addAll(Arrays.asList("Braulio", "Fernanda", "Rodrigo", "Ruben", "Marco", "Rey"));
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		//2.iterar mediante Iterator
		
		List <String> apellidos = new ArrayList<String>();
		
		apellidos.addAll(Arrays.asList("Aleman", "Garcia", "Martinez", "Cardoso", "Razo", "Ceja"));
		//Utilizar un nuevo Iterador y le vamos a pasar el metodo .iterator()
		Iterator<String> iterador = apellidos.iterator();
		//Utilizando while
		while(iterador.hasNext()) {
			String elemento = iterador.next();
			System.out.println(elemento);
		}
		//3. mediante for Each que toma una expresion Lambda
		System.out.println("***************LAMBDA***********");
		List<String> animales = new ArrayList<String>();
		
		animales.addAll(Arrays.asList("Cuyo", "Nahual", "Tlacuache", "Ajolote", "Tepezcuintle", "Vaquita mamrina"));
		
		animales.forEach((animal) -> {
			System.out.println(animal);
			
		});
	}
}
