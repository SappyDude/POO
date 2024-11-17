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
    public static Scanner input = new Scanner(System.in);
    public static int seleccion;

    //Metodo encargado de mostrar la pantalla de inicio
    public void PantallaPrograma(Zoologico zoologico) {
        boolean checkerPrincipal = true;

        while (checkerPrincipal) {
            try {
                System.out.println("""
                                   Bienvenido al zoologico 'Zuniverse'!
                                   Por favor, eliga una de las opciones de registro
                                   1. Registrarse por primera vez
                                   2. Iniciar sesion
                                   3. Modo administrador
                                   4. Salir""");
                seleccion = input.nextInt();

                switch (seleccion) {
                    //REGISTRAR
                    case 1:
                        System.out.println("Registro como nuevo visitante");
                        Visitante visitante = zoologicoControlador.registrarVisitante();
                        zoologico.agregarVisitante(visitante);
                        visitante.setVisitasHechas();

                        checkerPrincipal = false;

                        break;
                    //INICIAR SESION
                    case 2:
                        System.out.println("Ingrese su id para iniciar sesion");
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(input.nextInt(), zoologico);// Aqui ya es requerimiento el uso de 
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

                    case 4:
                        System.out.println("Acabas de salir del zoologico");
                        checkerPrincipal = false;
                        break;

                    default:
                        throw new AssertionError();
                }

            } catch (Exception e) {
                System.out.println("Ingresaste algo erroneo");
                checkerPrincipal = true;
            }
        }
    }

    public boolean PantallaAdministrador() {

        System.out.println("iniciaste la sesion de administrador");
        System.out.println("""
                        1. RastrearVisitante
                        2. AgregarZona
                        3. AgregarAnimal
                        4. Salir
                           """
        );
        seleccion = input.nextInt();
        switch (seleccion) {
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

    public void PantallaZonas() {
        System.out.println("¿Que zona deseas visitar en el zoo");

    }

}
