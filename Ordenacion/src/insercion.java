// Ordenación por inserción.

import java.util.Scanner;

public class insercion {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int[] array = new int[10];
        int posicion, auxiliar;

        //Llenamos el array.
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.println("- Escribe la posición " + (i+1) + " del array:");
            array[i] = numero.nextInt();
        }

        //Ordenación por inserción:
        for (int i = 0; i < array.length; i++) {
            posicion = i;
            auxiliar = array[i];

            while ((posicion > 0) && (array[posicion-1] > auxiliar)) {
                array[posicion] = array[posicion-1];
                posicion--;
            }

            array[posicion] = auxiliar;
        }

        //Mostramos el Array
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }

}
