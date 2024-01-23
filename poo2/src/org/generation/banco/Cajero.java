package org.generation.banco;

/*
 * En cajero se instancia el objeto de tipo CuentaBancaria y se invocan los métodos definidos
 * Aquí se pueden establecer los try-catch de la excepción que se definió en el método retirar
 * los resultados se muestran en consola
 * 
 * */

public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria cuentaDaniel = new CuentaBancaria(6989); // cuenta bancaria con su id cuenta

        // simulamos que tenemos un Scanner y el cliente introduce dinero
        System.out.println("Depositando $500");
        cuentaDaniel.depositar(500);

        // revisar si se actualiza el saldo
        System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
    


		//retirando dineritos
		
		try {
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
			
			
			System.out.println("Retirando $200");
			cuentaDaniel.retirar(200);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
			
			
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
			
			
		}catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mLo siento, te faltan $\u001B[31m" + e.getMonto());
			e.printStackTrace();
		}
		
    }
}	