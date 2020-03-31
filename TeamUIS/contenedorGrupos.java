import java.util.*;

/**
 * Write a description of class contenedorGrupos here.
 * 
 * @author TeamUis
 * @version (a version number or a date)
 */
public class contenedorGrupos

{
    private ArrayList<Grupo> grupos;
    int id = 0;

    /**
     * Constructor for objects of class contenedorGrupos
     */
    public contenedorGrupos() {
        // initialise instance variables
        grupos = new ArrayList();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */

    public void agregarGrupo(Grupo grupo) {
        id = id + 1;
        grupo.setId(id);
        grupos.add(grupo);
    }

    public void EliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    public ArrayList<Grupo> listarGrupos() {
        return grupos;
    }

    public void ToStringGrupos() {
        System.out.println("----------------------------");
        System.out.println("Grupos:");
        for (Grupo G : grupos) {
            System.out.println(G.toString());
        }
        System.out.println("----------------------------");
    }

    public Grupo buscarGrupo(int idb) {
        Grupo busqueda = new Grupo();
        for (Grupo g : grupos) {
            if (g.getId() == idb) {
                busqueda = g;
            }
        }
        return busqueda;
    }

}
