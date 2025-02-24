package src.transporte;
/**
 * Clase Bicicleta, que hereda de Vehiculo y implementa ConMotor.
 */
public final class Bicicleta extends Vehiculo implements SinMotor{

    /**
     * Metodo usarFuerzaHumana, que imprime "Usando fuerza humana para mover la bicicleta."
     * el metodo usarFuerzaHumana es una implementación de la interfaz SinMotor. por lo que
     * hay que sobreescribir el metodo de la interfaz SinMotor.
     */
    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }

    /**
     * Metodo describir, que imprime "Soy una bicicleta con una velocidad máxima de 30 km/h."
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el metodo describir de la clase abstracta.
     */
    @Override
    public void describir() {
        System.out.println("Soy una bicicleta con una velocidad máxima de 30 km/h.");
    }
}
