package tiposDeDatosyVariables;

public class tiposDeDatosYVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo,");
		
		
		
		/*Comentarios
		 * multilinea*/
		// comentarios de una linea
		
		/*
		
		byte edad = 15;// Sirve para representar un numero entero 8bits
		
		System.out.println(" La Edad del participante es " + edad);
		
		short usuariosNuevos = 200; // Sirve para representar un numero entero de 16 bits
		
		System.out.println(" usuarios nuevos " + usuariosNuevos);		
		
		int usuariosTotales = 8752; // sirve para representar un numero entero de 32 bits
		
		System.out.println(" usuarios totales " + usuariosTotales);	
		
		long usuariosPremium = 9512; // sirve para representar un numero entero con valores mucho mayores
			
			System.out.println(" usuarios premium " + usuariosPremium);
		//tipos de datos con decimales
		
		float altura = 1.16f; // sirve para representar un valor numerico con decimales, cuyo valor es de 23 bits 
		
		System.out.println(" Altura del usuario " + altura);
		
		double peso = 68.200;// sirve para representar valores numericos con decimales, cuyo valor es de 64 bits
		
		System.out.println(" peso del usuario: " + peso);
		
		String nombreUsuario = "500";
		System.out.println(" Usuario: " + nombreUsuario);
		
		char seccion = 'f';
		System.out.println(" sección: " + seccion);
		
		String zonaBoleto ="52";
		
		boolean clienteFrecuente = true;
		
		System.out.println(" Es un cliente frecuente: " + clienteFrecuente);
		
		
		
		//conversion de tipos
		
		//casteo a entero
		
		
		int pesoCambio = (int) peso;
		
		//casteo entero
		
		long pesoCambio1 = (long) peso;
		
		System.out.println(" double: " + peso);
		System.out.println(" entero: " + pesoCambio);
		System.out.println(" long: " + pesoCambio1);
		
		int nombreCambio = Integer.parseInt(nombreUsuario);
		
		double zonaCambio = Double.parseDouble(zonaBoleto);
		
		System.out.println(" Zona de usuario según su boleto  " + (nombreCambio * zonaCambio));
		
		
		//operadores aritmeticos
		
		/* +suma
		- resta
		*multiplicaion 
		/ division
		% residuo  */
		
		
		/* operadores de comparacion 
		 !=
		 == 
		 >
		 < 
		 >= 
		 <=
		 */
		
		
		//programa para un cine

		double precioEntrada = 75.50;
		double precioPalomitas = 89.70;
		double precioBebida = 35.50;
		int capacidadTotal = 500;

		int personasDentro = 550;


		if (personasDentro >= capacidadTotal) {
			System.out.println("Lo lamento, ya no hay cupo");
		} else {
			System.out.println("Quedan " + (capacidadTotal - personasDentro) + " lugares disponibles");
		}
		    double totalEntradas = personasDentro * precioEntrada;
		    double totalPalomitas = personasDentro * precioPalomitas;
		    double totalBebidas = personasDentro * precioBebida;

		    System.out.println("Total de personas: " + personasDentro);
		    System.out.println("Total de entradas: " + totalEntradas);
		    System.out.println("Total de palomitas: " + totalPalomitas);
		    System.out.println("Total de bebidas: " + totalBebidas);
		

		
		
		
	
		
		
	}

}
