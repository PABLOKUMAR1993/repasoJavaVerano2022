package herencia;

public class Estudiante extends Persona {

    //Atributos
    private int codEstudiante;
    private double nota;

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codEstudiante, double nota) {
        super(nombre, apellido, edad);
        this.codEstudiante = codEstudiante;
        this.nota = nota;
    }

    //Métodos
    public void mostrarDatos() {
        System.out.println("***********************\n"+
                           "- Nombre: " + super.getNombre() + "\n" +
                           "- Apellido: " + super.getApellido() + "\n" +
                           "- Edad: " + super.getEdad() + "\n" +
                           "- Código de Estudiante: " + this.codEstudiante + "\n" +
                           "- Nota: " + this.nota + "\n" +
                           "***********************");
    }
}
