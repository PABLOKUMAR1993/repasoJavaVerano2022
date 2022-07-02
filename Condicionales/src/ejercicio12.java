// Ejercicio 12.
// Pedir una nota de 0 a 10 y mostrarla de la siguiente forma:
// Insuficiente / Suficiente / Bien / Notable / Sobresaliente.

import java.util.Scanner;

public class ejercicio12 {

    public static void main (String args[]) {

        Scanner notaPedida;
        int nota;

        notaPedida = new Scanner(System.in);

        System.out.println("Introduce una nota y te dire su valor");
        nota = notaPedida.nextInt();

        switch (nota) {
            case 0:
                System.out.println("Insuficiente.");
                break;
            case 1:
                System.out.println("Insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Insuficiente.");
                break;
            case 4:
                System.out.println("Insuficiente.");
                break;
            case 5:
                System.out.println("Suficiente.");
                break;
            case 6:
                System.out.println("Bien.");
                break;
            case 7:
                System.out.println("Notable.");
                break;
            case 8:
                System.out.println("Notable.");
                break;
            case 9:
                System.out.println("Sobresaliente.");
                break;
            case 10:
                System.out.println("Sobresaliente.");
                break;
            default:
                System.out.println("Has introducido un numero superior a 10 o inferior a 0");
        }

    }

}
