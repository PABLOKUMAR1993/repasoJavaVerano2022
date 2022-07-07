// Ejercicio 16.
// Pide un número entre 0 y 10 y muestra la tabla de multiplicar de ese número.

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número y te mostraré su tabla de multiplicar");
        numero = numeroDado.nextInt();

        for (int i = 0; i < 10; i++) {

            System.out.println(
                numero + " x " + i + " = " + (numero*i)
            );

        }

    }

}
