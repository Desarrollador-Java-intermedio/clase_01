package modelo;

import javax.swing.JOptionPane;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private Boolean aprobada;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.aprobada = false;
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

    public void estaAprobada() {
        final boolean totalCorrelativas = materia.getCorrelativas() == 0;
        final boolean comparacionAprobadasCorrelativas = materia.getCorrelativas() == alumno.getMateriasAprobadas().size();

        if (totalCorrelativas || comparacionAprobadasCorrelativas) {
            this.setAprobada(true);
        }
    }

    public void imprimirCartelito() {
        if (aprobada) {
            System.out.println("Inscripcion Aprobada");
        }else{
            System.out.println("Inscripcion Rechazada");
        }
    }
}
