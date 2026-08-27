public class MisVehiculos {
    public static void recibirVehiculoAlquilado(Vehiculo v)
    {
        v.setDisponible(true);
    }
    public static void main (String args[])
    {
        Vehiculo vehiculo1 = new Vehiculo("4060 ABJ",
                "VW", "GTI", "Blanco", 100.0);

        Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0);
    }
}
