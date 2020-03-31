import java.util.*;
/**
 * Esta clase crea y gestiona los diferentes grupos de estudio, a.
 * 
 * @author TeamUis
 * @version 31/03/2020
 */

public class Grupo {
    // instance variables 
    private ArrayList<Estudiante> estudiantes;
    private Tutor tutor;
    private Materia materia;
    private String detalles;
    private int id;

    /**
     * Getters y setters 
     */
    
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
     * Función: este metodo se empleara en los contenedores para guardar una busqeuda.
     * 
     * @param none.
     * @return none.
     */
    public Grupo() {
    }

    /** 
     * Función: inicializar el objeto Grupo con un estudiante y un tutor.
     * 
     * @param nombre del Estudiante que quiere generar el grupo, Tutor que da tutorias de la materia para el grupo, 
     * Materia de la cual se solicita el tutor y detalles que va a ser el lugar de encuentro para la tutoria.
     * @return none.
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
     * Función: inicializar el objeto Grupo con solo estudiantes.
     * 
     * @param nombre del Estudiante que quiere generar el grupo, 
     * @param Materia de la cual se solicita el tutor 
     * @param detalles este va a ser el lugar de encuentro para la tutoria, una breve descripcion para ubicarlo de 
     * manera facil.
     * @return none.
     */
    public Grupo(Estudiante estudiante, Materia materia, String detalles) {
        // initialise instance variables
        estudiantes = new ArrayList();
        estudiantes.add(estudiante);
        this.materia = materia;
        this.detalles = detalles;
    }

    /** 
     * Función: por medio de este metodo se van a agregar mas estudiantes de un grupo de estudio que ya cuente con tutor o no.
     * 
     * @param estudiante estudiante que se quiere incluir al grupo de estudio.
     * @return none.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /** 
     * Función: por medio de este metodo se van a elimianr los estudiantes que  pertencen a un grupo de estudio.
     * 
     * @param Objeto del estudiante que se quiere incluir al grupo de estudio.
     * @return none.
     */
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    /** 
     * Función: por medio de este metodo se van a listar los grupos de estudio con todos sus instegrantes y tutores.
     * 
     * @param none.
     * @return none.
     */
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

    /** 
     * Función: genera un string con todos los datos guardados.
     * 
     * @param none.
     * @return cadena de string con los datos que estaban dentro de el objeto.
     */
    public String toString() {
        if (this.tutor == null) {
            return "Codigo: " + this.id + ", Materia: " + this.materia.getNombre() + "\n Detalles: " + detalles;
        } else {
            return "Codigo: " + this.id + ", Materia: " + this.materia.getNombre() + ", Tutor: "
                    + this.tutor.getNombre() + "\n Detalles: " + detalles;
        }
    }

}