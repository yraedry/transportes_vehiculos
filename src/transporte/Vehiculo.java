package src.transporte;

/**
 * Clase abstracta necesario para el uso de la clase.
 */
public abstract class Vehiculo {
    //Atributos
    private int velocidadMaxima;

    /**
     * Constructor por defecto.
     */
    public Vehiculo(){}

    /**
     * Constructor con parametros.
     * @param velocidadMaxima Velocidad maxima del vehículo en km/h.
     */
    public Vehiculo(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    /**
     * Metodo necesario para el uso de la clase abstracta.
     */
    public void arrancar() {
        System.out.println("El vehículo está en marcha.");
    }
    /**
     * Metodo abstracto describir, que cada subclase deberá implementar.
     * el metodo describir es una implementación de la clase abstracta Vehiculo. por lo que
     * hay que sobreescribir el metodo describir de la clase abstracta.
     */
    public abstract void describir();

    //getter y setter
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
