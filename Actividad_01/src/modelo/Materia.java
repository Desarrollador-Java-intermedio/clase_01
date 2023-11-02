package modelo;

public class Materia {

    private String nombre;
    private int correlativas;

    public Materia() {
    }

    public Materia(String nombre, int correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(int correlativas) {
        this.correlativas = correlativas;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", correlativas=" + correlativas + '}';
    }

   

    
}
