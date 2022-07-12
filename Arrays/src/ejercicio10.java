// Ejercicio 10.
// Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el Array
// N es un número dado por el usuario.

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        int n, ultimo;

        //Llenamos el Array:
        for (int i=0; i < array.length; i++) {
            System.out.println("- Introduce la posición " + i + " del array: ");
            array[i] = num.nextInt();
        }

        //Averiguamos N y guardamos la última posición del Array porque siempre será sobreescrita:
        System.out.println("¿Cuántas posiciones quieres desplazar el Array?");
        n = num.nextInt();
        ultimo = array[array.length-1];

        //Desplazamos el Array:
        for (int i = 0; i < n; i++) {
            for (int j = array.length-1; j >= 0; j--) {
                if (j == 0) {
                    array[j] = ultimo;
                    ultimo = array[array.length-1];
                } else {
                    array[j] = array[j - 1];
                }
            }
        }

        //Mostramos el Array
        for (int i=0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

    }

}
