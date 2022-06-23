// Ejercicio 1.
// Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String args[]) {

        Scanner num;
        int numero;

        num = new Scanner(System.in);
        System.out.println("Introduce un número y te diré si es primo de 10");
        numero = num.nextInt();

        if ((numero % 10) == 0) {
            System.out.println("Es multiplo de 10");
        } else {
            System.out.println("No es multiplo de 10");
        }

    }

}
