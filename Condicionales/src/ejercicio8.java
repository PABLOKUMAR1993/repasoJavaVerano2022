// Ejercicio 8
// Pedir un número entre 0 u 99 999 y decir cuantas cifras tiene.

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String args[]) {

        Scanner numero = new Scanner(System.in);
        long num;

        System.out.println("Introduce un número y te dire las cifras que tiene");
        num = numero.nextLong();

        if ( num <= 9 ) {
            System.out.println("Tien un número");
        } else if ( num > 9 && num <= 99 ) {
            System.out.println("Tien dos numeros");
        } else if ( num > 99 && num <= 999 ) {
            System.out.println("Tien tres numeros");
        } else if ( num > 999 && num <= 9999 ) {
            System.out.println("Tien cuatro numeros");
        } else if ( num > 9999 && num <= 99999 ) {
            System.out.println("Tien cinco numeros");
        }

    }

}
