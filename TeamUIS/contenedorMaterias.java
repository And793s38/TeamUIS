import java.util.*;

/**
 * Write a description of class contenedorGrupos here.
 * 
 * @author TeamUis
 * @version (a version number or a date)
 */
public class contenedorMaterias

{
    private ArrayList<Materia> materias;
    int id = 0;

    /**
     * Constructor for objects of class contenedorGrupos
     */
    public contenedorMaterias() {
        // initialise instance variables
        materias = new ArrayList();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */

    public void agregarMateria(Materia materia) {
        id = id + 1;
        materia.setId(id);
        materias.add(materia);
    }

    public void EliminarMateria(Materia materia) {
        materias.remove(materia);
    }

    public ArrayList<Materia> listarMaterias() {
        return materias;
    }

    public void ToStringMaterias() {
        System.out.println("----------------------------");
        System.out.println("Materias:");
        for (Materia G : materias) {
            System.out.println(G.toString());
        }
        System.out.println("----------------------------");
    }

    public Materia buscarMateria(int idb) {
        Materia busqueda = new Materia();
        for (Materia G : materias) {
            if (G.getId() == idb) {
                busqueda = G;
            }
        }
        return busqueda;
    }

}
