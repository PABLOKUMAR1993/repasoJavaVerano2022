// Ejercicio 3.
// Leer 5 números por teclado, almacenarlos en un arreglo
// y a continuación realizar la media de los números positivos,
// la media de los negativos
// y contar el número de ceros.

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int[] array = new int[5];
        int mediaPositivos = 0, cantidadPositivos = 0, mediaNegativos = 0, cantidadNegativos = 0, ceros = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(
                    "********************************" + "\n" +
                    "Introduce la posición " + i + " del array:" + "\n" +
                    "********************************");

            array[i] = numeroDado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                mediaPositivos += array[i];
                cantidadPositivos++;
            } else if (array[i] == 0) {
                ceros++;
            } else {
                mediaNegativos += array[i];
                cantidadNegativos++;
            }
        }

        System.out.println(
                "********************************" + "\n" +
                "La media de los POSITIVOS es: " + (mediaPositivos / cantidadPositivos) + "\n" +
                "********************************" + "\n" +
                "La media de los NEGATIVOS es: " + (mediaNegativos / cantidadNegativos) + "\n" +
                "********************************" + "\n" +
                "La cantidad de CEROS es: " + ceros + "\n" +
                "********************************"
        );

    }

}
