package sobrecargaMetodos;

public class Main {

    public static void main(String[] args) {

        Persona pavlo = new Persona("Pavlo", 29);
        pavlo.correr();

        Persona angel = new Persona(12345678);
        angel.correr(44);

    }

}
