package src.transporte;

/**
 * Clase Coche, que hereda de Vehiculo y implementa ConMotor.
 */
public final class Coche extends Vehiculo implements ConMotor {

    /**
     * TODO
     * Metodo encenderMotor, que imprime "El motor del coche está encendido."
     * el metodo encenderMotor es una implementación de la interfaz ConMotor. por lo que
     * hay que sobreescribir el metodo de la interfaz ConMotor.
     */
    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }   

    /**
     * TODO
     * Metodo describir, que imprime "Soy un coche que puede alcanzar 180 km/h."
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el metodo describir de la clase abstracta.
     */
    @Override
    public void describir() {
        System.out.println("Soy un coche que puede alcanzar 180 km/h.");
    }
}
