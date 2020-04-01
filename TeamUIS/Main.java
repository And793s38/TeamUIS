import java.util.Scanner;

/**
 * Write a description of class Main here.
 * 
 * @author TeamUis
 * @version 31/03/2020
 */
public class Main {
    // instance variables - replace the example below with your own
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int dato = 0;
        int accion = 30;
        Estudiante Logestudiante = new Estudiante();
        Tutor Logtutor = new Tutor();
        String nombre;
        String codigo;
        String carrera;
        String telefono;

        // crear la materias
        Materia Ingles1 = new Materia("Ingles 1", "4444");
        Materia Software1 = new Materia("Software", "3333");
        Materia Bases1 = new Materia("Bases 1", "2222");
        Materia Calculo1 = new Materia("Calculo 1", "1111");

        // crear los tutores
        Tutor tutor1 = new Tutor("Jair Panqueva", "1001", "Ing. Sistemas", "304312121", Software1);
        Tutor tutor2 = new Tutor("Edinson Jose", "1002", "Ing. Electrica", "304312121", Ingles1);
        Tutor tutor3 = new Tutor("Mauren Maria", "1003", "Ing. Metalurgica", "304312121", Calculo1);
        Tutor tutor4 = new Tutor("Juliana Mantilla", "1004", "Ing. Sistemas", "304312121", Bases1);

        // crear los estudiantes
        Estudiante estudiante1 = new Estudiante("Brain Jose", "216001", "ing. Sistemas", "312212121");
        Estudiante estudiante2 = new Estudiante("Jose Arturo", "216002", "ing. Electrica", "312212120");
        Estudiante estudiante3 = new Estudiante("Juan", "216003", "ing. Petroleos", "312212122");
        Estudiante estudiante4 = new Estudiante("Sebastian Tami", "216004", "ing. Industrial", "312212123");

        // crear los grupos
        // crear grupo con tutor y agregar estudiantes:
        Grupo grupo1 = new Grupo(estudiante1, tutor1, Software1, "centro de estudios de sistemas");
        grupo1.agregarEstudiante(estudiante4);

        // crear grupo sin tutor y agregar estudiantes:
        Grupo grupo2 = new Grupo(estudiante1, Ingles1, "centro de estudios de sistemas");
        grupo2.agregarEstudiante(estudiante2);
        grupo2.agregarEstudiante(estudiante3);
        grupo2.agregarEstudiante(estudiante4);

        // crear contendor de grupos
        contenedorGrupos contenedorG = new contenedorGrupos();
        contenedorG.agregarGrupo(grupo1);
        contenedorG.agregarGrupo(grupo2);

        // crear contendor de grupos
        contenedorMaterias contenedorM = new contenedorMaterias();
        contenedorM.agregarMateria(Ingles1);
        contenedorM.agregarMateria(Software1);
        contenedorM.agregarMateria(Bases1);
        contenedorM.agregarMateria(Calculo1);

        /* imprimir en consola */
        /*
         * System.out.println(tutor1.toString()); System.out.println(tutor2.toString());
         * System.out.println(tutor3.toString()); System.out.println(tutor4.toString());
         * 
         * System.out.println(estudiante1.toString());
         * System.out.println(estudiante2.toString());
         * System.out.println(estudiante3.toString());
         * System.out.println(estudiante4.toString());
         */

        // listar estudiantes
        /* grupo1.listarIntegrantesGrupo(); */
        // grupo2.listarIntegrantesGrupo();

        // lista de grupos
        /* contenedorG.ToStringGrupos(); */
        System.out.println(" Bienvenido a TeamUIS ");
        System.out.println("----------------------------");
        System.out.println(" Quieres iniciar como estudiante(1) o Tutor (2)? ");
        Scanner entradaEscaner = new Scanner(System.in);
        try {
            dato = entradaEscaner.nextInt();
        } catch (Exception excepcion) {
        }

        System.out.println("----------------------------");

