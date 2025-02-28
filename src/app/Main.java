package src.app;

import src.transporte.Coche;
import src.transporte.Avion;
import src.transporte.Barco;
import src.transporte.Bicicleta;

public class Main {

    public static void main(String[] args) {
    
        //Creacion del objeto coche
        Coche coche = new Coche(180);
        coche.encenderMotor();
        coche.arrancar();
        coche.describir();

        //Creacion del objeto bicicleta
        Bicicleta bicicleta = new Bicicleta(30);
        bicicleta.usarFuerzaHumana();
        bicicleta.arrancar();
        bicicleta.describir();

        
        //Creacion del objeto barco
        Barco barco = new Barco(50);
        barco.encenderMotor();
        barco.arrancar();
        barco.describir();

        //Creacion del objeto avion
        Avion avion = new Avion(900);
        avion.encenderMotor(); 
        avion.arrancar();
        avion.describir();
    }
}
