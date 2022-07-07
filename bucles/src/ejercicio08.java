// Ejercicio 08
// Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;

public class ejercicio08 {

    public static void main (String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int numero;

        System.out.println("Dame un número y te daré todos los número desde el 0 hasta el que has introducido.");
        numero = numeroDado.nextInt();

        System.out.println("*****");
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
        System.out.println("*****");

    }

}
