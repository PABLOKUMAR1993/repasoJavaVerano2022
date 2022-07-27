package metodosRetorno;
import javax.swing.*;

public class Main2 {

    public static void main (String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número"));

        Operacion op = new Operacion();

        System.out.println(
                "La suma es: " + op.sumar(n1, n2) + "\n" +
                "La resta es: " + op.restar(n1, n2) + "\n" +
                "La multiplicación es: " + op.multiplicar(n1, n2) + "\n" +
                "La división es: " + op.dividir(n1, n2)
                );

    }

}
