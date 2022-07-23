// Ejercicio 01.
// Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.

import javax.swing.*;
import java.util.Scanner;

public class ejercicio01 {

    public static void main (String[] args) {

        Scanner numero = new Scanner(System.in);
        int matriz[][], f, c;
        boolean simetrica = true;
        f = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de filas"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de columnas"));
        matriz = new int[f][c];

        //Llenamos la Matriz.
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("- Introduce la posición [" + i + "][" + j + "] : ");
                matriz[i][j] = numero.nextInt();
            }
        }

        //Comprobamos si es cuadrada.
        if (f == c) {

            //Ahora comprobamos si es simétrica, es decir, si se lee igual a la derecha y a la izquierda.
            int i = 0, j;
            while (i < f && simetrica) {
                j = 0;
                while (j < c && simetrica) {
                    if (matriz[i][j] != matriz[j][i]) simetrica = false;
                    j++;
                }
                i++;
            }

            if (simetrica) {
                System.out.println("La matriz es cuadrada y simétrica");
            } else {
                System.out.println("La matriz es cuadrada pero no simétrica");
            }

        } else {
            System.out.println("La matriz no es cuadrada");
        }

    }

}
