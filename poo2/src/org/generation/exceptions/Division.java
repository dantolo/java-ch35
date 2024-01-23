package org.generation.exceptions;

public class Division {

    public static void main(String[] args) {
        /* Nos permite manejar cualquier caso excepcional con nuestro código, es el equivalente a los errores.
         * try envuelve el código que puede generar una excepción y lo evalúa.
         * catch contiene el código para manejar la excepción.
         * 
         * */
        
        // Excepción que se arroja si un número se divide entre 0
        
        try {
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("\u001B[31mError: no puedes dividir entre 0\u001B[31m");
        } finally {
            System.out.println("\u001B[32mPrograma finalizado\u001B[0m");
        }
    }

    // Método que realiza la división y maneja la excepción
    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No puedes dividir entre 0");
        }
        return numerador / denominador;
    }
}
