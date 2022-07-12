// Ejercicio 9.
// Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición abajo:
// El primero pasará a ser el segundo, el segundo pasará a ser el tercero y así sucesivamente.
// El último pasará a ser el primero.

import java.util.Scanner;

public class ejercicio09 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        int ultimo;

        //Llenamos el Array:
        for (int i=0; i < array.length; i++) {
            System.out.println("- Introduce la posición " + i + " del array: ");
            array[i] = num.nextInt();
        }

        //Recolocamos el Array:
        ultimo = array[array.length-1];
        for (int i = array.length-1; i >= 0; i--) {
            if (i == 0) {
                array[i] = ultimo;
            } else {
                array[i] = array[i-1];
            }
        }

        //Mostramos el Array
        for (int i=0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

    }

}
