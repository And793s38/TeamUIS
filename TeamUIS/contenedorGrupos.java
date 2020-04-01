import java.util.*;

/**
 * Write a description of class contenedorGrupos here.
 * 
 * @author TeamUis
 * @version 31/03/2020
 */
public class contenedorGrupos

{
    private ArrayList<Grupo> grupos;
    int id = 0;

    /**
     * Función: Constructor de la clase contenedorGrupos generando un ArrayList de
     * grupos
     * 
     * @param none.
     * @return none.
     */
    public contenedorGrupos() {
        grupos = new ArrayList();
    }
    
        public int getId() {
        return id;
    }

    /**
     * Función: metodo que al agregar grupos va autoincrementado su id para
     * posteriores busquedas y evitar duplicidad de grupos
     * 
     * @param none.
     * @return none.
     */
    public void agregarGrupo(Grupo grupo) {
        id = id + 1;
        grupo.setId(id);
        grupos.add(grupo);
    }

    /**
     * Función: este metodo elimina un grupo
     * 
     * @param none.
     * @return none.
     */
    public void EliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    /**
     * Función: este metodo genera un listado con todas los Grupos que estan
     * registrados, revisando en el ArrayList<Grupo>.
     * 
     * @param none.
     * @return grupos.
     */
    public ArrayList<Grupo> listarGrupos() {
        return grupos;
    }

    /**
     * Función: genera un string con todos los datos guardados.
     * 
     * @param none.
     * @return cadena de string con los objetos que estaban dentro de el contenedor
     *         de Grupos.
     */
    public void ToStringGrupos() {
        System.out.println("----------------------------");
        System.out.println("Grupos:");
        for (Grupo G : grupos) {
            System.out.println(G.toString());
        }
        System.out.println("----------------------------");
    }

    /**
     * Función: busca grupos mediante su id.
     * 
     * @param id id de un grupo.
     * @return el grupo del cual se queria encontrar.
     */
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
