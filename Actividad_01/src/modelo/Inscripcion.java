
package modelo;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private Boolean aprobada;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, Boolean aprobada) {
        this.alumno = alumno;
        this.materia = materia;
        this.aprobada = aprobada;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "alumno=" + alumno + ", materia=" + materia + ", aprobada=" + aprobada + '}';
    }
    
    
}
