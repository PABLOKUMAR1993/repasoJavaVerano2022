package metodos;
import javax.swing.*;

// public void metodo ( int a, String b ) {}  --  Esto sería un método que recibe parámetros.
// objeto.metodo( 10, "Hola" );  --  Esto sería la invocación de un método con envío de atributos.


public class Operacion {

    //Atributos
    int suma, resta, multiplicacion, division;

    //Métodos

    public void sumar(int num1, int num2) {
        suma = num1 + num2;
    }

    public void restar(int num1, int num2) {
        resta = num1 - num2;
    }

    public void multiplicar(int num1, int num2) {
        multiplicacion = num1 * num2;
    }

    public void dividir(int num1, int num2) {
        division = num1 / num2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }


}
