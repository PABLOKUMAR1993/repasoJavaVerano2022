import javax.swing.*;
import java.util.Scanner;

public class teoria {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrizDos[][], nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de Filas."));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de Columnas."));

        matrizDos = new int[nFilas][nCol];

        //Mostramos la primera matriz.
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        //Llenamos la segunda Matriz.
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.println("- Escribe el número que va en la fila " + i + " y la columna " + j + ":");
                matrizDos[i][j] = entrada.nextInt();
            }
        }

        //Mostramos la segunda Matriz
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print(matrizDos[i][j]);
            }
            System.out.println("");
        }

    }

}
