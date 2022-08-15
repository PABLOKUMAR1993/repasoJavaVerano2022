package ejerciciosBasicos.ejercicio04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Atributos
        int cantidadAtletas;
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta;
        String nombreAtleta;
        double tiempoAtleta;
        int indiceMasRapido;

        //Averiguamos cuántos atletas han corrido
        System.out.println("""
                
                ¿Cuántos atletas han corrido en la carrera?
                
                """);
        cantidadAtletas = entrada.nextInt();

        //Creamos los atletas
        Atleta corredor[] = new Atleta[cantidadAtletas];
        for(int i = 0; i < corredor.length; i++) {
            System.out.println(
                    "*********************************" + "\n"
                    + "Introduce los datos del atleta " + i + "\n" +
                    "*********************************");
            System.out.println("¿Cual es el número del atleta? " + i + ":" + "\n");
            numeroAtleta = entrada.nextInt();
            System.out.println("¿Cual es el nombre del atleta? " + i + ":" + "\n");
            nombreAtleta = entrada.next();
            System.out.println("¿Cual es el tiempo del atleta? " + i + ":" + "\n");
            tiempoAtleta = entrada.nextDouble();

            corredor[i] = new Atleta(numeroAtleta, nombreAtleta, tiempoAtleta);
        }

        //Averiguamos cuál es el atleta más rápido
        indiceMasRapido = calcularMasRapido(corredor);

        //Mostramos el atleta más rápido
        corredor[indiceMasRapido].mostrarAtleta();
    }

    private static int calcularMasRapido(Atleta corredor[]) {

        double tiempo;
        int indice = 0;

        tiempo = corredor[indice].getTiempoAtleta();
        for(int i = 0; i < corredor.length; i++) {
            if(corredor[i].getTiempoAtleta() < tiempo) {
                indice = i;
                tiempo = corredor[i].getTiempoAtleta();
            }
        }

        return indice;

    }

}
