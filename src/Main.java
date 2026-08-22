//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Vehiculo vehiculo1;
    Vehiculo vehiculo3;
    vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
    Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "Seat", "León", "Negro", 80.0);

    //System.out.println(vehiculo1.color);
    //System.out.println("Matricula: " + vehiculo1.matricula);
    //System.out.println("Marca y modelo: " + vehiculo1.marca + " " + vehiculo1.modelo);
    //System.out.println("color: " + vehiculo1.color);
    //System.out.println("Tarifa: " + vehiculo1.tarifa);


    System.out.println("El objeto vehiculo1 está disponible: " + vehiculo1.getDisponible());
    vehiculo1.setTarifa(90.0);
    System.out.println("Matricula: " + vehiculo1.getMatricula());
    System.out.println("Tarifa: " + vehiculo1.getTarifa());

    if (vehiculo2 == null)
    {
        System.out.println("vehiculo2 es una referencia null");
    }

    if (vehiculo2 != null)
    {
        System.out.println("vehiculo2 está instanciado");
    }

    vehiculo3 = vehiculo1;

    System.out.println("Matricula: " + vehiculo3.getMatricula());
    System.out.println("Tarifa: " + vehiculo3.getTarifa());

    vehiculo3.setTarifa(50.0);

    System.out.println("Tarifa: " + vehiculo1.getTarifa());
    System.out.println("Tarifa: " + vehiculo3.getTarifa());

    //invocación del metodo getAtributos para mostrar los datos del objeto vehiculo

    System.out.println("Datos del vehiculo " + vehiculo1.getAtributos());

    MisVehiculos.recibirVehiculoAlquilado(vehiculo1);

    System.out.println("El objeto vehiculo1 está disponible: " + vehiculo1.getDisponible());

    System.out.println("Datos del vehiculo: " + vehiculo1.getAtributos(20.0));
}
