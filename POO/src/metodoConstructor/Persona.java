package metodoConstructor;

public class Persona {
    //Atributos:
    String nombre;
    int edad;

    //Método Constructor:
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos
    public void mostrarDatos() {
        System.out.println("El nombre de la persona es: " + nombre + "\n" +
                            "La edad de la persona es:" + edad);
    }

}
