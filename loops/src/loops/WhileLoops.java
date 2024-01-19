package loops;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*
 int cuenta = 0;
 while (cuenta < 10){
 	cuenta ++;
 	System.out.println("la cuenta es de " + cuenta);
 }
 */
		
		
/* Scanner sc = new Scanner(System.in);
 
 System.out.println("Escribe un numero que servirá como numero final de una cuenta");
 
 int nFinal = sc.nextInt();
 
 int nInicial = -2;
 
 while(nInicial <= nFinal) {
	 System.out.println("La cuenta va en " + nInicial);
	 nInicial += 2;
 }
 sc.close();*/
 
		
		Scanner scr = new Scanner(System.in);
        int opcion;
        boolean continuar = true;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");

            // Verificar si la entrada es un entero
            if (scr.hasNextInt()) {
                opcion = scr.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Consultar Saldo");
                        break;
                    case 2:
                        System.out.println("Ingresar Dinero");
                        break;
                    case 3:
                        System.out.println("Retirar Dinero");
                        break;
                    case 4:
                        System.out.println("Salir, por favor tome su dinero y/o recibo");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        continuar = false;
                        break;
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                continuar = false;
                break;
            }

        } while (continuar);

        // Cerrar el scanner al finalizar
        scr.close();
 
 
 
	}

}
