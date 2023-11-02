
package principal;

import modelo.Alumno;
import modelo.Inscripcion;
import modelo.Materia;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Creando  alumnos
         */
        
        Alumno alumno = new Alumno("Marcelo","Peralta" );
        Alumno alumna = new Alumno("Silvia","Quinteros");
        
        /**
         * Creando materias
         */
        
        Materia mateUno = new Materia("Matematica 1", 0);
        Materia mateDos = new Materia("Matematica 2", 1);
        Materia mateTres = new Materia("Matematica 3", 2);
        /**
         * Cargando Corelativas
         */
             
        /**
         * Cargando materias aprobadas - Alumna
         */
       alumna.agregarMateria(mateUno);
       alumna.agregarMateria(mateDos);
     
        
        /**
         *  Creando Dos Inscripcion
         * Caso 1 - Inscrpcion de Materia sin correlativa
         * Caso 2 - Inscrpcion de Materia con correlativa
         */
       Inscripcion inscripcion1 = new Inscripcion(alumno, mateUno);
       inscripcion1.estaAprobada();
       inscripcion1.imprimirCartelito();
       
       Inscripcion inscripcion2 = new Inscripcion(alumna, mateDos);
       inscripcion2.estaAprobada();
       inscripcion2.imprimirCartelito();
       
       /**
        * Modifico La materia de la Inscripcion 2
        */
        
       inscripcion2.setMateria(mateTres);
       inscripcion2.estaAprobada();
       inscripcion2.imprimirCartelito();
    }
    
}
