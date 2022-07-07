// Ejercicio 5.
// Realizar un juego para adivinar un número.
// Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor"
// según sea mayor o menor con respecto a N.
// El proceso termina cuando el usuario acierta y mostrara el número de intentos.

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String args[]) {

        Scanner numDado = new Scanner(System.in);
        int aleatorio, intentos, num;

        aleatorio = (int)(Math.random()*101);
        intentos = 0;

        System.out.println("""
                Intenta adivinar el número que he generado aleatoriamente entre el 0 y el 100.
                Ve escribiendo números y te diré si estas por encima o por debajo""");

        do {

            System.out.println("Introduce un número:");
            num = numDado.nextInt();

            intentos++;

            if (num > aleatorio) {
                System.out.println("El número que has introducido es más grande que aleatorio.");
            } else if (num < aleatorio) {
                System.out.println("El número que has introducido es más pequeño que el aleatorio.");
            } else {
                System.out.println(
                        "¡¡HAS GANADO!!" + "\n" +
                        "El número ganador es el: " + aleatorio + "\n" +
                        "La cantidad de intentos que has necesitado es de: " + intentos);
            }

        } while (num != aleatorio); //Mientras que sea diferente de aletorio.

    }

}
