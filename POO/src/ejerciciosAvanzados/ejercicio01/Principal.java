// Ejercicio 01.
// Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos).
// El programa debe ser capaz de almacenar en un array N triángulos y rectángulos,
// y al final mostrar el área y los datos de cada uno.
// Para ello se tendrá lo siguiente:
//
// - Una super clase llamada Polígono.
// - Una sub clase llamada Rectángulo.
// - Una sub clase llamada Triángulo.

package ejerciciosAvanzados.ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    //Atributos de clase
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<>();

    //Métodos de clase
    public static void main(String[] args) {

        almacenarPoligonos();
        mostrarPoligonos();

    }

    public static void almacenarPoligonos() {

        char continuar;
        int eleccion;

        //DoWhile para almacenar polígonos y preguntar hasta cuando seguir almacenando.
        do {

            System.out.println("""
                        Para introducir un polígono elige una opción:
                        1. Triángulo.
                        2. Rectángulo
                        """);
            eleccion = entrada.nextInt();

            if (eleccion == 1) {
                crearTriangulo();
            } else if (eleccion == 2) {
                crearRectangulo();
            }

            System.out.println("""
                    Si desea introducir más polígonos pulse la tecla 'S'.
                    Pulsa cualquier otra tecla para finalizar.""");
            continuar = entrada.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

    }

    public static void crearTriangulo() {

        double lado1, lado2, lado3;

        System.out.println("""
                *********************
                TRIÁNGULO:
                
                """);
        System.out.print("Lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = entrada.nextDouble();
        System.out.println("\n*********************");

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligonos.add(triangulo);

    }

    public static void crearRectangulo() {

        double lado1, lado2;

        System.out.println("""
                *********************
                RECTÁNGULO:
                
                """);
        System.out.print("Lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.println("\n*********************");

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligonos.add(rectangulo);

    }

    public static void mostrarPoligonos() {

        for (Poligono poli: poligonos) {
            System.out.println(poli.mostrarDatos());
            System.out.println("Area: " + poli.area());
            System.out.println("\n++++++++++++++++++++++++");
            System.out.println("");
        }

    }

}
