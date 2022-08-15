package ejerciciosBasicos.ejercicio03;

import java.util.Scanner;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) {

        //Atributos
        String marca, modelo;
        double precio;
        Scanner entrada = new Scanner(System.in);
        final String SEPRADOR = "**********************";
        int cantidadVehiculos;
        int indiceMasBarato;

        //Almacenamos la cantidad de vehículos
        System.out.println(SEPRADOR);
        System.out.println("¿Cuántos vehículos vas a crear?");
        cantidadVehiculos = entrada.nextInt();
        System.out.println(SEPRADOR);

        //Creamos tantos objetos cómo vehículos haya.
        Vehiculo coche[] = new Vehiculo[cantidadVehiculos];
        for(int i = 0; i < coche.length; i++) {
            System.out.println(SEPRADOR);
            System.out.println("Vamos a crear el vehículo " + i + ":");
            System.out.println(SEPRADOR);
            System.out.println("Introduce la Marca:");
            marca = entrada.next();
            System.out.println("Introduce el Modelo:");
            modelo = entrada.next();
            System.out.println("Introduce el Precio:");
            precio = entrada.nextInt();
            System.out.println(SEPRADOR);

            coche[i] = new Vehiculo(marca, modelo, precio);
        }

        //Comprobamos que vehículo es el más barato
        indiceMasBarato = comprobarMasBarato(coche);

        //Mostramos el coche más barato
        System.out.println(coche[indiceMasBarato].mostrarDatos());
    }

    public static int comprobarMasBarato(Vehiculo coche[]){
        double precio;
        int indice = 0;

        precio = coche[indice].getPrecio();

        for (int i = 0; i < coche.length; i++) {
            if (coche[i].getPrecio() < precio) {
                precio = coche[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }

}
