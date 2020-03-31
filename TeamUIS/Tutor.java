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
    private Materia materia;

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

    /** 
     * Función: inicializar el objeto Tutor.
     * 
     * @param nombre del Tutor, codigo del tutor, carrera a la cual pertence, 
     * numero de telefono para poder relizar un contacto en caso de ser necesario y una Materia la cual el va dar tutorias.
     * @return none.
     */
    public Tutor(String nombre, String codigo, String carrera, String telefono, Materia materia) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;
        this.materia = materia;
    }

    /** 
     * Función: genera un string con todos los datos guardados.
     * 
     * @param none.
     * @return cadena de string con los datos que estaban dentro de el objeto.
     */
    public String toString() { 
        return "Tutor: " + nombre + ", Codigo: " + codigo + ", Carrera: " + carrera + ", Telefono: " + telefono
                + ", Materia: " + materia.getNombre() + "\n ";
    }
}
