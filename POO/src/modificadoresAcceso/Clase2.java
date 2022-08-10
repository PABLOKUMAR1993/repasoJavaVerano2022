package modificadoresAcceso;

public class Clase2 {

    public static void main(String[] args) {

        //Creo un objeto
        Clase1 clase1 = new Clase1();

        //Establezco la edad
        clase1.setEdad(29);

        //Ver la edad
        System.out.println("La edad es: " + clase1.getEdad());

    }

}
