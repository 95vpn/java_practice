public class VehiculoAlquilado
{
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente,
                             Vehiculo vehiculo,
                             int diaAlquiler,
                             int mesAlquiler,
                             int añoAlquiler,
                             int totalDiasAlquiler)
    {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente()
    {
        return this.cliente;
    }

    public Vehiculo getVehiculo()
    {
        return this.vehiculo;
    }
}
