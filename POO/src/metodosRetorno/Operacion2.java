package metodosRetorno;

// public int sumar ( int a, int b) { return valor; }
// Siempre que ponemos un valor de retorno diferente a void, es IMPRESCINDIBLE en dicho método poner el return.

public class Operacion2 {

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

}
