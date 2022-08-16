package herencia.abstacto;

public class AnimalCarnivoro extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("Los animales carnívoros se alimentan de carne");
    }
}
