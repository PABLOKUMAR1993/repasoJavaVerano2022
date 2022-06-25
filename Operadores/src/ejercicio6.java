// Ejercicio 6.
// Hacer un programa que calcule el cuadrado de una suma.

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String args[]) {

        Scanner numeros = new Scanner(System.in);
        int num1, num2, total;

        System.out.println("Introduce 2 numeros y te devolveré el cuadrado de la suma");
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();

        total = ( num1 + num2 ) * ( num1 + num2 );

        System.out.println("El resultado es: " + total);

    }

}

/*
        Scanner valorA = new Scanner(System.in), valorB = new Scanner(System.in);
        int a, b, cuadrado;

        System.out.println("Introduce 2 números y te devolveré el cuadrado de su suma:");
        a = valorA.nextInt();
        b = valorB.nextInt();

        cuadrado = (a+b) * (a+b);

        System.out.println("El resultado de tu operación es: " + cuadrado);
 */