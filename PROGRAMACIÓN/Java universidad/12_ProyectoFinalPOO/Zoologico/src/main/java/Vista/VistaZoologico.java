package Vista;

//Importaciones de otras clases
import Modelo.Visitante;
import Modelo.Zoologico;
import java.util.Scanner;
import Controlador.ZoologicoControlador;
import Modelo.Zona;
import Controlador.ZonaControlador;
import Modelo.Animal;

//El menu realizado para la vista del usuario, es parecido a inception
//Donde se ingresa a zonas especificas dependiendo a lo que el usuario elija
public class VistaZoologico {

    //Creacion de objetos reutilizables durante esta clase
    public static ZoologicoControlador zoologicoControlador = new ZoologicoControlador();
    public static ZonaControlador zonaControlador = new ZonaControlador();
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
                scanner.nextLine();
                //Opciones específicas de la primera pantalla
                switch (seleccion) {

                    //REGISTRAR
                    case 1:
                        System.out.println("Registro como nuevo visitante");
                        Visitante visitante = zoologicoControlador.registrarVisitante(zoologico);
                        zoologico.agregarVisitante(visitante);
                        visitante.setVisitasHechas();
                        System.out.println("Bienvenido " + visitante.getNombre());
                        //Entra a la seleccion de la zona
                        pantallaSeleccionZona(zoologico, visitante);
                        checkerPrincipal = false;
                        break;

                    //INICIAR SESIÓN
                    case 2:
                        System.out.println("Ingrese su id para iniciar sesion");
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(scanner.nextInt(), zoologico);// Aqui ya es requerimiento el uso de 
                        // La base de datos para los distintos usuarios
                        visitanteInicioSesion.setVisitasHechas();
                        System.out.println("Bienvenido " + visitanteInicioSesion.getNombre());
                        pantallaSeleccionZona(zoologico, visitanteInicioSesion);
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
    public void pantallaSeleccionZona(Zoologico zoologico, Visitante visitante) {
        System.out.println("Estas son las zonas a las que puedes acceder");

        //Print de las zonas actuales
        zoologico.mostrarZonas();
        System.out.println("Seleciona el numero de la zona para acceder a ella");

        //Aqui obtenemos una zona
        Zona zonaSeleccionada = zoologicoControlador.seleccionZonaVisitante(zoologico);

        //Aqui asignamos al visitante a la zona
        zonaSeleccionada.setVisitantesPorZona(visitante);

        //Pasamos a la informacion de la zona
        pantallaInformacionZona(zonaSeleccionada, visitante);

    }

    /*
        AQUI LLAMAMOS AL CONTROLADOR DE LA ZONA.
        1.Mostrar los animales de la zona CHECK 
            1.1 Saber acerca de los animales ONWORK
            1.2 Interaccion individual con los animales de la zona ONWORK
            1.3 Cambiar de la zona (quitarUsuarioDeLaZonaActual[metodo]) ONWORK
        2.Cambiar de zona
     */
    public boolean pantallaInformacionZona(Zona zona, Visitante visitante) {
        System.out.println("""
                           Selecciona una de las opciones disponibles
                           1.Mostrar los animales en la zona
                           2.Salir                           
                           """);
        seleccion = scanner.nextInt();
        scanner.nextLine();
        do {
            try {
                switch (seleccion) {
                    case 1:
                        System.out.println("Estos son los animales en la zona: " + zona.getNombre());
                        zonaControlador.seleccionAnimal(zona);
                        //ONWORK, ya se tiene el animal seleccionado, por lo que ahora
                        //Hace hacer las interaccions individuales con los visitantes
                        //Dependiendo de que tipo de animal es
                        return true;
                    case 2:

                        return false;
                    default:
                        scanner.nextLine();
                        
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        } while (true);

    }
}
