package Vista;

//Importaciones de otras clases
import Modelo.Visitante;
import Modelo.Zoologico;
import java.util.Scanner;
import Controlador.ZoologicoControlador;
import Modelo.Zona;

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
                        Visitante visitante = zoologicoControlador.registrarVisitante(zoologico);
                        zoologico.agregarVisitante(visitante);
                        visitante.setVisitasHechas();
                        System.out.println("Bienvenido " + visitante.getNombre());

                        seleccionZona(zoologico);
                        checkerPrincipal = false;
                        break;

                    //INICIAR SESIÓN
                    case 2:
                        System.out.println("Ingrese su id para iniciar sesion");
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(scanner.nextInt(), zoologico);// Aqui ya es requerimiento el uso de 
                        // La base de datos para los distintos usuarios
                        visitanteInicioSesion.setVisitasHechas();
                        System.out.println("Bienvenido " + visitanteInicioSesion.getNombre());
                        seleccionZona(zoologico);
                        checkerPrincipal = false;
                        break;

                    //MODO ADMINISTRADOR
                    case 3:
                        System.out.println("\nIngrese la contraseña del administrador: ");
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
                scanner.nextLine();
                System.out.println("Ingresaste algo erroneo");

                checkerPrincipal = true;

            }
        }
    }

    //Método designado para la opción 3(MODO ADMINISTRADOR)
    public boolean PantallaAdministrador(Zoologico zoologico) {
        //Menú de opciones del MODO ADMINISTRADOR
       
        System.out.print("""
                        Inicio de administrador correcta
                        Seleccione que desea hacer:
                        1. RastrearVisitante
                        2. AgregarZona
                        3. AgregarAnimal
                        4. Salir
                           """
        );
        seleccion = scanner.nextInt();
        scanner.nextLine();

        //Opciones específicas del menú ADMINISTRADOR
        switch (seleccion) {

            //
            case 1:
                System.out.println("¿Que visitante desea buscar?");

                zoologicoControlador.rastrearVisitante(zoologico, scanner.nextLine());

                return false;
            case 2:

                return false;

            case 3:

                return false;

            case 4:
                System.out.print("\n");
                return true;

            default:
                scanner.nextLine();
                throw new AssertionError();
        }
    }

    //Método designado para la selección de la zona por parte del cliente
    public void seleccionZona(Zoologico zoologico) {
        System.out.println("Estas son las zonas a las que puedes acceder");
        zoologico.mostrarZonas();
        System.out.println("Seleciona el numero de la zona para acceder a ella");

        do {
            try {
                seleccion = scanner.nextInt();
                if (seleccion > 0 && seleccion <= zoologico.getZonas().size()) {
                    Zona zonaSeleccionada = zoologico.getZonas().get(seleccion - 1);
                    System.out.println("Has seleccionado la zona: " + zonaSeleccionada.getNombre());
                } else {
                    System.out.println("Selección no válida. Intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Selecciona una opcion disponible");
                scanner.nextLine();
            }

        } while (true);

    }
}
