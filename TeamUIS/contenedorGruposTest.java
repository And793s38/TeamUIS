import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class contenedorGruposTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class contenedorGruposTest
{
    /**
     * Default constructor for test class contenedorGruposTest
     */
    public contenedorGruposTest()
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
    public void listarGrupoSinTutor(){
        Materia Software1 = new Materia("Software", "3333");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Juan", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 = new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");
        
        Grupo grupo1 = new Grupo(estudiante1, Software1, "centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        Grupo grupo2 = new Grupo(estudiante1, Calculo1, "centro de estudios de sistemas");
        grupo2.agregarEstudiante(estudiante4);
        
        ArrayList<Grupo> gruposp = new ArrayList();
        gruposp.add(grupo1);
        gruposp.add(grupo2);
        
        contenedorGrupos contenedorG = new contenedorGrupos();
        contenedorG.agregarGrupo(grupo1);
        contenedorG.agregarGrupo(grupo2);
        
        assertEquals(gruposp, contenedorG.listarGrupos());
        
        contenedorG.EliminarGrupo(grupo1);
        gruposp.remove(grupo1);
        
        assertEquals(gruposp, contenedorG.listarGrupos());

    }
    
    @Test
    public void listarGrupoConTutor(){
        Materia Software1 = new Materia("Software", "3333");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Juan", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 = new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");
        
        Tutor tutor1 = new Tutor("Jair Panqueva", "1001", "Ing. Sistemas", "304312121", Software1);
        Tutor tutor2 = new Tutor("Edinson Jose", "1002", "Ing. Electrica", "304312121", Calculo1);
        
        Grupo grupo1 = new Grupo(estudiante1,  tutor1, Software1,"centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        Grupo grupo2 = new Grupo(estudiante1, tutor2, Calculo1,"centro de estudios de sistemas");
        grupo2.agregarEstudiante(estudiante4);
        
        ArrayList<Grupo> gruposp = new ArrayList();
        gruposp.add(grupo1);
        gruposp.add(grupo2);
        
        contenedorGrupos contenedorG = new contenedorGrupos();
        contenedorG.agregarGrupo(grupo1);
        contenedorG.agregarGrupo(grupo2);
        
        assertEquals(gruposp, contenedorG.listarGrupos());
        
        contenedorG.EliminarGrupo(grupo1);
        gruposp.remove(grupo1);
        
        assertEquals(gruposp, contenedorG.listarGrupos());

    }
    
    @Test
    public void buscarGrupo(){
        Materia Software1 = new Materia("Software", "3333");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Juan", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 = new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");
        
        Tutor tutor1 = new Tutor("Jair Panqueva", "1001", "Ing. Sistemas", "304312121", Software1);
        Tutor tutor2 = new Tutor("Edinson Jose", "1002", "Ing. Electrica", "304312121", Calculo1);
        
        Grupo grupo1 = new Grupo(estudiante1,  tutor1, Software1,"centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        Grupo grupo2 = new Grupo(estudiante1, tutor2, Calculo1,"centro de estudios de sistemas");
        grupo2.agregarEstudiante(estudiante4);
        
        ArrayList<Grupo> gruposp = new ArrayList();
        gruposp.add(grupo1);
        gruposp.add(grupo2);
        
        contenedorGrupos contenedorG = new contenedorGrupos();
        contenedorG.agregarGrupo(grupo1);
        contenedorG.agregarGrupo(grupo2);
        
        assertEquals(grupo1, contenedorG.buscarGrupo(1));
        assertEquals(grupo2, contenedorG.buscarGrupo(2));

    }
    
}
