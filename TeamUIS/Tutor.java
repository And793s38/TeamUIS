import java.util.*;

/**
 * Esta clasea crea los tutores con sus respectivas matertias.
 * 
 * @author TeamUis
 * @version 31/03/2020
 */

public class Tutor {
    // instance variables
    private String nombre;
    private String codigo;
    private String carrera;
    private String telefono;
    private ArrayList<Materia> materias;

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void EliminarMateria(Materia materia) {
        materias.remove(materia);
    }
    
    public Tutor() {
        // initialise instance variables
    }
    
    /**
     * Constructor for objects of class Tutor
     */
    public Tutor(String nombre, String codigo, String carrera, String telefono, Materia materia) {
        // initialise instance variables
        
        materias = new ArrayList();
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;
        materias.add(materia);
    }

    public String toString() { // metodo para convertir a string
        return "Tutor: " + nombre + ", Codigo: " + codigo + ", Carrera: " + carrera + ", Telefono: " + telefono;
    }
}
