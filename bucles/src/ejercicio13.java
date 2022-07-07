// Ejercicio 13.
// Pedir 10 números.
// Mostrar la media de los números positivos.
// Mostrar la media de los números negativos.
// Mostrar la cantidad de ceros.

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int positivos, negativos, cantidadPositivos, cantidadNegativos, ceros, numero;
        positivos = 0;
        cantidadPositivos = 0;
        negativos = 0;
        cantidadNegativos = 0;
        ceros = 0;

        System.out.println("""
                *************************
                Introduce 10 números y te daré la media de los positivos, de los negativos y la cantidad de ceros.
                *************************
                
                """);

        for (int i = 0; i < 10; i++) {

            System.out.println("*************************" + "\n" +
                    "Introduce el numero " + (i+1) + ":" + "\n" +
                    "*************************");

            numero = numeroDado.nextInt();

            if (numero > 0) {
                positivos = positivos + numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                negativos = negativos + numero;
                cantidadNegativos++;
            } else {
                ceros++;
            }

        }

        System.out.println("" +
                "La media de los números positivos es: " + (positivos/cantidadPositivos) + "\n" +
                "La media de los números negativos es: " + (negativos/cantidadNegativos) + "\n" +
                "La cantidad de ceros es: " + ceros);

    }

}
