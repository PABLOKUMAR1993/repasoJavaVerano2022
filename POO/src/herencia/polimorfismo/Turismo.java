package herencia.polimorfismo;

public class Turismo extends Vehiculo{

    private int numeroPuertas;

    public Turismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Turismo {" +
                "matricula='" + super.getMatricula() + '\'' +
                ", marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                "numeroPuertas=" + this.numeroPuertas +
                '}';
    }
}
