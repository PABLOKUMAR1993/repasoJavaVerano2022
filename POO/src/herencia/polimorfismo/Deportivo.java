package herencia.polimorfismo;

public class Deportivo extends Vehiculo {

    int cilindrada;

    public Deportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Deportivo {" +
                "matricula='" + super.getMatricula() + '\'' +
                ", marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                "cilindrada=" + this.cilindrada +
                '}';
    }
}
