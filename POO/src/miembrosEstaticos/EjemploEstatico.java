package miembrosEstaticos;

public class EjemploEstatico {

    //Atributo
    private static String frase = "frase de ejemplo";

    private static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {

        System.out.println(EjemploEstatico.frase);
        EjemploEstatico.frase = "frase modificada de ejemplo";
        System.out.println(EjemploEstatico.frase);

        System.out.println(EjemploEstatico.sumar(3, 4));

    }

}
