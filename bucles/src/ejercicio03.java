// Ejercicio 03.
// Leer número hasta que se introduzca un 0.
// Para cada uno indicar si es par o impar.

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String args[]) {

        Scanner numDado = new Scanner(System.in);
        int num;

        do {

            System.out.println("""
                    · Introduce un número y te diré si es par o impar.
                    · Pulsa 0 para terminar el programa""");

            num = numDado.nextInt();

            if ( num != 0) {
                if ((num % 2) == 0) {
                    System.out.println("El número introducido " + num + " es par.");
                } else if ((num % 2) != 0) {
                    System.out.println("El número introducido " + num + " es impar.");
                }
            } else {
                System.out.println("Has salido del programa con éxito.");
            }

        } while (num != 0);

    }

}
