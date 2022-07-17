// Ejercicio 15.
// Leer 10 enteros ordenados crecientemente.
// Leer N y buscarlo en la tabla.
// Se debe mostrar la posición en la que se encuentra.
// Si no está, indicarlo con un mensaje.

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int[] array = new int[10];
        int n;
        boolean encontrado = false;

        //Llenamos el Array.
        for (int i = 0; i < array.length; i++) {
            System.out.println("- Introduce la posición " + (i+1) + " del array:");
            array[i] = numero.nextInt();
        }

        //Almacenamos el número a buscar.
        System.out.println("¿Que número estás buscando?");
        n = numero.nextInt();

        //Buscamos el número.
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                System.out.println("El número " + n + " está en la posición " + i + " del array.");
                encontrado = true;
            }
        }

        if(encontrado == false) {
            System.out.println("No se ha encontrado el número que buscabas");
        }

    }

}
