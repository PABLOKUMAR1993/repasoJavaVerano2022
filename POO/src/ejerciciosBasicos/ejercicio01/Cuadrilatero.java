// Ejercicio 1:
// Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
// Los valores de la longitud deberán introducirse por línea de órdenes.
// Si es un cuadrado, solo se proporcionará la longitud de uno de los lados al constructor.

package ejerciciosBasicos.ejercicio01;

public class Cuadrilatero {

    //Atributos:
    private double lado1;
    private double lado2;

    //Métodos constructores:
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    //Métodos de clase:
    public double getArea() {
        return 2 * (lado1 * lado2);
    }

    public double getPerimetro() {
        return 2 * (lado1 + lado2);
    }

}
