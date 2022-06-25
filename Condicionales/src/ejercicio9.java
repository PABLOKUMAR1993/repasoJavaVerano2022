// Ejercicio 10.
// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
// Suponiendo que todos los meses son de 30 días.

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String args[]) {

        Scanner anyo, mes, dia;
        anyo = new Scanner(System.in);
        mes = new Scanner(System.in);
        dia = new Scanner(System.in);

        int anyo2, mes2, dia2;

        System.out.println("Introduce una fecha y te dire si es correcta. (Primero introduce el año).");
        anyo2 = anyo.nextInt();
        System.out.println("Ahora introduce el mes");
        mes2 = mes.nextInt();
        System.out.println("Ahora introduce el día");
        dia2 = dia.nextInt();

        if ( mes2 >= 13 ) {
            System.out.println("El mes no puede ser superior a 12.");
        } else if ( mes2 <= 0 ) {
            System.out.println("El mes no puede inferior a 0.");
        } else if ( dia2 >= 31 ) {
            System.out.println("El día no puede ser superior a 30.");
        } else if ( dia2 <= 0 ) {
            System.out.println("El día no puede ser inferior a 0.");
        } else {
            System.out.println("La fecha introducida: " + anyo2 + " / " + mes2 + " / " + dia2 + " es correcta.");
        }
    }

}
