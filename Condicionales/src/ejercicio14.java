// Ejercicio 14.
// Hacer un programa que pase de Kg a otra unidad de medida de masa,
// mostrar en pantalla un menú con las opciones posibles.

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String args[]) {

        Scanner kg, eleccion;
        kg = new Scanner(System.in);
        eleccion = new Scanner(System.in);
        int kilos, elegido;

        System.out.println("Introduce una cantidad en kilos y te la devolveré en la unidad que elijas después.");
        kilos = kg.nextInt();

        System.out.println("""
                Dime a que unidad quieres que te lo convierta:
                1. miligramos
                2. centigramos
                3. gramos
                4. decagramos
                5. hectogramos""");
        elegido = eleccion.nextInt();

        switch (elegido) {
            case 1:
                System.out.println((kilos * 1000000) + " mg.");
                break;
            case 2:
                System.out.println((kilos * 100000) + " cg.");
                break;
            case 3:
                System.out.println((kilos * 1000) + " g.");
                break;
            case 4:
                System.out.println((kilos * 100) + " dag.");
                break;
            case 5:
                System.out.println((kilos * 10) + " hg.");
                break;
            default:
                System.out.println("No has introducido una opción valida");
        }

    }

}
