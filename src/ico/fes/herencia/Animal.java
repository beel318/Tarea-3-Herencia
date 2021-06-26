package ico.fes.herencia;

public class Animal {
    private int numeroPatas;
    private String clasificacion;
    private boolean pelaje;
    private boolean domestico;

    public Animal() {
    }

    public Animal(int numeroPatas, String tipo, boolean pelaje, boolean domestico) {
        this.numeroPatas = numeroPatas;
        this.clasificacion = tipo;
        this.pelaje = pelaje;
        this.domestico = domestico;
    }

    public boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String tipo) {
        this.clasificacion = tipo;
    }

    public boolean getPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", clasificacion=" + clasificacion + ", pelaje=" + pelaje + ", domestico=" + domestico + '}';
    }
    
    public void emitirSonido(){
       System.out.println("Emitiendo sonido");
    }
}
