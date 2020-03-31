/**
 * Esta clase crea las materias requeridas por los estudiantes.
 *
 * @author TeamUis
 * @version 31/03/2020
 */

public class Materia {
    // instance variables 
    private String nombre;
    private String codigo;
    private int id;
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Constructor de la clase Materia para busquedas.
     */

    public Materia(){
        
    }
      
    /** 
     * Función: inicializar el objeto Materia.
     * 
     * @param nombre de una materia y codigo de esta misma.
     * @return none.
     */
    public Materia(String nombre, String codigo) {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    /** 
     * Función: genera un string con todos los datos guardados.
     * 
     * @param none.
     * @return cadena de string con los datos que estaban dentro de el objeto.
     */
    public String toString() {
        return "Id: " + id + "Nombre: " + nombre + ", Codigo: " + codigo + "\n ";
    }
}
