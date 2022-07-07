// Ejercicio 02.
// Leer un número e indicar si es positivo o negativo.
// El proceso se repetirá hasta que se introduzca un 0.

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String args[]) {

        Scanner numDado = new Scanner(System.in);
        int num;

        do {

            System.out.println("""
                    · Introduce un número y te diré si es positivo o negativo.
                    · Introduce 0 para terminar el programa.""");

            num = numDado.nextInt();

            if (num > 0) {
                System.out.println("El número " + num + " es positivo.");
            } else if (num < 0) {
                System.out.println("El número " + num + " es negativo.");
            } else {
                System.out.println("Has terminado el programa.");
            }

        } while( num != 0 );

    }

}
