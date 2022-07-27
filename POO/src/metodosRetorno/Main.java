package metodosRetorno;
import javax.swing.*;

public class Main {

    public static void main (String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número"));

        Operacion op = new Operacion();

        //Al tener valores de retorno los métodos, podemos almacenar el resultado de llamar al método en una variable.
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);

        op.mostrarResultados(suma, resta, multiplicacion, division);

    }

}
