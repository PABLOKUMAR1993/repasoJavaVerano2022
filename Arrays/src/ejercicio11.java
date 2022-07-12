// Ejercicio 11.
// Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
// Estos los guardaremos en una tabla de tamaño 10.
// Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        int n, posicion = 0, j = 0;

        //Llenamos el Array:
        System.out.println("TIENES QUE LLENAR EL ARRAY CON 5 NÚMEROS DE MANERA CRECIENTE:");
        for (int i = 0; i < array.length/2; i++) {
            System.out.println("- Introduce la posición " + i + " del array: ");
            array[i] = num.nextInt();
        }

        //Averiguamos N:
        System.out.println("- Introduce un número adicional:");
        n = num.nextInt();

        //Averiguamos la Posición:
        while (array[j]<n && j<array.length/2) {
            posicion++;
            j++;
        }

        //Colocamos N en la Posición Correcta:
        for (int i = array.length/2; i >= posicion; i--) {
            if (i == posicion) {
                array[i] = n;
            } else {
                array[i] = array[i-1];
            }
        }

        //Mostramos el Array
        for (int i=0; i < array.length; i++) {
            if (array[i] > 0) System.out.println("Posición " + i + ": " + array[i]);
        }

    }

}
