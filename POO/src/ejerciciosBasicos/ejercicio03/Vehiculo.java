// Ejercicio 03.
// Construir un programa que dada una serie de vehículos caracterizados por su:
// marca, modelo y precio.
// Imprimir las propiedades del vehículo más barato.
// Para ello, deberán leer por teclado las características de cada vehículo y
// crear una clase que represente a cada uno de ellos.

package ejerciciosBasicos.ejercicio03;

public class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private double precio;

    //Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = marca;
        this.precio = precio;
    }

    //Métodos
    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return ("**************************" + "\n" +
                "EL VEHÍCULO MÁS BARATO ES:" + "\n" +
                "EL MODELO ES: " + this.modelo + "\n" +
                "LA MARCA ES: " + this.marca + "\n" +
                "EL PRECIO ES: " + this.precio);
    }

}
