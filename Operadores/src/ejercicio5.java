// Ejercicio 5.
// La calificación final de un estudiante de informática se calcula con vase a las calificaciones de cuatro aspectos
// de su rendimiento académico: prácticas, primer examen parcial, segundo examen parcial y examen final.
// Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%,
// Hacer un programa que calcule e imprima la calcification final obtenida por un estudiante.

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String args[]) {

        //Declaro las variables.
        final int practica = 10, primerParcial = 25, segundoParcial = 25, examenFinal = 40;
        double notaPractica, notaPrimerParcial, notaSegundoParcial, notaExamenFinal, notaFinal;

        //Pido las 4 notas.
        System.out.println("Introduce las notas del alumno: (máximo un 10).");

        //Guardo las 4 notas.
        Scanner preguntarNotas = new Scanner(System.in);
        notaPractica = preguntarNotas.nextDouble();
        notaPrimerParcial = preguntarNotas.nextDouble();
        notaSegundoParcial = preguntarNotas.nextDouble();
        notaExamenFinal = preguntarNotas.nextDouble();

        //Opero con las 4 notas.
        notaPractica = notaPractica * practica / 100;
        notaPrimerParcial = notaPrimerParcial * primerParcial / 100;
        notaSegundoParcial = notaSegundoParcial * segundoParcial / 100;
        notaExamenFinal = notaExamenFinal * examenFinal / 100;

        //Sumo los resultados.
        notaFinal = notaPractica + notaPrimerParcial + notaSegundoParcial + notaExamenFinal;

        //Muestro los resultados por pantalla.
        System.out.println("La nota media final es: " + notaFinal );

    }

}
