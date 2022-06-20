// Ejercicio 6.
// Hacer un programa que calcule el cuadro de una suma.
// (a+b)^2 = a^2 + b^2 + 2ab.

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String args[]) {

        Scanner valorA = new Scanner(System.in), valorB = new Scanner(System.in);
        int a, b, cuadrado;

        System.out.println("Introduce 2 números y te devolveré el cuadrado de su suma:");
        a = valorA.nextInt();
        b = valorB.nextInt();

        cuadrado = (a+b) * (a+b);

        System.out.println("El resultado de tu operación es: " + cuadrado);

    }

}
