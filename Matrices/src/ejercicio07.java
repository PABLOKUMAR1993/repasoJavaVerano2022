// Ejercicio 07.
// Crear una matriz "marco" de tamaño 5x5:
// Todos sus elementos deben de ser 0 salvo los de los bordes que deben ser 1.
// Mostrarla.

import java.util.Scanner;

public class ejercicio07 {

    public static void main (String[] args) {

        Scanner n = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        //Llenamos la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0 || i == matriz.length-1 || j == 0 || j == matriz.length-1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }
        }

        //Mostramos la matriz.
        System.out.println("---- MATRIZ ----");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }


    }

}
