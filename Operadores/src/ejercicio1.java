// Ejercicio 1.
// Hacer un programa que calcule e imprima la suma de tres calificaciones.

import com.sun.security.auth.module.NTSystem;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String args[]) {

        Scanner notas = new Scanner(System.in);

        int nota1 , nota2, nota3, resultado;

        System.out.println("Escribe 3 calificaciones");
        nota1 = notas.nextInt();
        nota2 = notas.nextInt();
        nota3 = notas.nextInt();

        resultado = nota1 + nota2 + nota3;

        System.out.print("La suma de todas las notas es: " + resultado);

    }

}
