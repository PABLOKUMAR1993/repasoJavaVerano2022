// Ejercicio 14.
// Pedir 10 sueldos.
// Mostrar su suma y cuantos hay mayores de €1000.

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        Scanner sueldoDado = new Scanner(System.in);
        int sueldos = 0, sueldo, acumulado = 0;
        final int media = 10;

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    "********************" + "\n" +
                    "Escribe el sueldo " + i + ":" + "\n" +
                    "********************");

            sueldo = sueldoDado.nextInt();
            sueldos = sueldos + sueldo;

            if (sueldo > 1000) {
                acumulado++;
            }

        }

        System.out.println(
                "La media de los sueldos es: " + (sueldos / media) + "\n" +
                "La cantidad de sueldos superiores a €1000 es: " + acumulado
        );

    }

}
