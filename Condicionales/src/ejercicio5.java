// Ejercicio 5.
// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
// Si trabaja 40 horas o menos se le paga €16 por hora.
// Si trabaja más de 40 horas se le paga €16 por cada una de las primeras 40 horas y €20 por cada hora extra.

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String args[]) {

        Scanner horas;
        horas = new Scanner(System.in);
        int horasTotal, horasOrdinarias, horasExtra;

        System.out.println("¿Cuántas horas ha trabajado el trabajador?");
        horasTotal = horas.nextInt();

        if (horasTotal <= 40) {

            System.out.println("El trabajador va a cobrar esta semana: " + (16*horasTotal) + "€.");

        } else {

            horasOrdinarias = 16 * 40;
            horasExtra = (horasTotal - 40) * 20;
            System.out.println("El trabajador va a cobrar esta semana: " + (horasOrdinarias + horasExtra) + "€.");

        }

    }

}
