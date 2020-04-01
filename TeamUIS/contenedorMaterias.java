import java.util.*;

/**
 * Este contenedor aguarda las materias.
 * 
 * @author TeamUis
 * @version 31/03/2020
 */
public class contenedorMaterias

{
    private ArrayList<Materia> materias;
    int id = 0;

    /**
     * Función: Constructor de contenedorMaterias.
     * 
     * @param none.
     * @return none.
     */
    public contenedorMaterias() {
        // initialise instance variables
        materias = new ArrayList();
    }

    /**
     * Función: metodo que al agregar materias va autoincrementado su id para
     * posteriores busquedas y evitar duplicidad de materrias.
     * 
     * @param none.
     * @return none.
     */

    public void agregarMateria(Materia materia) {
        id = id + 1;
        materia.setId(id);
        materias.add(materia);
    }

    /**
     * Función: este metodo elimina una Materia de ArrayList<Materia>
     * 
     * @param none.
     * @return none.
     */
    public void EliminarMateria(Materia materia) {
        materias.remove(materia);
    }

    
    public int getId() {
        return id;
    }
    
    /**
     * Función: este metodo genera un listado con todas las Materias que estan
     * registradas.
     * 
     * @param none.
     * @return materias.
     */
    public ArrayList<Materia> listarMaterias() {
        return materias;
    }

    /**
     * Función: genera un string con todos los datos guardados que estaban dentro de
     * el contenedor de Materia.
     * 
     * @param none.
     * @return none.
     */
    public void ToStringMaterias() {
        System.out.println("----------------------------");
        System.out.println("Materias:");
        for (Materia G : materias) {
            System.out.println(G.toString());
        }
        System.out.println("----------------------------");
    }

    /**
     * Función: busca materias mediante su id, este se revisa en el ArrayList de
     * Materias para confirmar que existe.
     * 
     * @param id id de una materia.
     * @return busqueda.
     */
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
