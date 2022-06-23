// Ejercicio 3.
// Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.

import java.util.Scanner;

public class ejercicio3 {

    public static void main (String args[]) {

        Scanner letra;
        letra = new Scanner(System.in);
        char caracter;

        System.out.println("Escribe un carácter");
        caracter = letra.next().charAt(0);

        if (Character.isUpperCase(caracter)) {
            System.out.println("Es mayúscula");
        } else if (Character.isLowerCase(caracter)) {
            System.out.println("Es minúscula");
        } else {
            System.out.println("No has introducido una letra");
        }

    }

}
