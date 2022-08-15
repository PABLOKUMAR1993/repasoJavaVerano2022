// Ejercicio 04.
// Construir un programa para una competición de atletismo.
// El programa debe gestionar una serie de atletas caracterizados por:
// El número de Atleta, el nombre del Atleta y el tiempo de la carrera.
// El programa al final debe de mostrar los datos del atleta ganador.

package ejerciciosBasicos.ejercicio04;

public class Atleta {

    //Atributos
    private int numerAtleta;
    private String nombreAtleta;
    private double tiempoAtleta;

    //Constructor
    public Atleta(int numerAtleta, String nombreAtleta, double tiempoAtleta) {
        this.numerAtleta = numerAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoAtleta = tiempoAtleta;
    }

    //Métodos de clase
    public double getTiempoAtleta() {
        return tiempoAtleta;
    }

    public void mostrarAtleta() {
        System.out.println(
                "************************************************" + "\n" +
                "EL ATLETA MÁS RÁPIDO HA SIDO: " + this.nombreAtleta.toUpperCase() + "\n" +
                "CON EL DORSAL NÚMERO: " + this.numerAtleta + "\n" +
                "CON UN TIEMPO GANADOR DE: " + this.tiempoAtleta + "\n" +
                "************************************************"
        );
    }

}
