// Ejercicio 4.
// Una compañía de venta de coches usados, paga a su personal de ventas un salario de €1000 mensuales,
// más una comisión de €150 por cada coche vendido,
// más el 5% del valor de la venta por el coche.
// Cada mes el contable de la empresa ingresa en el ordenador los datos pertinentes.
// Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String args[]) {

        Scanner ventaCoche = new Scanner(System.in);
        double venta, comisionVenta, salarioFinal;
        final double comisionFija = 150, salario = 1000, comisionVariable = 5;

        System.out.println("Introduce el valor de la venta del coche:");

        venta = ventaCoche.nextDouble();
        comisionVenta = venta * comisionVariable / 100;

        salarioFinal = salario + comisionFija + comisionVenta;

        System.out.println("El salario del empleado con la venta del vehículo es de: " + salarioFinal + " €.");

    }

}
