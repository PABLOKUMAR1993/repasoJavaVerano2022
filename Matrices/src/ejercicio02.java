// Ejercicio 02.
// Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.

import java.util.Scanner;

public class ejercicio02 {

    public static void main (String[] args) {

        int[][] matrizA = new int[3][3], matrizB = new int[3][3];
        Scanner n = new Scanner(System.in);

        //Llenamos la primera matriz.
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] :");
                matrizA[i][j] = n.nextInt();
            }
        }

        //Llenamos la segunda matriz.
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] :");
                matrizB[i][j] = n.nextInt();
            }
        }

        //Sumamos todos los números de la matriz.
        int suma = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                suma += matrizA[i][j];
                suma += matrizB[i][j];
            }
        }

        //Mostramos la Suma.
        System.out.println("La suma es: " + suma + ".");

    }

}
