package src.transporte;

/**
 * Clase Barco, que hereda de Vehiculo y implementa ConMotor.
 */
public final class Barco extends Vehiculo implements ConMotor {
    /**
     * Metodo encenderMotor, que imprime "El motor del barco está encendido."
     * el metodo encenderMotor es una implementación de la interfaz ConMotor. por lo que
     * hay que sobreescribir el metodo de la interfaz ConMotor.
     */
    @Override
    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }

    /**
     * Metodo describir, que imprime "Soy un barco que navega a 50 km/h."
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el metodo describir de la clase abstracta.
     */
    @Override
    public void describir() {
        System.out.println("Soy un barco que navega a 50 km/h.");
    }
}
