
import java.util.*;

/**
 * Esta clase crea y gestiona los diferentes grupos de estudio.
 * 
 * @author (teamUIs)
 * @version (a version number or a date)
 */

public class Grupo {
    // instance variables - replace the example below with your own
    private ArrayList<Estudiante> estudiantes;
    Estudiante estudiante;
    private Tutor tutor;
    private Materia materia;
    private String detalles;

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    
    
    /**
     * Constructor for objects of class Grupo
     */

    public Grupo(ArrayList<Estudiante> estudiantes, Tutor tutor, String detalles) {
        // initialise instance variables
        this.estudiantes = estudiantes;
        this.tutor = tutor;
        this.detalles = detalles;
    }

    public Grupo(ArrayList<Estudiante> estudiantes, Materia materia, String detalles) {
        // initialise instance variables
        this.estudiantes = estudiantes;
        this.materia = materia;
        this.detalles = detalles;
    }
}