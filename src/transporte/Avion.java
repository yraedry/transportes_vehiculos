package src.transporte;

/**
 * Clase Avion, que hereda de Vehiculo y implementa ConMotor.
 */
public final class Avion extends Vehiculo implements ConMotor {

    public Avion(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    /**
     * Metodo encenderMotor, que imprime "El motor del avión está encendido."
     * el metodo encenderMotor es una implementación de la interfaz ConMotor. por lo que
     * hay que sobreescribir el metodo de la interfaz ConMotor.
     */

     @Override
        public void encenderMotor() {
            System.out.println("El motor del avión está encendido.");
        }

    /**
     * Metodo describir, que imprime "Soy un avión que vuela a 900 km/h."
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el metodo describir de la clase abstracta.
     */
    @Override
    public void describir() {
        System.out.println("Soy un avión que vuela a " + velocidadMaxima + " km/h.");
    }
    
}
