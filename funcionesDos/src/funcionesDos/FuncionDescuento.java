package funcionesDos;

import java.util.Scanner;

public class FuncionDescuento {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el costo del producto");
        double precioProducto = scanner.nextDouble();
        
        double porcentajeDescuento = 15;
        double descuento = calcularDescuento(precioProducto, porcentajeDescuento);
        
        double porcentajeImpuesto = 3;
        double impuesto = calcularImpuesto(precioProducto, porcentajeImpuesto);
        
        double total = calcularTotal(precioProducto, descuento, impuesto);
        
        total = redondear(total, 2);
        
        System.out.println("Precio del producto $ " + precioProducto);
        System.out.println("Descuento aplicado al producto $" + descuento);
        System.out.println("Impuesto aplicado $ " + impuesto);
        System.out.println("Total con descuento e impuesto $ " + total);
    }

    static double calcularDescuento(double precioProducto, double porcentajeDescuento) {
        return (precioProducto * porcentajeDescuento) / 100;
    }

    static double calcularImpuesto(double precioProducto, double porcentajeImpuesto) {
        return (precioProducto * porcentajeImpuesto) / 100;
    }

    static double calcularTotal(double precioProducto, double descuento, double impuesto) {
        return precioProducto - descuento + impuesto;
    }

    static double redondear(double valor, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(valor * factor) / factor;
    }
}
