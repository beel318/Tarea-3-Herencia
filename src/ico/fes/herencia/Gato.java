package ico.fes.herencia;

import java.awt.Color;

public class Gato extends Animal{
    
    private String raza;
    private Color color;
    private String comportamiento;
    private int anios;

    public Gato() {
    }

    public Gato(String raza, Color color, String comportamiento, int anios) {
        this.raza = raza;
        this.color = color;
        this.comportamiento = comportamiento;
        this.anios = anios;
    }

    public Gato(String raza, Color color, String comportamiento, int anios, int numeroPatas, String clasificacion, boolean pelaje, boolean domestico) {
        super(numeroPatas, clasificacion, pelaje, domestico);
        this.raza = raza;
        this.color = color;
        this.comportamiento = comportamiento;
        this.anios = anios;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", color=" + color + ", comportamiento=" + comportamiento + ", anios=" + anios + '}';
    }
    
    @Override
    public void emitirSonido() {
        System.out.println("Miau - Maullar");
        super.emitirSonido();
    }
}
