package ejerciciosBasicos.ejercicio05;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Atributos
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int cantidadTriangulos;

        //Definimos el Array y creamos los Objetos
        System.out.println("Introduce la cantidad de triángulos que vas a crear:");
        cantidadTriangulos = entrada.nextInt();

        Triangulo triangulos[] = new Triangulo[cantidadTriangulos];

        for(int i = 0; i < triangulos.length; i++) {
            System.out.println("***********************************************" + "\n" +
                               "INTRODUCE LOS DATOS PARA EL TRIÁNGULO " + (i+1) + ":" + "\n");
            System.out.print("- Introduce la Base: ");
            base = entrada.nextDouble();
            System.out.print("- Introduce el Lado: ");
            lado = entrada.nextDouble();
            System.out.println("***********************************************" + "\n");

            triangulos[i] = new Triangulo(lado, base);
        }

        //Mostramos el área y perimetro de cada triángulo
        for(int i = 0; i < triangulos.length; i++) {
            System.out.println("***********************************************" + "\n" +
                               "DATOS DEL TRIÁNGULO " + (i+1) + ":" + "\n");
            System.out.println("Área: " + triangulos[i].calcularArea());
            System.out.println("Perimetro: " + triangulos[i].calcularPerimetro());
            System.out.println("***********************************************" + "\n");
        }

        //Mostramos el triángulo de mayor tamaño:
        System.out.println("***********************************************" + "\n" +
                           "EL TRIÁNGULO DE MAYOR SUPERFICIE TIENE UN AREA DE: " + "\n");
        System.out.println("Área: " + areaMayor(triangulos));
        System.out.println("\n" + "***********************************************");
    }

    public static double areaMayor(Triangulo triangulo[]) {
        double area;
        area = triangulo[0].calcularArea();

        for(int i = 0; i < triangulo.length; i++) {
            if(area < triangulo[i].calcularArea()) {
                area = triangulo[i].calcularArea();
            }
        }

        return area;
    }

}
