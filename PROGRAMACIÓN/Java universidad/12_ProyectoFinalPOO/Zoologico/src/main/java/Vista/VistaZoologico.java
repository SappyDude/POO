package Vista;

//Importaciones de otras clases
import Controlador.*;
import Modelo.Visitante;
import Modelo.Zoologico;
import java.util.Scanner;
import Modelo.Zona;
import Modelo.Animal;

//El menu realizado para la vista del usuario, es parecido a inception
//Donde se ingresa a zonas especificas dependiendo a lo que el usuario elija
public class VistaZoologico {

    //Creacion de objetos reutilizables durante esta clase
    public static ZoologicoControlador zoologicoControlador = new ZoologicoControlador();
    public static ZonaControlador zonaControlador = new ZonaControlador();
    public static VisitanteControlador animalControlador = new VisitanteControlador();
    public static Scanner scanner = new Scanner(System.in);

    //Metodo encargado de mostrar la pantalla de inicio al usuario
    public void PantallaPrograma(Zoologico zoologico) {
        //Variable verificadora de ingreso a menús
        boolean checkerPantallaPrograma = true;
        int seleccion;
        //Comienzo de menús
        //PRIMER MENÚ
        do {
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
                        //Metodo para registrar al usuario
                        Visitante visitante = zoologicoControlador.registrarVisitante(zoologico);
                        //Metodo para agregar al visitante a la lista del zoo
                        zoologico.agregarVisitante(visitante);
                        //Suma una visita al visitante
                        visitante.setVisitasHechas();
                        System.out.println("Bienvenido " + visitante.getNombre());
                        //Entra a la seleccion de la zona
                        pantallaSeleccionZona(zoologico, visitante);
                        checkerPantallaPrograma = true;
                        break;

                    //INICIAR SESIÓN
                    case 2:
                        System.out.println("Ingrese su id para iniciar sesion");
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(scanner.nextInt(), zoologico);// Aqui ya es requerimiento el uso de 
                        scanner.nextLine();
                        // La base de datos para los distintos usuarios
                        visitanteInicioSesion.setVisitasHechas();
                        System.out.println("Bienvenido " + visitanteInicioSesion.getNombre());
                        pantallaSeleccionZona(zoologico, visitanteInicioSesion);
                        checkerPantallaPrograma = true;
                        break;

                    //MODO ADMINISTRADOR
                    case 3:
                        zoologicoControlador.iniciarSesionAdmin(zoologico);
                        checkerPantallaPrograma = true;
                        break;

                    //SALIR DEL PROGRAMA
                    case 4:
                        System.out.println("Acabas de salir del zoologico");
                        checkerPantallaPrograma = false;
                        break;
                    default:
                        scanner.nextLine();
                        throw new AssertionError();
                }

            } catch (Exception e) {
                scanner.nextLine();
                //Este limpiador del buffer tiene el problema de dar doble tap cuando pasa un error
                //Revisar junto a los demas scanner.nextline();
                checkerPantallaPrograma = true;
            }
        } while (checkerPantallaPrograma);

    }

    //Método designado para la opción 3(MODO ADMINISTRADOR)
    public boolean PantallaAdministrador(Zoologico zoologico) {
        //Menú de opciones del MODO ADMINISTRADOR
        int seleccion;
        System.out.print("""
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
                System.out.println(zoologicoControlador.rastrearVisitante(zoologico, scanner.nextLine()));
                return true;
            case 2:

                return true;
            case 3:

                return true;
            case 4:
                System.out.print("\n");

                return false;
            default:
                throw new AssertionError();
        }
    }

    //Método designado para la selección de la zona por parte del cliente
    public void pantallaSeleccionZona(Zoologico zoologico, Visitante visitante) {

        try {
            System.out.println("Estas son las zonas a las que puedes acceder");

            //Print de las zonas actuales
            zoologico.mostrarZonas();
            System.out.println("\nSeleciona el numero de la zona para acceder a ella");

            //Aqui obtenemos una zona
            Zona zonaSeleccionada = zoologicoControlador.seleccionZonaVisitante(zoologico);

            //Aqui asignamos al visitante a la zona
            zonaSeleccionada.setVisitantesPorZona(visitante);

            //Pasamos a la informacion de la zona
            pantallaInformacionZona(zonaSeleccionada, visitante);
        } catch (Exception e) {
        }
    }

    //Método designado para desplegar la información de la zona
    public void pantallaInformacionZona(Zona zona, Visitante visitante) {
        boolean checkerPantallaInformacionZona = true;
        int seleccion;

        do {
            try {
                System.out.println("""
                           
                           Selecciona una de las opciones disponibles
                           1.Mostrar los animales en la zona
                           2.Salir                           
                           """);
                seleccion = scanner.nextInt();
                scanner.nextLine();
                switch (seleccion) {
                    case 1:
                        System.out.println("Estos son los animales en la zona: " + zona.getNombre());
                        Animal animalSeleccionado = zonaControlador.seleccionAnimal(zona);
                        //ONWORK, ya se tiene el animal seleccionado, por lo que ahora
                        //Hace hacer las interaccions individuales con los visitantes
                        //Dependiendo de que tipo de animal es

                        checkerPantallaInformacionZona = pantallaInteraccionAnimal(animalSeleccionado, visitante);

                        break;
                    case 2:
                        zona.removerVisitanteDeZona(visitante);
                        checkerPantallaInformacionZona = false;
                        break;
                    default:
                        scanner.nextLine();
                        checkerPantallaInformacionZona = true;
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        } while (checkerPantallaInformacionZona);

    }

    //Método designado para mostrar las interacciones entre el visitante y el animal
    public boolean pantallaInteraccionAnimal(Animal animal, Visitante visitante) {
        boolean checkerPantallaInteraccionAnimal = true;
        int seleccion;
        do {
            try {
                System.out.println("""
                           Selecciona la opcion que desees
                           1. Aprende sobre el animal que seleccionaste
                           2. Interactuar con el animal
                           3. Regresar  
                           """);
                seleccion = scanner.nextInt();
                scanner.nextLine();

                switch (seleccion) {
                    case 1:
                        animal.datosDelAnimal();
                        checkerPantallaInteraccionAnimal = true;
                        break;

                    case 2:
                        animalControlador.interaccionVisitante(animal, visitante);
                        checkerPantallaInteraccionAnimal = true;
                        break;

                    case 3:
                        checkerPantallaInteraccionAnimal = false;
                        return true;

                    default:
                        checkerPantallaInteraccionAnimal = true;
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        } while (checkerPantallaInteraccionAnimal);
        return false;
    }
    /*
        AQUI LLAMAMOS AL CONTROLADOR DE LA ZONA.
        1.Mostrar los animales de la zona CHECK 
            1.1 Saber acerca de los animales CHECK
            1.2 Interaccion individual con los animales de la zona ONWORK
            1.3 Cambiar de la zona (quitarUsuarioDeLaZonaActual[metodo]) ONWORK
        2.Cambiar de zona
     */
}
