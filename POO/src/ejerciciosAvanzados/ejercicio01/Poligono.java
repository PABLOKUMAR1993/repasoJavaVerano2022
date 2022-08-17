package ejerciciosAvanzados.ejercicio01;

public abstract class Poligono {

    //Atributos
    private int numeroLados;

    //Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Getters
    public int getNumeroLados() {
        return numeroLados;
    }

    //Setters
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Métodos
    public abstract double area();

    public String mostrarDatos() {
        return "numero de lados: " + numeroLados;
    }


}
