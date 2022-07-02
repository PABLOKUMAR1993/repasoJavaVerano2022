// Ejercicio 13.
// Hacer un programa que simule un cajero automático con un saldo inicial de €1000, con el siguiente menú de opciones:
// 1. Ingresar dinero a la cuenta.
// 2. Retirar dinero de la cuenta.
// 3. Salir.

import java.util.Scanner;

public class ejercicio13 {

    public static void main (String args[]) {

        Scanner operacion, cantidadIngreso, cantidadRetirada;
        operacion = new Scanner(System.in);
        cantidadIngreso = new Scanner(System.in);
        cantidadRetirada = new Scanner(System.in);
        int operacionElegida, saldo, ingreso, retirada;
        saldo = 1000;

        System.out.println("Introduce que es lo que deseas hacer:" + "\n" +
                            "1. Ingresar dinero en tu cuenta." + "\n" +
                            "2. Retirar dinero de la cuenta." + "\n" +
                            "3. Salir.");

        operacionElegida = operacion.nextInt();

        switch (operacionElegida) {
            case 1:
                System.out.println("Introduce la cantidad de dinero que quieres ingresar:");
                ingreso = cantidadIngreso.nextInt();
                saldo = saldo + ingreso;
                System.out.println("Ingreso realizado con éxito, tu nuevo saldo es de: " + saldo + "€.");
                break;
            case 2:
                System.out.println("Introduce la cantidad de dinero que quieres retirar:");
                retirada = cantidadRetirada.nextInt();
                if (retirada > saldo) {
                    System.out.println("No puedes retirar más dinero del que tienes. Actualmente tienes " + saldo + "€.");
                }
                break;
            case 3:
                break;
            default:
                System.out.println("No has introducido una opción valida.");
        }

    }

}
