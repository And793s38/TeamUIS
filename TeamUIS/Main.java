/**
 * Write a description of class Main here.
 * 
 * @author TeamUis
 * @version (a version number or a date)
 */
public class Main {
    // instance variables - replace the example below with your own
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //crear la materias
        Materia Ingles1 = new Materia("Ingles1", "4444");
        Materia Software1 = new Materia("Software", "3333");
        Materia Bases1 = new Materia("Bases1", "2222");
        Materia Calculo1 = new Materia("Calculo1", "1111");
        
        //crear los tutores
        Tutor tutor1 = new Tutor("Jair Panqueva", "1001", "Ing. Sistemas", "304312121", Software1);
        Tutor tutor2 = new Tutor("Edinson Jose", "1002", "Ing. Electrica", "304312121", Ingles1);
        Tutor tutor3 = new Tutor("Mauren Maria", "1003", "Ing. Metalurgica", "304312121", Calculo1);
        Tutor tutor4 = new Tutor("Juliana Mantilla", "1004", "Ing. Sistemas", "304312121", Bases1);
        
        //crear los estudiantes 
        Estudiante estudiante1 =new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 =new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 =new Estudiante("Brain Jose", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 =new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");
        
        //crear los grupos
        //crear grupo con tutor y agregar estudiantes:
        Grupo grupo1 = new Grupo(estudiante1, tutor1, "centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante4);
        
        //crear grupo sin tutor y agregar estudiantes:
        Grupo grupo2 = new Grupo(estudiante1, Ingles1, "centro de estudios de sistemas");
        grupo2.agregarEstudiante(estudiante2);
        grupo2.agregarEstudiante(estudiante3);
        grupo2.agregarEstudiante(estudiante4);
        
        //crear contendor de grupos
        contenedorGrupos contenedor = new contenedorGrupos();
        contenedor.agregarGrupo(grupo1);
        contenedor.agregarGrupo(grupo2);
        
        /* imprimir en consola */
        System.out.println(tutor1.toString());
        System.out.println(tutor2.toString());
        System.out.println(tutor3.toString());
        System.out.println(tutor4.toString());
        
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
        
        //listar estudiantes
        grupo1.listarIntegrantesGrupo();
        //grupo2.listarIntegrantesGrupo();
        
        //lista de grupos
        contenedor.listarGrupos();
    }
}
