// Ejercicio 05.
// Crear y cargar una matriz de tamaño n x m,
// mostrar la suma de cada fila y de cada columna.

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int matriz[][], f, c, sumaF, sumaC;

        System.out.println("¿Cuantas filas quieres que tenga tu matriz?");
        f = num.nextInt();
        System.out.println("¿Cuantas columnas quieres que tenga tu matriz?");
        c = num.nextInt();

        matriz = new int[f][c];

        //Llenamos la matriz:
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] :");
                matriz[i][j] = num.nextInt();
            }
        }

        //Mostramos la suma de cada fila:
        System.out.println("--- FILAS ---");
        for (int i = 0; i < f; i++) {
            sumaF = 0;
            for (int j = 0; j < c; j++) {
                sumaF += matriz[i][j];
            }
            System.out.println("- La suma de la fila " + (i+1) + " es: " + sumaF);
        }

        //Mostramos la suma de cada columna:
        System.out.println("--- COLUMNAS ---");
        for (int i = 0; i < f; i++) {
            sumaC = 0;
            for (int j = 0; j < c; j++) {
                sumaC += matriz[j][i];
            }
            System.out.println("- La suma de la columna " + (i+1) + " es: " + sumaC);
        }

    }

}
