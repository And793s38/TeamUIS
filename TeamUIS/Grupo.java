
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
    Estudiante estudiante;
    private Tutor tutor;
    private Materia materia;
    private String detalles;
    
    /*getters y setters */
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
     * Constructor para crear grupo con tutor
     */

    public Grupo(Estudiante estudiante, Tutor tutor, String detalles) {
        // initialise instance variables
        estudiantes = new ArrayList();
        estudiantes.add(estudiante);
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
    
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    public void eliminarEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }
    
    public void listarIntegrantesGrupo(){
    System.out.println("Integrantes:");
    for(Estudiante E: estudiantes){
        System.out.println(E.toString());
    }
    if(tutor == null){
        System.out.println("Grupo de solo estudiantes");
    }else{
        System.out.println("El tutor de este grupo es:");
        System.out.println(tutor.toString());

    }
    
    }
}