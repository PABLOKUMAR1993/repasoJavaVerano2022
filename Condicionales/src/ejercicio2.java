// Ejercicio 2.
// Pedir dos números y decir cuál es el mayor o si son iguales.

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String args[]) {

        Scanner num1, num2;
        num1 = new Scanner(System.in);
        num2 = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introduce 2 números y te diré cual es mayor o si son iguales");
        n1 = num1.nextInt();
        n2 = num1.nextInt();

        if (n1 > n2) {
            System.out.println("El primer número es mayor");
        } else if (n1 == n2) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("El segundo número es mayor");
        }

    }

}
