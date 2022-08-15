// Ejercicio 02.
// Construir un programa que permita dirigir el movimiento de un objeto dentro
// de un tablero y actualice su posición dentro del mismo.
// Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
// Tras cada movimiento el programa mostrará la nueva dirección elegida y
// las coordenadas de situación del objeto dentro del tablero.

package ejerciciosBasicos.ejercicio02;

public class Objeto {

    //Atributos
    private int posicionX = 0;
    private int posicionY = 0;
    private String direccion;

    //Constructor
    public Objeto() {}

    //Métodos
    public void mover(String direccionRecibida) {

        if(direccionRecibida.equals("arriba")) {
            posicionY -= 1;
            if(posicionY < 0) {
                posicionY += 1;
                System.out.println("""
                        *******************************************
                        No puedes moverte arriba, ya estas en Y = 0
                        *******************************************
                        """);
            } else {
                this.direccion = direccionRecibida;
                mostrarDireccin();
                mostrarCoordenadas();
            }
        } else if (direccionRecibida.equals("abajo")) {
            posicionY += 1;
            if(posicionY > 4) {
                posicionY -= 1;
                System.out.println("No puedes moverte abajo, ya estas en Y = 4");
            } else {
                this.direccion = direccionRecibida;
                mostrarDireccin();
                mostrarCoordenadas();
            }
        } else if (direccionRecibida.equals("izquierda")) {
            posicionX -= 1;
            if (posicionX < 0) {
                posicionX += 1;
                System.out.println("No puedes moverte a la izquierda, ya estas en X = 0");
            } else {
                this.direccion = direccionRecibida;
                mostrarDireccin();
                mostrarCoordenadas();
            }
        } else if (direccionRecibida.equals("derecha")) {
            posicionX += 1;
            if (posicionX > 5) {
                posicionX -= 1;
                System.out.println("No puedes moverte a la derecha, ya estas en X = 4");
            } else {
                this.direccion = direccionRecibida;
                mostrarDireccin();
                mostrarCoordenadas();
            }
        } else if (direccionRecibida.equals("derecha")) {
            System.out.println("Has finalizado el juego");
        }else {
            System.out.println("Has introducido una dirección no valida");
        }

    }

    private void mostrarDireccin() {
        System.out.println("La dirección que has elegido es: " + this.direccion);
    }

    private void mostrarCoordenadas() {
        System.out.println("- Las coordenadas actuales son:" + "\n" +
                "X: " + posicionX + "\n" +
                "Y: " + posicionY);
    }

}

