// Ejercicio 5.
// Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera tabla de la siguiente forma:
// el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc...

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int[] arrayPrimero = new int[10];
        int[] arraySegundo = new int[10];
        int[] arrayTercero = new int[20];
        int contador = 0;

        System.out.println("Vamos a llenar el primer array");
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.println(
                    "********************************" + "\n" +
                    "Introduce la posición " + i + " del primer array:" + "\n" +
                    "********************************");

            arrayPrimero[i] = numeroDado.nextInt();
        }

        System.out.println("Vamos a llenar el segundo array");
        for (int i = 0; i < arraySegundo.length; i++) {
            System.out.println(
                    "********************************" + "\n" +
                    "Introduce la posición " + i + " del segundo array:" + "\n" +
                    "********************************");

            arraySegundo[i] = numeroDado.nextInt();
        }

        for (int i = 0; i < arrayTercero.length; i++) {
            if ((i % 2) == 0) {
                arrayTercero[i] = arrayPrimero[contador];
            } else {
                arrayTercero[i] = arraySegundo[contador];
                contador++;
            }
        }

        System.out.println("""
                
                ****************
                EL TERCER ARRAY:
                ****************
                
                """);

        for (int i = 0; i < arrayTercero.length; i++) {
            System.out.println(arrayTercero[i]);
        }

    }

}
