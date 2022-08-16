package herencia.polimorfismo;

public class Furgoneta extends Vehiculo {

    int carga;

    public Furgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        return "Furgoneta {" +
                "matricula='" + super.getMatricula() + '\'' +
                ", marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                "Carga=" + this.carga +
                '}';
    }
}
