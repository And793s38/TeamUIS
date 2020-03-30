/**
 * Esta clase crea las materias requeridas por los estudiantes.
 *
 * @author (TeamUis)
 * @version (a version number or a date)
 */

public class Materia {
    // instance variables - replace the example below with your own
    private String nombre;
    private String codigo;

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

    /**
     * Constructor for objects of class Materia
     */

    public Materia(String nombre, String codigo) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String toString(){
    return nombre+ ", " + codigo+ "\n ";
    }
}
