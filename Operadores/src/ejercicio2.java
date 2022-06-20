// Ejercicio 2. Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas
// semanales trabajadas y de su salario por hora.

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String args[]) {

        Scanner salarioHora = new Scanner(System.in), totalHoras = new Scanner(System.in);
        double salario, horas, resultado;

        System.out.println("Díme cuanto cobras por hora:");
        salario = salarioHora.nextDouble();

        System.out.println("Díme cuantas horas has trabajado esta semana:");
        horas = totalHoras.nextDouble();

        resultado = salario * horas;

        System.out.println("Tu salario semanal es de: " + resultado);
    }

}
