package liveCoding3_4;

import java.util.Scanner;

class MangosNaranjas {
    private int mangos;
    private int naranjas;

    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }

    public void imprimir() {
        int m = mcd(mangos, naranjas);
        int cajasMangos = mangos / m;
        int cajasNaranjas = naranjas / m;

        System.out.println("El número de cajas es: " + m);
        System.out.println("El número de mangos en una caja es: " + cajasMangos);
        System.out.println("El número de naranjas en una caja es: " + cajasNaranjas);
    }

    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class MangosyNaranjas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de mangos: ");
        int numMangos = scanner.nextInt();

        System.out.print("Ingrese el número de naranjas: ");
        int numNaranjas = scanner.nextInt();

        MangosNaranjas mn = new MangosNaranjas(numMangos, numNaranjas);
        mn.imprimir();

        scanner.close();
    }
}

