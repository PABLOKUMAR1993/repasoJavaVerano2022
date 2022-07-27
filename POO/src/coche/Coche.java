package coche;

// Crear una clase:
// public class Coche {}
//
// Crear un objeto de la clase:
// Coche coche1 = new Coche();

public class Coche {

    // Atributos:
    String color, marca;
    int km;

    //Creamos un método llamado main:
    public static void main (String[] args) {

        // Creamos un objeto:
        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es:" + coche1.color);
        System.out.println("La marca del coche1 es:" + coche1.marca);
        System.out.println("El kilometraje del coche1 es:" + coche1.km);

        // Creamos otro objeto:
        Coche coche2 = new Coche();

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("El color del coche2 es:" + coche2.color);
        System.out.println("La marca del coche2 es:" + coche2.marca);
        System.out.println("El kilometraje del coche2 es:" + coche2.km);

    }

}
