package loops;

public class ContinueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int num =1; num <= 100; num++) {
			if(num %4 == 0) {
				System.out.println("Numero número " + num + " es divisible");
				continue; //En este caso evita que aparezcan dobles los numeros
			} System.out.println("Numero numero " + num);

	}

}
