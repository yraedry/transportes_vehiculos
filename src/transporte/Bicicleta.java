package src.transporte;
/**
 * Clase Bicicleta, que hereda de Vehiculo y implementa ConMotor.
 */
public class Bicicleta extends Vehiculo implements SinMotor{
    public Bicicleta (int velocidadMaxima) {
        super(velocidadMaxima);
    }
    /**
     * Método usarFuerzaHumana, que imprime "Usando fuerza humana para mover la bicicleta."
     * el metodo usarFuerzaHumana es una implementación de la interfaz SinMotor. por lo que
     * hay que sobreescribir el método de la interfaz SinMotor.
     */

    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicileta.");
    }


    /**
     * Método describir, que imprime "Soy una bicicleta con una velocidad máxima de 30 km/h."
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el método describir de la clase abstracta.
     */

    @Override
    public void describir() {
        System.out.println("Soy una bicicleta con una velocidad máxima de " + velocidadMaxima + " km/h.");
    }

}
