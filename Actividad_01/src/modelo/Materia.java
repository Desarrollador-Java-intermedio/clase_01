
package modelo;

import java.util.List;

public class Materia {
   private Long idMateria;
    private List<Materia> correlativas;

    public Materia() {
    }

    public Materia(Long idMateria, List<Materia> correlativas) {
        this.idMateria = idMateria;
        this.correlativas = correlativas;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", correlativas=" + correlativas + '}';
    }
    
    
    }
