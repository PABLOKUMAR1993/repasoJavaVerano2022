// Ejercicio 04.
// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

import java.util.Scanner;

public class ejercicio04 {

    public static void main (String args[]) {

        Scanner numDado = new Scanner(System.in);
        int num = 0, contador = -1;

        do {

            System.out.println("****Introduce números y cuanto introduzcas uno negativo te diré cuantos has introducido en total****");
            num = numDado.nextInt();
            contador++;

            if (num < 0) {
                System.out.println(
                        "· Has salido del programa con éxito." + "\n" +
                        "· La cantidad de números que has introducido es: " + contador);
            }

        } while (num >= 0);

    }

}
