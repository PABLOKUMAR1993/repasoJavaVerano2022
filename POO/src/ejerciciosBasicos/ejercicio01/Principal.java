package ejerciciosBasicos.ejercicio01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Atributos
        double lado1;
        double lado2;
        int cantidad;
        Scanner n = new Scanner(System.in);

        //Selección de cuadrado o cuadrilátero
        System.out.println("- ¿Cuántos lados vas a introducir? - 1 ó 2");
        cantidad = n.nextInt();

        if (cantidad == 2) {
            System.out.println("Introduce el lado 1 del cuadrilátero:");
            lado1 = n.nextDouble();
            System.out.println("Introduce el lado 2 del cuadrilátero:");
            lado2 = n.nextDouble();

            Cuadrilatero figura1 = new Cuadrilatero(lado1, lado2);

            System.out.println("El área es: " + figura1.getArea());
            System.out.println("El perimetro es: " + figura1.getPerimetro());
        } else {
            System.out.println("Introduce el lado del cuadrado:");
            lado1 = n.nextDouble();

            Cuadrilatero figura2 = new Cuadrilatero(lado1);

            System.out.println("El área es: " + figura2.getArea());
            System.out.println("El perimetro es: " + figura2.getPerimetro());
        }

    }

}
