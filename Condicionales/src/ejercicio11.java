// Ejercicio 11.
// Construir un programa que simule el funcionamiento de una calculadora,
// que puede realizar las cuatro operaciones aritméticas básicas ( suma / resta / división / multiplicación ),
// con valores numéricos enteros.
// El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos:
// S/s para sumas, R/r restas, M/m multiplicación, D/d división.

import java.util.Scanner;

public class ejercicio11 {

    public static void main (String args[]) {

        Scanner operacion, nume1, nume2;
        char operacionAlmacenada;
        int num1, num2;

        operacion = new Scanner(System.in);
        nume1 = new Scanner(System.in);
        nume2 = new Scanner(System.in);

        System.out.println("Indica el tipo de operación que quieres hacer. Para ello pulsa S/s para sumas, R/r restas, M/m multiplicación, D/d división.");
        operacionAlmacenada = operacion.next().charAt(0);

        if ( operacionAlmacenada == 's' || operacionAlmacenada == 'S' ) {

            System.out.println("Introduce dos números y te devolveré el resultado de la suma:");
            num1 = nume1.nextInt();
            num2 = nume2.nextInt();
            System.out.println("El resultado de la operación es: " + (num1 + num2));

        } //Repetir con los demás.

    }

}
