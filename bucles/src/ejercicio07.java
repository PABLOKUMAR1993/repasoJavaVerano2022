// Ejercicio 07.
// Pedir números hasta que se introduzca uno negativo, y calcular la media.

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int numero, media, acumulado;

        media = 0;
        acumulado = 0;

        System.out.println("""
                · Introduce números, los iré sumando y te devolveré la media de todos.
                · Introduce un número negativo para terminar el programa.""");

        do {

            numero = numeroDado.nextInt();
            if (numero >= 0) {
                media = media + numero;
                acumulado++;
            }

        } while (numero >= 0);

        System.out.println(
                "****PROGRAMA TERMINADO****" + "\n" + "\n" +
                "La media de los número que has introducido es: " + (media/acumulado));

    }

}
