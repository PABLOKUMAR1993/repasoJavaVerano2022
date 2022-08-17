package ejerciciosAvanzados.ejercicio01;

public class Rectangulo extends Poligono {

    //Atributos
    double lado1, lado2;

    //Constructor
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Métodos
    public double area() {
        double resultado = lado1 * lado2;
        return resultado;
    }

    @Override
    public String mostrarDatos() {
        return ("++++++++++++++++++++++++\n" +
                "EL RECTÁNGULO\n" +
                "Tiene " + super.getNumeroLados() + " lados." +
                "Sus lados miden: " + lado1 + ", " + lado2 + ".");
    }

    //Getters & Setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
