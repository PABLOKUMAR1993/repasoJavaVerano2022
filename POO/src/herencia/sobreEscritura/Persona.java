package herencia.sobreEscritura;

public class Persona extends Animal{

    @Override
    public void comer() {
        System.out.println("Estoy comiendo con cubiertos y sentado en la mesa");
    }

}
