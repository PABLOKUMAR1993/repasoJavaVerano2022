// Ejercicio 3.
// Guillermo tiene N dólares.
// Luis tiene la mitad de lo que posee Guillermo.
// Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
// Hacer un programa que calcula e imprima la cantidad de dinero que tienen entre los tres.

import java.util.Scanner;

public class ejercicio3 {

    public static void main (String args[]) {

        Scanner dollaresGuillermo = new Scanner(System.in);
        int guillermo, luis, juan, total;

        System.out.println("Guillermo, ¿Cuánto dinero tienes?:");

        guillermo = dollaresGuillermo.nextInt();
        luis = guillermo / 2;
        juan = ( guillermo + luis ) / 2;
        total = guillermo + luis + juan;

        System.out.println("El dinero que tienen los tres es: " + total + " €.");

    }

}
