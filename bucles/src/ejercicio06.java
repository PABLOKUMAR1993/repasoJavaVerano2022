// Ejercicio 06.
// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {

        Scanner numeroDado = new Scanner(System.in);
        int acumulado, numero;

        acumulado = 0;

        System.out.println("Introduce números y te los iré sumando. Cuándo introduzcas 0 te mostraré la suma de todos.");

        do {

            numero = numeroDado.nextInt();
            acumulado = acumulado + numero;

        } while (numero != 0); //Mientras que sea diferente de 0.

            System.out.println("La suma de todos los numeros que has introducido es de: " + acumulado);

    }

}
