// Ejercicio 03.
// Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int aux;

        //Llenamos la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] :");
                matriz[i][j] = n.nextInt();
            }
        }

        //Mostramos la Matriz Original
        System.out.println("ORIGINAL: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        //Trasponemos la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        //Mostramos la Matriz Traspuesta
        System.out.println("TRASPUESTA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
