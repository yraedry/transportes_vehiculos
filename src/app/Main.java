package src.app;

import src.transporte.*;

public class Main {

    public static void main(String[] args) {
        //Creacion del objeto coche
        Coche coche = new Coche();
        coche.arrancar();
        coche.encenderMotor();
        coche.describir();

        //Creacion del objeto bicicleta
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.arrancar();
        bicicleta.usarFuerzaHumana();
        bicicleta.describir();

        //Creacion del objeto barco
        Barco barco = new Barco();
        barco.arrancar();
        barco.encenderMotor();
        barco.describir();

        //Creacion del objeto avion
        Avion avion = new Avion();
        avion.arrancar();
        avion.encenderMotor();
        avion.describir();
    }
}
