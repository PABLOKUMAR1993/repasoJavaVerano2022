// Ejercicio 15.
// Dadas las edades y altura de 5 alumnos,
// mostrar la edad y la estatura media,
// la cantidad de alumnos mayores de 18 años,
// la cantidad de alumnos que miden más de 175 cm.

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {

        Scanner edadDada, alturaDada;
        edadDada = new Scanner(System.in);
        alturaDada = new Scanner(System.in);
        int edad, altura, edadMedia = 0, alturaMedia = 0, mayores = 0, altos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Dime la edad del alumno " + i);
            edad = edadDada.nextInt();
            edadMedia += edad;
            System.out.println("Dime en centímetros la altura del alumno " + i);
            altura = alturaDada.nextInt();
            alturaMedia += altura;

            if (edad >= 18) mayores++;
            if (altura >= 175) altos++;

        }

        System.out.println(
            "La edad media es: " + (edadMedia/5) + "\n" +
            "La altura media es: " + (alturaMedia/5) + "\n" +
            "La cantidad de alumnos mayores de 18 años es: " + mayores + "\n" +
            "La cantidad de alumnos más altos que 175cm es: " + altos
        );

    }

}
