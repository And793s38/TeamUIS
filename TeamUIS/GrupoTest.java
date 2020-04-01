import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class GrupoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GrupoTest
{
    /**
     * Default constructor for test class GrupoTest
     */
    public GrupoTest()
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
    public void listaEstudiantesSinTutor(){
        Materia Software1 = new Materia("Software", "3333");
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Juan", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 = new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");
        
        ArrayList<Estudiante> estudiantesp = new ArrayList();
        estudiantesp.add(estudiante1);
        estudiantesp.add(estudiante2);
        estudiantesp.add(estudiante3);

        
        Grupo grupo1 = new Grupo(estudiante1, Software1, "centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        assertEquals(estudiantesp, grupo1.listaEstudiantes());
        
        grupo1.eliminarEstudiante(estudiante1);
        estudiantesp.remove(estudiante1);
        
        assertEquals(estudiantesp, grupo1.listaEstudiantes());
    }
    
    @Test
    public void listaEstudiantesConTutor(){
        Materia Software1 = new Materia("Software", "3333");
        
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Brain Jose", "216003", "ing. Petroleos", "312212122");
        
        Tutor tutor1 = new Tutor("Jair Panqueva", "1001", "Ing. Sistemas", "304312121", Software1);
        
        ArrayList<Estudiante> estudiantesp = new ArrayList();
        estudiantesp.add(estudiante1);
        estudiantesp.add(estudiante2);
        estudiantesp.add(estudiante3);

        
        Grupo grupo1 = new Grupo(estudiante1, tutor1, Software1, "centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        assertEquals(estudiantesp, grupo1.listaEstudiantes());
        
        grupo1.eliminarEstudiante(estudiante1);        
        estudiantesp.remove(estudiante1);
        
        assertEquals(estudiantesp, grupo1.listaEstudiantes());
    }    
}
