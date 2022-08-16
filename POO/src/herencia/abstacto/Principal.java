package herencia.abstacto;

public class Principal {

    public static void main(String[] args) {

        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        AnimalHerviboro animalHerviboro = new AnimalHerviboro();

        planta.alimentarse();
        animalCarnivoro.alimentarse();
        animalHerviboro.alimentarse();

    }

}
