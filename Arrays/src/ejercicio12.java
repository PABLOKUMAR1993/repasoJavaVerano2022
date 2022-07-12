// Ejercicio 12.
// Leer por teclado unas tablas de 10 elementos numéricos enteros y una posición (entre 0 y 9).
// Eliminar el elemento situado en la posición dada sin dejar huecos.

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        int n;

        //Llenamos el Array:
        for (int i=0; i < array.length; i++) {
            System.out.println("- Introduce la posición " + i + " del array: ");
            array[i] = num.nextInt();
        }

        //Averiguamos N:
        System.out.println("¿Qué posición del Array quieres borrar?");
        n = num.nextInt();

        //Borramos la posición y movemos los elementos que quedan detrás.
        for (int i = n; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;

        //Mostramos el Array
        for (int i=0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

    }

}
