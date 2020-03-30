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
    

    /**
     * Constructor for objects of class contenedorGrupos
     */
    public contenedorGrupos()
    {
        // initialise instance variables
        grupos= new ArrayList();
   
        
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void agregarGrupo(Grupo grupo)
    {
        grupos.add(grupo); 
    }
    
    public void EliminarGrupo(Grupo grupo)
    {
        grupos.remove(grupo); 
    }
    
    public void listarGrupos(){
    for(Grupo g : grupos){
        g.listarIntegrantesGrupo();
    }
    }
}
