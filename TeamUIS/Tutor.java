/**
 * Esta clasea crea los tutores con sus respectivas matertias.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tutor {
    // instance variables - replace the example below with your own
    private String nombre;
    private String codigo;
    private String carrera;
    private String telefono;

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
     * Constructor for objects of class Tutor
     */

    public Tutor(String nombre, String codigo, String carrera, String telefono, Materia materia) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;

    }
}
