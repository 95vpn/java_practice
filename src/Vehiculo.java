public class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    public Vehiculo(String matricula,
                    String marca,
                    String modelo,
                    String color,
                    double tarifa)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo= modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

}
