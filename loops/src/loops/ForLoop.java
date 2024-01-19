package loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for variable local
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero es igual a " + numero);
		}
		// for con variable global
		int contador;
		for (contador = 1; contador <=5; contador++) {
			System.out.println("La cuenta es " + contador);
		}
		*/
		//bucles anidados
		
		int filas = 5;

		for (int i = 0; i < filas; i++) {
		    for (int j = 0; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();  // Añadido para pasar a la siguiente línea después de cada fila
		}

	}//metodo

}//clase



