/**
 * Esta clase crea y guarda información sobre los estudiantes.
 *
 * @author TeamUis
 * @version (a version number or a date)
 */

public class Estudiante {
    // instance variables
    private String nombre;
    private String codigo;
    private String carrera;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre, String codigo, String carrera, String telefono) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;
    }

    public String toString() { // metodo para convertir a string
        return "Estudiante: " + nombre + ", Codigo: " + codigo + ", " + carrera + ", " + telefono;
    }
}