        if (dato == 1) {
            System.out.println(" Estudiante ");
            Scanner N = new Scanner(System.in);

            System.out.println(" Por favor ingrese su nombre ");
            nombre = N.nextLine();

            Scanner C = new Scanner(System.in);

            System.out.println(" Su codigo ");
            codigo = C.nextLine();

            Scanner CR = new Scanner(System.in);

            System.out.println(" Su carrera ");
            carrera = CR.nextLine();

            Scanner T = new Scanner(System.in);

            System.out.println(" Su telefono ");
            telefono = T.nextLine();

            Logestudiante = new Estudiante(nombre, codigo, carrera, telefono);
            System.out.println(Logestudiante.toString());

        } else if (dato == 2) {
            System.out.println(" Tutor ");
            Materia materia = new Materia();
            int idM = 0;

            Scanner N = new Scanner(System.in);

            System.out.println(" Por favor ingrese su nombre ");
            nombre = N.nextLine();

            Scanner C = new Scanner(System.in);

            System.out.println(" Su codigo ");
            codigo = C.nextLine();

            Scanner CR = new Scanner(System.in);

            System.out.println(" Su carrera ");
            carrera = CR.nextLine();

            Scanner T = new Scanner(System.in);

            System.out.println(" Su telefono ");
            telefono = T.nextLine();

            while (idM == 0) {
                System.out.println(" Por favor ingrese el id de su materia, de no conocerlo digite 0 ");
                idM = entradaEscaner.nextInt();
                int mx = contenedorM.getId();
                if (idM == 0) {
                    contenedorM.ToStringMaterias();
                } else if (idM > mx || idM < 0) {
                    System.out.println("No existe la asignatura escogida");
                    idM = 0;
                } else {
                    materia = contenedorM.buscarMateria(idM);
                }
            }

            Logtutor = new Tutor(nombre, codigo, carrera, telefono, materia);
            System.out.println(Logtutor.toString());
        } else {
            System.out.println(" Entrada no valida ");
            accion = 0;
        }

        System.out.println("----------------------------");

        while (accion != 0) {
            Scanner AC = new Scanner(System.in);
            System.out.println(" Que deseas hacer? ");
            System.out.println("    1.Listar Materias disponibles ");
            System.out.println("    2.Listar Grupos de Estudio ");
            if (dato == 1) {
                System.out.println("    3.Unirse a un Grupos de Estudio ");
            } else if (dato == 2) {
                System.out.println("    3.Crear Grupo de Estudio ");
            }
            System.out.println("    4.Agregar Materia ");
            System.out.println("    0.Salir ");

            accion = AC.nextInt();

            switch (accion) {
                case 0:
                    System.out.println(" Adiós ");
                    break;
                case 1:
                    contenedorM.ToStringMaterias();
                    break;
                case 2:
                    contenedorG.ToStringGrupos();
                    break;
                case 3:
                    if (dato == 1) {
                        System.out.println(" A que grupo desea unirse? ingrese el id ");
                        contenedorG.ToStringGrupos();
                        Scanner UG = new Scanner(System.in);
                        int idU = UG.nextInt();
                        contenedorG.buscarGrupo(idU).agregarEstudiante(Logestudiante);
                    } else {
                        Materia materia = new Materia();
                        Scanner UN = new Scanner(System.in);
                        System.out.println(" De que materia será el grupo? ");
                        int idM = 0;
                        while (idM == 0) {
                            System.out.println(" Por favor ingrese el id de su materia, de no conocerlo digite 0 ");
                            System.out.println(" De no existir la asignatura ingrese -1 ");
                            idM = entradaEscaner.nextInt();
                            int mx = contenedorM.getId();
                            if (idM == 0) {
                                contenedorM.ToStringMaterias();
                            } else if (idM > mx || idM < -1) {
                                System.out.println("No existe la asignatura escogida");
                                idM = 0;
                            }  else if (idM == -1) {
                                Scanner NA = new Scanner(System.in);
                                System.out.println(" Por favor ingrese nombre de la asignatura ");
                                String na = NA.nextLine();
                                Scanner CA = new Scanner(System.in);
                                System.out.println(" Su codigo ");
                                String ca = CA.nextLine();
                                Materia LogMateria = new Materia(na,ca);
                                contenedorM.agregarMateria(LogMateria);
                                materia = LogMateria;
                            }else {
                                materia = contenedorM.buscarMateria(idM);
                            }
                        }
                        Scanner de = new Scanner(System.in);
                        System.out.println(" Por favor agregue detalles sobre el grupo ");
                        String details = de.nextLine();
                        Grupo LogG = new Grupo(Logtutor, materia, details);
                        contenedorG.agregarGrupo(LogG);
                        contenedorG.ToStringGrupos();
                    }
                    break;
                    case 4:
                    Scanner NA = new Scanner(System.in);
                    System.out.println(" Por favor ingrese nombre de la asignatura ");
                    String na = NA.nextLine();
                    Scanner CA = new Scanner(System.in);
                    System.out.println(" Su codigo ");
                    String ca = CA.nextLine();
                    Materia LogMateria = new Materia(na,ca);
                    contenedorM.agregarMateria(LogMateria);
                    contenedorM.ToStringMaterias();
                    break;
                    default:
                    System.out.println(" La acción no es valida ");
            }

        }

    }
}
