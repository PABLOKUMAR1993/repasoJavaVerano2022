// Ejercicio 6.
// Hacer un programa que tome dos números y diga si ambos son pares o impares.

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String args[]) {

        Scanner numeros;
        numeros = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce dos números y te dire si son pares");
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();

        if ( (num1 % 2) == 0 && (num2 % 2) == 0 ) {
            System.out.println("Los dos números que has introducido son pares.");
        } else {
            System.out.println("Uno de los dos números que has introducido es impar.");
        }

    }

}
