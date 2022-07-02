// Ejercicio 10.
// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
// Con meses de 28, 30 y 31 días.
// Sin años bisiestos.

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String args[]) {

        Scanner anyoDado, mesDado, diaDado;
        int anyo, mes, dia;

        anyoDado = new Scanner(System.in);
        mesDado = new Scanner(System.in);
        diaDado = new Scanner(System.in);

        System.out.println("Introduce un día, seguido del mes y por último el año y te dire si es una fecha correcta");

        dia = diaDado.nextInt();
        mes = mesDado.nextInt();
        anyo =anyoDado.nextInt();

        if ( dia > 31 ) {
            System.out.println("El día no puede ser superior a 31.");
        } else if ( dia < 1 ) {
            System.out.println("El día no puede ser inferior a 1.");
        } else if ( mes > 12 ) {
            System.out.println("El mes no puede ser superior al 12.");
        } else if ( mes < 1) {
            System.out.println("El mes no puede ser inferior a 1.");
        } else if ( mes == 2 && dia > 28 ) {
            System.out.println("Febrero no puede tener más de 28 días");
            //Esta condición se puede repetir con abril, junio, septiembre y noviembre para los meses de 30 días.
        } else {
            System.out.println("La fecha que has introducido es correcta: " + dia + " / " + mes + " / " + anyo);
        }

    }

}
