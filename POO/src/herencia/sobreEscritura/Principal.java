package herencia.sobreEscritura;

public class Principal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.comer();

        Persona persona = new Persona();
        persona.comer();

        Perro perro = new Perro();
        perro.comer();

    }

}
