// Ejercicio 4.
// Leer 10 números enteros y guardarlos en un array.
// Debemos mostrarlos en el siguiente orden:
// El primero, el último, el segundo, el penúltimo, el tercero, el antepenúltimo, etc...

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int[] array = new int[10];
        int finArray = array.length-1;

        for (int i = 0; i < array.length; i++) {
            System.out.println(
                    "********************************" + "\n" +
                    "Introduce la posición " + i + " del array:" + "\n" +
                    "********************************");

            array[i] = numeroDado.nextInt();
        }

        for (int i = 0; i < (array.length / 2); i++) {
            System.out.println(array[i]);
            System.out.println(array[finArray-i]);
        }

    }

}
