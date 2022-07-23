// Ejercicio 04.
// Crear una matriz de tamaño 7x7
// y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.

import java.util.Scanner;

public class ejercicio04 {

    public static void main (String[] args) {

        Scanner n = new Scanner(System.in);
        int[][] matriz = new int[7][7];
        int aux = matriz.length-1;

        //Llenamos la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == aux) matriz[i][j] = 1;
                else matriz[i][j] = 0;
            }
            aux--;
        }

        //Mostramos la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
