import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class contenedorMateriasTest.
 *
 * @author TeamUis
 * @version 31/03/2020
 */
public class contenedorMateriasTest
{
    /**
     * Default constructor for test class contenedorMateriasTest
     */
    public contenedorMateriasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void listadoMaterias(){
        Materia Ingles1 = new Materia("Ingles1", "4444");
        Materia Software1 = new Materia("Software", "3333");
        Materia Bases1 = new Materia("Bases1", "2222");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        ArrayList<Materia> materiasp = new ArrayList();
        materiasp.add(Ingles1);
        materiasp.add(Software1);
        materiasp.add(Bases1);
        materiasp.add(Calculo1);
        
        contenedorMaterias contenedorM = new contenedorMaterias();
        contenedorM.agregarMateria(Ingles1);
        contenedorM.agregarMateria(Software1);
        contenedorM.agregarMateria(Bases1);
        contenedorM.agregarMateria(Calculo1);
        
        assertEquals(materiasp, contenedorM.listarMaterias());
        
        
        contenedorM.EliminarMateria(Ingles1);
        materiasp.remove(Ingles1);
        
        assertEquals(materiasp, contenedorM.listarMaterias());
    }
    
    @Test
    public void buscarMaterias(){
        Materia Ingles1 = new Materia("Ingles1", "4444");
        Materia Software1 = new Materia("Software", "3333");
        Materia Bases1 = new Materia("Bases1", "2222");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        ArrayList<Materia> materiasp = new ArrayList();
        materiasp.add(Ingles1);
        materiasp.add(Software1);
        materiasp.add(Bases1);
        materiasp.add(Calculo1);
        
        contenedorMaterias contenedorM = new contenedorMaterias();
        contenedorM.agregarMateria(Ingles1);
        contenedorM.agregarMateria(Software1);
        contenedorM.agregarMateria(Bases1);
        contenedorM.agregarMateria(Calculo1);
        
        assertEquals(Ingles1, contenedorM.buscarMateria(1));
        assertEquals(Software1, contenedorM.buscarMateria(2));
        assertEquals(Bases1, contenedorM.buscarMateria(3));
        assertEquals(Calculo1, contenedorM.buscarMateria(4));
    }
}
