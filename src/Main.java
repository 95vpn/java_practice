//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Calendar;

void main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //Vehiculo vehiculo1;
    int edad, diaHoy, mesHoy, añoHoy;
    diaHoy= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    mesHoy = Calendar.getInstance().get(Calendar.MONTH);
    añoHoy = Calendar.getInstance().get(Calendar.YEAR);
    System.out.println("La fecha de hoy es:" + diaHoy + "/" + mesHoy + "/" + añoHoy);
    Vehiculo vehiculo3;
    Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
    Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "Seat", "León", "Negro");
    MisVehiculos.recibirVehiculoAlquilado(vehiculo2);
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
    System.out.println("Datos vehiculo2: " + vehiculo2.getAtributos());

    // Extensión de clases Composición

    Cliente cliente1 = new Cliente("20435624x", "Juna", "Pérez");
    VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);

    System.out.println("Vehiculo alquilado");
    System.out.println("Cliente: " +
            alquiler1.getCliente().getNif() + " " +
            alquiler1.getCliente().getNombre() + " " +
            alquiler1.getCliente().getApellidos());

    System.out.println("Vehiculo: " + alquiler1.getVehiculo().getMatricula());

    //polimorfismo

    //Turismo miTurismo = new Turismo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2, false);
    Deportivo miDeportivo = new Deportivo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000);
    Furgoneta miFurgoneta = new Furgoneta("4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8);

    System.out.println("Vehiculo: " + vehiculo1.getAtributos());
    //System.out.println("Turismo: " + miTurismo.getAtributos());
    System.out.println("Deportivo: " + miDeportivo.getAtributos());
    System.out.println("Furgoneta: " + miFurgoneta.getAtributos());

    //System.out.println("Turismo: " + miTurismo.getMatricula() + " " + miTurismo.getMarca() + " " + miTurismo.getModelo());

    // Conversión ascendente de tipos
    //Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
    //System.out.println("Vehiculo " + miVehiculo.getAtributos());

    Vehiculo miTurismo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);

    //Vehiculo miVehiculo = miTurismo;
    //System.out.println("Vehículo " + miVehiculo.getAtributos());

    //Conversión descendente de tipos
    Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
    Turismo miNuevoTurismo = (Turismo) miVehiculo;

    System.out.println("El valor de PI ES: " + Circulo.PI);

    Circulo miCirculo = new Circulo(10.0);

    System.out.println("El radio del circulo es " + miCirculo.getRadio() + " SU PERIMETRO ES "
                        + miCirculo.calcularPerimetro() + " y su area es " + miCirculo.calcularArea());

    //***********
    // Metodo contructor a partir de un valor de tipo simple
    Character letra = new Character('A');
    Integer numero = new Integer(10);
    System.out.println("metodos" + letra + numero);

    // Metodo constructor que recibe una cadena de texto y la traduce al tipo simple
    Integer numero1 = new Integer("100");
    System.out.println("cadena a tipo simple: " + numero1);


    //Metodo toString que transforma el valor almacenado en una cadena
    Integer numero2 = new Integer("100");
    System.out.println("a una cadena: " + numero2.toString());

    System.out.println("numero1 = numero2 " + numero2.equals(numero1));

    // La clase String
    String nombre = "Juan";
    String apellidos = "Gonzalez López";

    String mensaje = new String("Hola Mundo");

    String hola = new String("Hola");
    String espacio = new String(" ");
    String mundo = new String("Mundo");
    String holaMundo = hola + espacio + mundo;
    System.out.println(holaMundo);

    System.out.println("El texto " + holaMundo + " tiene " + holaMundo.length() + " letras.");

    // Comparar cada ñetra de dos objetos
    String nombre1 = "Angel";
    String nombre2 = "Carlos";

    System.out.println(nombre1.contentEquals(nombre2));

    String año = String.valueOf(2011);

    System.out.println("La primera letra de holamundo es " + holaMundo.charAt(0));

    // estructura de control
    //if
    int calificacion = 10;
    if (calificacion == 10)
    {
        System.out.println("Matricula de honor");

    }

    //if-else
    int numero4 = 5;
    if(numero4 % 2 == 0)
        System.out.println("El numero es par");
    else
        System.out.println("El número es impar");

    if (numero4 % 2 != 0)
        System.out.println("El numero es impar");
    else
        System.out.println("El número es par");

    // Sentencia if-else

    int calificacion1 = 4;

    if (calificacion1 == 10) {
        System.out.println("Matricula de honor");
    }
    else
    {
        if (calificacion1 == 9) {
            System.out.println("Sobresaliente");
        }
        else
        {
            if (calificacion1 == 7 || calificacion1==8) {
                System.out.println("Notable");
            }
            else
            {
                if (calificacion1 == 5) {
                    System.out.println("Aprobado");
                }
                else
                {
                    System.out.println("Suspenso");
                }

            }

        }
    }


    // if-else-if
    int calificacion2 = 2;
    if (calificacion2 == 10){
        System.out.println("Matricula de Honor");
    } else if (calificacion2 == 9) {
        System.out.println("Sobresaliente");
    } else if (calificacion2 >= 7) {
        System.out.println("Notable");
    } else if (calificacion2 == 6) {
        System.out.println("Bien");
    } else if (calificacion2 == 5) {
        System.out.println("Aprobado");
    } else {
        System.out.println("SUspenso");

    }


    // switch
    int calificacion3 = 80;
    switch (calificacion3 == 80) {
        case 1
    }

}



