package operaciones;

// public es el modificador de acceso (public / private / protected).
// void es el valor de retorno (void / int / String).

import javax.swing.*;

public class Operacion {

    //Atributos
    int num1, num2, suma, resta, multiplicacion, division;

    //Métodos
    public void leerNumeros() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número"));
    }

    public void sumar() {
        suma = num1 + num2;
    }

    public void restar() {
        resta = num1 - num2;
    }

    public void multiplicar() {
        multiplicacion = num1 * num2;
    }

    public void dividir() {
        division = num1 / num2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }

}
