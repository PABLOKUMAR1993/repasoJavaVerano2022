// Ejercicio 2.
// Leer 5 números, guardarlos en un array y mostrarlos en el orden inverso al introducido.

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner numerosDados = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Escribe 5 números para llenar un array:");

        for(int i = 0; i < array.length; i++) {

            System.out.println(
                    "************************" + "\n" +
                    "Introduce la posición " + (i+1) + " del array:" + "\n" +
                    "************************");
            array[i] = numerosDados.nextInt();

        }

        System.out.println("""
                
                **********************
                
                """);

        for(int i = array.length-1; i >= 0; i--) {

            System.out.println(array[i]);

        }

    }

}
