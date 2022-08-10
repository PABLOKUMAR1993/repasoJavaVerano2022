package sobrecargaMetodos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    int dni;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public void correr() {
        System.out.println("Soy " + nombre + " tengo " + edad + " y estoy corriendo una maratón");
    }

    public void correr(int km) {
        System.out.println("Estoy corriendo una maratón de " + km);
    }

}
