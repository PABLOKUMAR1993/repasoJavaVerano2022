// Ejercicio 06.
// Utilizando dos matrices de tamaño 5x9 y 9x5,
// carga la primera y transponerla en la segunda.

import java.util.Scanner;

public class ejercicio06 {

    public static void main (String[] args) {

        Scanner n = new Scanner(System.in);
        int[][] matrizA = new int[2][4], matrizB = new int[4][2];

        //Llenamos la primera matriz.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] :");
                matrizA[i][j] = n.nextInt();
            }
        }

        //Mostramos la primera matriz.
        System.out.println("---- PRIMERA MATRIZ ----");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(" ");
        }

        //Rellenamos la segunda matriz transponiendo la primera.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }

        //Mostramos la segunda matriz.
        System.out.println("---- SEGUNDA MATRIZ ----");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
