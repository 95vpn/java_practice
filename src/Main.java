//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
    Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "Seat", "León", "Negro", 80.0);

    System.out.println(vehiculo1.color);
    System.out.println("Matricula: " + vehiculo1.matricula);
    System.out.println("Marca y modelo: " + vehiculo1.marca + " " + vehiculo1.modelo);
    System.out.println("color: " + vehiculo1.color);
    System.out.println("Tarifa: " + vehiculo1.tarifa);


    vehiculo1.setTarifa(90.0);
    System.out.println("Matricula: " + vehiculo1.getMatricula());
    System.out.println("Tarifa: " + vehiculo1.getTarifa());

}
