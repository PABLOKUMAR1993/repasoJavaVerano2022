package ejerciciosBasicos.ejercicio06;

public class Calculadora {

    //Constructor
    public Calculadora () {}

    //Métodos
    public double sumar(double num1, double num2) {
        double suma = num1 + num2;
        return suma;
    }

    public double multiplicar(double num1, double num2) {
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public String comparar(double num1, double num2) {
        String resultado;

        if(num1 > num2) {
            resultado = "EL MAYOR ES: " + num1;
        } else if (num2 > num1) {
            resultado = "EL MAYOR ES: " + num2;
        } else {
            resultado = "LOS DOS SON IGUALES";
        }

        return resultado;
    }

    public int multiplicarComplejoPorSimple(double num1, int num2) {
        double multiplicacion = num1 * num2;
        return (int) multiplicacion;
    }

}
