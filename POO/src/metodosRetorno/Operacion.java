package metodosRetorno;

// public int sumar ( int a, int b) { return valor; }
// Siempre que ponemos un valor de retorno diferente a void, es IMPRESCINDIBLE en dicho método poner el return.

public class Operacion {

    //Métodos
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public int dividir(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }

}
