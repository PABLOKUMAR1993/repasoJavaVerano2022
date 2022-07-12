// Ejercicio 7.
// Leer por teclado una serie de 10 números enteros.
// La aplicación debe indicarnos si los números están ordenador de forma creciente, decreciente o si están desordenados.

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        boolean creciente = false;
        boolean decreciente = false;

        //Llenamos el array
        for (int i = 0; i < array.length; i++) {
            System.out.println(
                "*******************************************" + "\n" +
                "INTRODUCE LA POSICIÓN " + i + " DEL ARRAY:" + "\n" +
                "*******************************************");
            array[i] = num.nextInt();
        }

        for (int i = 0; i < (array.length-1); i++) {
            if (array[i] < array[i+1]) creciente = true;
            if (array[i] > array[i+1]) decreciente = true;
        }

        if (creciente && decreciente) {
            System.out.println("El array es desordenado");
        } else if (decreciente) {
            System.out.println("El array es decreciente");
        } else if (creciente) {
            System.out.println("El array es creciente");
        }

    }

}
