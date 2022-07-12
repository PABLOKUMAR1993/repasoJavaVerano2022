// Ejercicio 1.
// Leer 5 números, guardarlos en un array y mostrarlos en el mismo orden introducido.

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {

        Scanner numerosDados = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números y luego te los mostraré en pantalla");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número: " + (i+1) + ":");
            numeros[i] = numerosDados.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(
                    "******************" + "\n" +
                    "El numero " + (i+1) + " es: " + numeros[i] + "." + "\n" +
                    "******************");

        }

    }

}
