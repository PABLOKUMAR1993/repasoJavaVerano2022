package ejerciciosBasicos.ejercicio06;

import java.net.CacheRequest;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Atributos
        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        int num3, opcion;

        //Métodos
        System.out.println("""
                *************************************
                
                BIENVENIDO A LA CALCULADORA:
                En el siguiente menú elige la opción
                que quieras realizar y seguidamente
                introduce dos números para hacer la
                operación.
                
                1. Sumar.
                2. Multiplicar.
                3. Comparar.
                4. Multiplicar (Entero por Simple).
                
                *************************************
                
                """);
        opcion = entrada.nextInt();

        //Creamos el objeto
        Calculadora calculo = new Calculadora();

        //Llamamos al método elegido
        switch (opcion) {
            case 1:
                System.out.println("""
                        *************************************
                        
                        HAS ELEGIDO 1. SUMAR:
                        
                        """);
                System.out.print("- Introduce el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("- Introduce el segundo número: ");
                num2 = entrada.nextDouble();
                System.out.println("\n"+"EL RESULTADO ES: " + calculo.sumar(num1, num2)
                                +"\n"+"*************************************");
                break;

            case 2:
                System.out.println("""
                        *************************************
                        
                        HAS ELEGIDO 2. MULTIPLICAR:
                        
                        """);
                System.out.print("- Introduce el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("- Introduce el segundo número: ");
                num2 = entrada.nextDouble();
                System.out.println("\n"+"EL RESULTADO ES: " + calculo.multiplicar(num1, num2)
                        +"\n"+"*************************************");
                break;

            case 3:
                System.out.println("""
                        *************************************
                        
                        HAS ELEGIDO 3. COMPARAR:
                        
                        """);
                System.out.print("- Introduce el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("- Introduce el segundo número: ");
                num2 = entrada.nextDouble();
                System.out.println("\n" + calculo.comparar(num1, num2)
                        +"\n"+"*************************************");
                break;

            case 4:
                System.out.println("""
                        *************************************
                        
                        HAS ELEGIDO 4. MULTIPLICAR (entero x simple):
                        
                        """);
                System.out.print("- Introduce el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("- Introduce el segundo número: ");
                num3 = entrada.nextInt();
                System.out.println("\n"+"EL RESULTADO ES: " + calculo.multiplicarComplejoPorSimple(num1, num3)
                        +"\n"+"*************************************");
                break;

            default:
                System.out.println("""
                        ************************************
                        
                        HAS INTRODUCIDO UNA OPCIÓN NO VALIDA
                        
                        ************************************""");
        }

    }

}
