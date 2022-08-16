package herencia.polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Vehiculo miVehiculo[] = new Vehiculo[4];

        miVehiculo[0] = new Vehiculo("2354CTP", "RENAULT", "MEGANE");
        miVehiculo[1] = new Turismo("3456CTP", "AUDI", "A4", 5);
        miVehiculo[2] = new Deportivo("4567CTP", "KIA", "RIO", 500);
        miVehiculo[3] = new Furgoneta("6789CTP", "PEUGEOT", "FURGO", 4000);

        System.out.println(miVehiculo[0].mostrarDatos());
        System.out.println(miVehiculo[1].mostrarDatos());
        System.out.println(miVehiculo[2].mostrarDatos());
        System.out.println(miVehiculo[3].mostrarDatos());

    }

}
