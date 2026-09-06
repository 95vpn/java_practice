public class Circulo {
    public static final double PI = 3.1415936536;
    private double radio;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return this.radio;
    }

    public double calcularPerimetro()
    {
        return 2*PI*this.radio;
    }

    public double calcularArea()
    {
        return PI * this.radio * this.radio;
    }
}
