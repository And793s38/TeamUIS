/**
 * Esta clase crea y guarda información sobre los estudiantes.
 *
 * @author TeamUis
 * @version 31/03/2020
 */

public class Estudiante {
    // instance variables
    private String nombre;
    private String codigo;
    private String carrera;
    private String telefono;

    /**
     * Getters y setters
     */
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

    public Estudiante() {
        // initialise instance variables
    }
    
    /**
     * Función: inicializar el objeto Estudiante.
     * 
     * @param nombre del Estudiante, codigo del Estudiante, carrera a la cual
     *               pertence, numero de telefono para poder relizar un contacto en
     *               caso de ser necesario.
     * @return none.
     */
    public Estudiante(String nombre, String codigo, String carrera, String telefono) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;
    }

    /**
     * Función: genera un string con todos los datos guardados.
     * 
     * @param none.
     * @return cadena de string con los datos que estaban dentro de el objeto.
     */
    public String toString() {
        return "Estudiante: " + nombre + ", Codigo: " + codigo + ", Carrera: " + carrera + ", Telefono: " + telefono;
    }
}
