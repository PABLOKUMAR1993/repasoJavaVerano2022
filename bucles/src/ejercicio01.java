// Ejercicio 1.
// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String args[]) {

        Scanner numPedido = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("""
                    Introduce un número y te devolveré su cuadrado.
                    Introduce un número negativo para salir del bucle.""");
            num = numPedido.nextInt();
            if ( num >= 0 ) {
                System.out.println("El cuadrado es: " + (num * num));
            } else {
                System.out.println("Has salido del bucle con éxito.");
            }
        } while (num >= 0);

    }

}
