// Ejercicio 8.
// Diseñar una aplicación que declare una tabla de 10 elementos enteros.
// Leer mediante el teclado 8 números.
// Después se debe pedir un número y una posición.
// Insertarlo en la posición indicada, desplazando los que estén detrás.

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        int numeroEspecial, posicion;

        //Llenamos el array
        for (int i=0; i< array.length; i++) {
            if (i <= 7) {
                System.out.println("- Introduce la posición " + i + " del array: ");
            } else if (i == 8) {
                System.out.println("- Introduce el número especial del array: ");
            } else {
                System.out.println("- Introduce la posición del número especial en el array: ");
            }
            array[i] = num.nextInt();
        }

        //Cambiamos la posición del número especial a la indicada.
        numeroEspecial = array[array.length-2];
        posicion = array[array.length-1];

        for (int i = array.length-2; i >= posicion; i--) {
            if (posicion == i) {
                array[i] = numeroEspecial;
            } else {
                array[i] = array[i-1];
            }
        }

        for (int i=0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

    }

}
