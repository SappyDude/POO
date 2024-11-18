package Vista;

//Importaciones de otras clases
import Modelo.Visitante;
import Modelo.Zoologico;
import java.util.Scanner;
import Controlador.ZoologicoControlador;

//El menu realizado para la vista del usuario, es parecido a inception
//Donde se ingresa a zonas especificas dependiendo a lo que el usuario elija
public class VistaZoologico {

    //Creacion de objetos reutilizables durante esta clase
    public static ZoologicoControlador zoologicoControlador = new ZoologicoControlador();
    public static Scanner scanner = new Scanner(System.in);
    public static int seleccion;

    //Metodo encargado de mostrar la pantalla de inicio al usuario
    public void PantallaPrograma(Zoologico zoologico) {
        //Variable verificadora de ingreso a menús
        boolean checkerPrincipal = true;

        //Comienzo de menús
        //PRIMER MENÚ
        while (checkerPrincipal) {
            try {
                System.out.println("""
                                   Bienvenido al zoologico 'Zuniverse'!
                                   Por favor, eliga una de las opciones de registro
                                   1. Registrarse por primera vez
                                   2. Iniciar sesion
                                   3. Modo administrador
                                   4. Salir""");
                seleccion = scanner.nextInt();

                //Opciones específicas de la primera pantalla
                switch (seleccion) {

                    //REGISTRAR
                    case 1:
                        System.out.println("Registro como nuevo visitante");
                        Visitante visitante = zoologicoControlador.registrarVisitante();
                        zoologico.agregarVisitante(visitante);
                        visitante.setVisitasHechas();
                        checkerPrincipal = false;
                        break;

                    //INICIAR SESIÓN
                    case 2:
                        System.out.println("Ingrese su id para iniciar sesion");
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(scanner.nextInt(), zoologico);// Aqui ya es requerimiento el uso de 
                        // La base de datos para los distintos usuarios
                        visitanteInicioSesion.setVisitasHechas();
                        System.out.println("Bienvenido " + visitanteInicioSesion.getNombre());
                        checkerPrincipal = false;
                        break;

                    //MODO ADMINISTRADOR
                    case 3:
                        System.out.println("modo admin");
                        System.out.println("Ingrese la contraseña del administrador");
                        checkerPrincipal = zoologicoControlador.iniciarSesionAdmin(zoologico);
                        break;

                    //SALIR DEL PROGRAMA
                    case 4:
                        System.out.println("Acabas de salir del zoologico");
                        checkerPrincipal = false;
                        break;

                    default:
                        scanner.nextLine();

                        throw new AssertionError();
                }

            } catch (Exception e) {
                System.out.println("Ingresaste algo erroneo");
                checkerPrincipal = true;
                scanner.nextLine();
            }
        }
    }

    //Método designado para la opción 4(MODO ADMINISTRADOR)
    public boolean PantallaAdministrador() {
        //Menú de opciones del MODO ADMINISTRADOR
        System.out.println("iniciaste la sesion de administrador");
        System.out.println("""
                        1. RastrearVisitante
                        2. AgregarZona
                        3. AgregarAnimal
                        4. Salir
                           """
        );
        seleccion = scanner.nextInt();

        //Opciones específicas del menú ADMINISTRADOR
        switch (seleccion) {

            //
            case 1:

                return false;
            case 2:

                return false;

            case 3:

                return false;

            case 4:

                return true;

            default:
                throw new AssertionError();
        }
    }

    //Método designado para la selección de la zona por parte del cliente
    public void PantallaZonas(Zoologico zoologico) {
        System.out.println("¿Que zona deseas visitar en el zoo");
        //Pendiente la llamada a cada uno de los login y register de este metodo
        //ONWORK la organizacion de zonas y animales

    }

}
