// Ejercicio 05.
// Diseñar un programa para trabajar con triángulos isósceles.
// Para ello definir los atributos necesarios que se requieren,
// proporcionar métodos de consulta, un constructor e implementar
// métodos para calcular el perímetro y el área de un triángulo,
// además implementar un método que a partir de un array de triángulos
// devuelva el área del triángulo de mayor superficie.

package ejerciciosBasicos.ejercicio05;

public class Triangulo {

    //Atributos
    private double lado;
    private double base;

    //Constructor
    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    //Métodos
    public double calcularPerimetro() {
        double perimetro = 2 * lado + base;
        return perimetro;
    }

    public double calcularArea() {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4)) / 2);
        return area;
    }

    public String mostrartriangulo() {
        return ("******************************" + "\n" +
                "LA BASE ES: " + this.base + "\n" +
                "LOS LADOS SON: " + this.lado + "\n" +
                "EL PERIMETRO ES: " + calcularPerimetro() + "\n" +
                "EL ÁREA ES: " + calcularArea() + "\n" +
                "******************************");
    }

}
