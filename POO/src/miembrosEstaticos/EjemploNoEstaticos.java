package miembrosEstaticos;

public class EjemploNoEstaticos {

    //Atributos
    private String frase = "frase de ejemplo";

    public static void main(String[] args) {

        EjemploNoEstaticos objeto1 = new EjemploNoEstaticos();
        System.out.println(objeto1.frase);

        EjemploNoEstaticos objeto2 = new EjemploNoEstaticos();
        objeto2.frase = "frase segunda de ejemplo";
        System.out.println(objeto2.frase);

    }

}
