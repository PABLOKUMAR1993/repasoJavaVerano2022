// Ejercicio 7.
// Pedir tres números y mostrarlos ordenador de mayor a menor.

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String args[]) {

        Scanner numeros = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Introduce 3 números y te los devolveré ordenador de mayor a menor");
        n1 = numeros.nextInt();
        n2 = numeros.nextInt();
        n3 = numeros.nextInt();

        if ( n1 > n2 && n2 > n3 ) {
            System.out.println(n1 + "\n" + n2 + "\n" + n3);
        } else if ( n1 > n3 && n3 > n2 ) {
            System.out.println(n1 + "\n" + n3 + "\n" + n2);
        } else if ( n2 > n1 && n1 > n3 ) {
            System.out.println(n2 + "\n" + n1 + "\n" + n3);
        } else if ( n2 > n3 && n3 > n1 ) {
            System.out.println(n2 + "\n" + n3 + "\n" + n1);
        } else if ( n3 > n1 && n1 > n2 ) {
            System.out.println(n3 + "\n" + n1 + "\n" + n2);
        } else if ( n3 > n2 && n2 > n1 ) {
            System.out.println(n3 + "\n" + n2 + "\n" + n1);
        }

    }

}