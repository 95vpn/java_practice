public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

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

    public Vehiculo(String matricula,
                    String marca,
                    String modelo,
                    String color)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = 0.0;
        this.disponible = false;
    }

    // los métodos get y set de la clase vehiculo

    public String getAtributos()
    {
        String atributos;
        atributos = "Matricula: " + this.matricula +
                " Modelo: " + this.marca + " " + this.modelo +
                " Color: " + this.color +
                " Tarifa: " + this.tarifa +
                " Disponible: " + this.disponible;

        return atributos;

    }

    public String getAtributos(double porcentajeDescuento)
    {
        return "Matrícula: " + getMatricula() + " " +
                "Modelo: " + getMarca() + " " + getModelo() +
                " Color: " + getColor() + " Tarifa: " + (100.0 - porcentajeDescuento)/100*tarifa +
                " Disponible: " + getDisponible();
    }
    public String getMatricula()
    {
        return this.matricula;
    }

    public String getMarca()
    {
        return this.marca;
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public String getColor()
    {
        return this.color;
    }

    public double getTarifa()
    {
        return this.tarifa;
    }

    public boolean getDisponible()
    {
        return this.disponible;
    }

    public void setTarifa(double tarifa)
    {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible)
    {
        this.disponible = disponible;
    }



}
