package herencia;

import ico.fes.herencia.Gato;
import ico.fes.herencia.Perro;
import java.awt.Color;

public class Herencia {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Labrador", Color.white, "Grande", 5, 4, "Canino", true, true);
        System.out.println(perro1);
        perro1.emitirSonido();
        
        
        Gato gatito = new Gato("Angora", Color.gray, "Agresivo", 2, 4, "Felino", true, true);
        System.out.println(gatito);
        gatito.emitirSonido();
    }

}
