// Ejercicio 6.
// Leer los datos correspondientes a dos tablas de 12 elementos numéricos,
// y mezclarlos en una tercera de la siguiente forma:
// 3 de la tabla A,
// 3 de la tabla B,
// 3 de la tabla A,
// 3 de la tabla B.

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int[] arrayUno = new int[12];
        int[] arrayDos = new int[12];
        int[] arrayTres = new int[24];
        int contador = 0;

        System.out.println("Vamos a llenar el primer array");
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(
                "********************************" + "\n" +
                "Introduce la posición " + i + " del primer array:" + "\n" +
                "********************************");

            arrayUno[i] = numero.nextInt();
        }

        System.out.println("Vamos a llenar el segundo array");
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println(
                "********************************" + "\n" +
                "Introduce la posición " + i + " del segundo array:" + "\n" +
                "********************************");

            arrayDos[i] = numero.nextInt();
        }

        //Llenamos el tercer array

        for (int i = 0; i < arrayUno.length; i+=3) {
            arrayTres[contador] = arrayUno[i];
            contador++;
            arrayTres[contador] = arrayUno[i+1];
            contador++;
            arrayTres[contador] = arrayUno[i+2];
            contador++;
            arrayTres[contador] = arrayDos[i];
            contador++;
            arrayTres[contador] = arrayDos[i+1];
            contador++;
            arrayTres[contador] = arrayDos[i+2];
            contador++;
        }

        //Lo mostramos por pantalla

        System.out.println("""
                
                ****************
                EL TERCER ARRAY:
                ****************
                
                """);

        for (int i = 0; i < arrayTres.length; i++) {
            System.out.println(arrayTres[i]);
        }

    }

}
