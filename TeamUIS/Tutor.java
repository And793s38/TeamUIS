/**
 * Esta clasea crea los tutores con sus respectivas matertias.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Tutor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String codigo;
    private String carrera;
    private String telefono;
    private Materia materia;

    /**
     * Constructor for objects of class Tutor
     */


public Tutor(String nombre, String codigo, String carrera, String telefono, Materia materia)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.telefono = telefono;
        this.materia = materia;
        
    }
}
