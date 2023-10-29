package modelo;

import java.util.List;

public class Alumno {
     private Long idAlumno;
    private String apellido;
    List <Inscripcion> inscrpciones;

    public Alumno() {
    }

    public Alumno(Long idAlumno, String apellido, List<Inscripcion> inscrpciones) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.inscrpciones = inscrpciones;
    }

    

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Inscripcion> getInscrpciones() {
        return inscrpciones;
    }

    public void setInscrpciones(List<Inscripcion> inscrpciones) {
        this.inscrpciones = inscrpciones;
    }

    @Override
    public String toString() {
        return "Materia{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", inscrpciones=" + inscrpciones + '}';
    }
}
