// Ejercicio 10.
// Pedir 10 numeros y escribir la suma total.

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int numero, suma = 0;

        for (int i=0; i<10; i++) {
            System.out.println("Introduce el número " + (i+1) + ":");
            numero = numeroDado.nextInt();
            suma = suma + numero;
        }

        System.out.println(
                "**********************" + "\n" +
                "La suma total es: " + suma + "\n" +
                "**********************");
    }

}
