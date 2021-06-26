package ico.fes.herencia;

import java.awt.Color;

public class Perro extends Animal {

    private String raza;
    private Color color;
    private String tamanio;
    private int anios;

    public Perro() {
    }

    public Perro(String raza, Color color, String tamanio, int anios) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.anios = anios;
    }

    public Perro(String raza, Color color, String tamanio, int anios, int numeroPatas, String clasificacion, boolean pelaje, boolean domestico) {
        super(numeroPatas, clasificacion, pelaje, domestico);
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", anios=" + anios + '}';
    }

    @Override
    public void emitirSonido() {
        System.out.println("Wuaw - Ladrar");
        super.emitirSonido();
    }
}
