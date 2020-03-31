
import java.util.*;

/**
 * Esta clase crea y gestiona los diferentes grupos de estudio.
 * 
 * @author TeamUis
 * @version (a version number or a date)
 */

public class Grupo {
    // instance variables - replace the example below with your own
    private ArrayList<Estudiante> estudiantes;
    private Tutor tutor;
    private Materia materia;
    private String detalles;
    private int id;

    /* getters y setters */
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
     * Constructor grupo vacío para busquedas
     */
    public Grupo() {
    }

    /**
     * Constructor para crear grupo con tutor
     */

    public Grupo(Estudiante estudiante, Tutor tutor, Materia materia, String detalles) {
        // initialise instance variables
        estudiantes = new ArrayList();
        estudiantes.add(estudiante);
        this.materia = materia;
        this.tutor = tutor;
        this.detalles = detalles;
    }

    /**
     * Constructor para crear grupo con solo estudiantes
     */
    public Grupo(Estudiante estudiante, Materia materia, String detalles) {
        // initialise instance variables
        estudiantes = new ArrayList();
        estudiantes.add(estudiante);
        this.materia = materia;
        this.detalles = detalles;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public void listarIntegrantesGrupo() {
        System.out.println("----------------------------");
        System.out.println("Grupo: " + this.id + " Materia: " + this.materia.getNombre());
        System.out.println("Integrantes:");
        if (tutor == null) {
            System.out.println("Grupo de solo estudiantes");
        } else {
            System.out.println("El tutor de este grupo es:");
            System.out.print(tutor.toString());
        }
        for (Estudiante E : estudiantes) {
            System.out.println(E.toString());
        }
        System.out.println("----------------------------");
    }

    public String toString() { // metodo para convertir a string
        if (this.tutor == null) {
            return "Codigo: " + this.id + ", Materia: " + this.materia.getNombre() + "\n Detalles: " + detalles;
        } else {
            return "Codigo: " + this.id + ", Materia: " + this.materia.getNombre() + ", Tutor: "
                    + this.tutor.getNombre() + "\n Detalles: " + detalles;
        }
    }

}