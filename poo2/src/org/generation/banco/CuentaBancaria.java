package org.generation.banco;

/*          
 * En esta clase se definen los métodos para disparar las excepciones, es decir, el try-catch.
 * Se definen otros métodos como depositar dinero, retirar dinero,
 * Requerimientos:
 * 	- Trabajar bajo POO
 * 	- Encapsular (modificadores, getters y setters)
 *  - Crear variables y métodos para instanciar objetos
 * */

public class CuentaBancaria {
    private double saldo;
    private int idCuenta;


    // Constructor que recibe solamente id cuenta
    public CuentaBancaria(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
    }

    // Método para retirar dinero
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            double faltante = monto - saldo;
            // Crear la instancia de la clase FondosInsuficientesException con las palabras reservadas throw new
            throw new FondosInsuficientesException(faltante);
        }
    }

    // Getters y setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
}
