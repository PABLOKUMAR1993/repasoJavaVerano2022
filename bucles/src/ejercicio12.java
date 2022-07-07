// Ejercicio 12.
// Pedir un número y calcular su factorial.

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int numero, factorial = 1;

        System.out.println("Introduce un número y te devolveré su factorial.");
        numero = numeroDado.nextInt();

        for (int i=1; i<=numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial del número " + numero + ", es: " + factorial);

    }

}
