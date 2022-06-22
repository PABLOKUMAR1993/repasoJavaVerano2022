// Ejercicio 7.
// Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
// Por ejemplo, dado un total de 1000 horas, debe mostrar 5 semanas, 6 días y 16 horas.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String args[]) {

        Scanner cantidadHoras;
        int totalHoras, semanas, dias, horas;

        cantidadHoras = new Scanner(System.in);
        System.out.println("Introduce la cantidad de horas:");
        totalHoras = cantidadHoras.nextInt();

        semanas = totalHoras / 168;
        dias = totalHoras % 168 / 24;
        horas = totalHoras % 24;

        System.out.println("En las " + totalHoras + " que has indicado, habría un total de:" + "\n" +
                            semanas + " Semanas." + "\n" +
                            dias + " Días." + "\n" +
                            horas + " Horas.");

    }

}
