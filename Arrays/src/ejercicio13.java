// Ejercicio 13.
// Leer 10 números enteros en una tabla.
// Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.

import java.util.Scanner;

public class ejercicio13 {

    public static void main (String[] args) {

        Scanner num = new Scanner(System.in);
        int[] arrayA = new int[10], arrayB = new int[10], arrayC = new int[10];
        int pares = 0, impares = 0, j = 0, g = 0;

        //Llenamos el Array:
        for (int i=0; i < arrayA.length; i++) {
            System.out.println("- Introduce la posición " + i + " del array: ");
            arrayA[i] = num.nextInt();
        }

        //Compruebo si son pares o impares.
        for (int i = 0; i < arrayA.length; i++) {
            if ((arrayA[i]%2) == 0) {
                arrayB[pares] = arrayA[i];
                pares++;
            } else {
                arrayC[impares] = arrayA[i];
                impares++;
            }
        }

        //Muestro los Arrays nuevos.
        System.out.println("*****************************");
        while (arrayB[j] > 0) {
            System.out.println("Posición " + j + ": " + arrayB[j]);
            j++;
        }
        System.out.println("*****************************");
        while (arrayC[g] > 0) {
            System.out.println("Posición " + g + ": " + arrayC[g]);
            g++;
        }

    }

}
