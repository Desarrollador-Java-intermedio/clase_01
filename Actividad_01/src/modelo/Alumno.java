package modelo;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private String apellido;
    List<Materia> materiasAprobadas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
    
}
