package ejerciciosBasicos.ejercicio02;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Creo el objeto
        Objeto puntero = new Objeto();

        //Atributos
        Scanner n = new Scanner(System.in);
        String direccion;

        //Descripción del Juego
        System.out.println(
                """
                *****************************************************************************
                
                Bienvenido a mover el puntero por el tablero.
                En este juego tienes que ir diciendo direcciones y te iré moviendo el puntero
                en la dirección que me has indicado. Si la dirección que has indicado queda
                fuera del tablero no podrás moverte ahí.
                Es un tablero ficticio de 5 x 5 que empieza en el 0 y termina en el 4,
                en cada uno de los ejes tanto X cómo Y.
                
                *****************************************************************************
                """
        );

        System.out.println(
                """
                **********************************************
                
                Para empezar a jugar indica escribiendo:
                arriba · abajo · izquierda · derecha
                para indicar a dónde quieres mover el puntero.
                
                Para terminar el juego escribe "fin".
                
                **********************************************
                """
        );

        //Ejecución
        do {

            System.out.println("Escribe a dónde quieres mover el puntero:");
            direccion = n.next();
            puntero.mover(direccion);

        } while (0 != direccion.compareTo("fin"));


    }

}
