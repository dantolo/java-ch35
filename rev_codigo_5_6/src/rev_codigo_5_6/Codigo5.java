//Dante Ibarra, calificacion compañero 5/5
package rev_codigo_5_6;

import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int ni = Integer.parseInt(scan.nextLine());

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10; // ni  = ni/10
        }

        // Comparación fuera del bucle
        if (afo > noAfo) {
            System.out.println("El número ingresado es afortunado.");
        } else {
            System.out.println("El número ingresado no es afortunado.");
        }

        scan.close();

    }
}


