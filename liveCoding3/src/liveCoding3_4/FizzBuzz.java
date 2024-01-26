package liveCoding3_4;
/* Dante Ibarra, Baruch me dijo que trabaje muy bien y aunque tuve que buscar documentacion logre imprimir todos los fizz y buzz. Calificacion de Baruch 6/6.
*/
public class FizzBuzz {
	
	
	public static void main(String[] args) {
		
	        int[] n = new int[100];

	        for (int i = 0; i < 100; i++) {
	            n[i] = i + 1;  // Asignar directamente el valor de i + 1
	        }

              

      

        for (int e : n) {
            if ((e % 5 == 0) && (e % 3 == 0)) {
            	System.out.println("FizzBuzz");
            } else if (e % 5 == 0){ 
                System.out.println("Buzz");
            }else if (e % 3 == 0) {
            	System.out.println("Fizz");
            } else {
            	System.out.println(e);
            }
            
        }
     
    }
}
