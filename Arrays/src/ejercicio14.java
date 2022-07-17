// Ejercicio 14.
// Leer dos series de 10 enteros, que estarán ordenados crecientemente.
// Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenadas.

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int[] arrayA = new int[10], arrayB = new int[10], arrayC = new int[20];
        int nComodin = 0;

        //Llenamos el primer array.
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("- Introduce la posición " + (i+1) + " del array A:");
            arrayA[i] = numero.nextInt();
        }

        System.out.println("""
                
                ********************************
                
                """);

        //Llenamos el segundo array.
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("- Introduce la posición " + (i+1) + " del array B:");
            arrayB[i] = numero.nextInt();
        }

        System.out.println("""
                
                ********************************
                
                """);

        //Ordenamos el primer Array.
        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0; j < arrayA.length-1; j++) {
                if (arrayA[j] > arrayA[j+1]) {
                    nComodin = arrayA[j];
                    arrayA[j] = arrayA[j+1];
                    arrayA[j+1] = nComodin;
                }
            }
        }

        //Ordenamos el segundo Array.
        for(int i = 0; i < arrayB.length; i++) {
            for(int j = 0; j < arrayB.length-1; j++) {
                if (arrayB[j] > arrayB[j+1]) {
                    nComodin = arrayB[j];
                    arrayB[j] = arrayB[j+1];
                    arrayB[j+1] = nComodin;
                }
            }
        }

        //Llenamos el tercer Array.
        nComodin = arrayB.length;
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
            arrayC[nComodin] = arrayB[i];
            nComodin++;
        }

        //Ordeno el tercer Array.
        for(int i = 0; i < arrayC.length; i++) {
            for(int j = 0; j < arrayC.length-1; j++) {
                if (arrayC[j] > arrayC[j+1]) {
                    nComodin = arrayC[j];
                    arrayC[j] = arrayC[j+1];
                    arrayC[j+1] = nComodin;
                }
            }
        }

        //Lo muestro por Pantalla.
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println("- Posición " + (i+1) + ": " + arrayC[i]);
        }

    }

}
