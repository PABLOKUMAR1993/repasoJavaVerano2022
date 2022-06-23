// Ejercicio 4.
// En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los €300.
// ¿Cuál será la cantidad que pagará una persona por su compra?

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String args[]) {

        Scanner importe;
        importe = new Scanner(System.in);
        double compra, compraConDescuento, descuentoAcumulado;
        final int descuento = 20;

        System.out.println("Escribe el importe de la compra");
        compra = importe.nextDouble();

        if (compra >= 300) {
            descuentoAcumulado = compra * descuento / 100;
            compraConDescuento = compra - descuentoAcumulado;
            System.out.println("El importe de la compra con descuento es de: " + compraConDescuento + "€.");
        } else {
            System.out.println("El importe de la compra es de: " + compra + "€.");
        }

    }

}
