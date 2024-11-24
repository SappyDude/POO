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
    public static VisitanteControlador visitanteControlador = new VisitanteControlador();
    public static Scanner scanner = new Scanner(System.in);

    //Metodo encargado de mostrar la pantalla de inicio al usuario
    public void PantallaPrograma(Zoologico zoologico) {
        //Variables usadas en este metodos
        boolean checkerPantallaPrograma = true;
        int seleccion;

        //PRIMER MENÚ
        System.out.println("Bienvenid@ al zoologico Zooniverse!\n");
        do {
            try {
                System.out.print("""
                                   ENTRADA DEL ZOOLOGICO
                                   1. Registrarse por primera vez
                                   2. Iniciar sesion
                                   3. Modo administrador
                                   4. Salir
                                 
                                   Seleccione que desea hacer:""" + " ");
                seleccion = scanner.nextInt();
                scanner.nextLine();

                //Opciones específicas de la primera pantalla
                switch (seleccion) {

                    //REGISTRAR
                    case 1:
                        System.out.println("\nRegistro como nuevo visitante");

                        //Metodos para registrar al usuario
                        Visitante visitanteNuevo = new Visitante();
                        visitanteNuevo.setIdentificacion(visitanteControlador.agregarIdVisitante(zoologico));
                        visitanteNuevo.setNombre(visitanteControlador.agregarNombreVisitante(zoologico));
                        visitanteNuevo.setEdad(visitanteControlador.agregarEdadVisitante(zoologico));
                        visitanteNuevo.setVisitasHechas();

                        //Entra a la seleccion de la zona
                        pantallaSeleccionZona(zoologico, visitanteNuevo);
                        break;

                    //INICIAR SESIÓN
                    case 2:
                        System.out.print("\nIngrese su id para iniciar sesion: ");

                        //Metodos para ver si el visitante esta en la lista
                        Visitante visitanteInicioSesion = zoologicoControlador.iniciarSesion(scanner.nextInt(), zoologico);
                        visitanteInicioSesion.setVisitasHechas();
                        scanner.nextLine();

                        //Entra a la seleccion de la zona
                        pantallaSeleccionZona(zoologico, visitanteInicioSesion);
                        break;

                    //MODO ADMINISTRADOR
                    case 3:
                        zoologicoControlador.iniciarSesionAdmin(zoologico);
                        break;

                    //SALIR DEL PROGRAMA
                    case 4:
                        System.out.println("Acabas de salir del zoologico");

                        //Rompe el do while
                        checkerPantallaPrograma = false;
                        break;

                    //AQUI FALTA IMPLEMENTACION DE EXCEPCIONES
                    default:
                        scanner.nextLine();
                        throw new AssertionError();
                }

            } catch (Exception e) {
                scanner.nextLine();
                //Este limpiador del buffer tiene el problema de dar doble tap cuando pasa un error
                //Revisar junto a los demas scanner.nextline();
            }
        } while (checkerPantallaPrograma);
    }

    //Método designado para la opción 3(MODO ADMINISTRADOR)
    public void PantallaAdministrador(Zoologico zoologico) {

        //Variables usadas en el metodo
        int seleccion;
        boolean checkerPantallaAdministrador = true;
        do {
            //MENU ADMINISTRADOR
            System.out.print("""
                         
                        Opciones de administrador
                         
                        1. Rastrear Visitante
                        2. Cambiar Contrasenia
                        3. Salir
                         
                        Seleccione que desea hacer:""" + " ");
            seleccion = scanner.nextInt();
            scanner.nextLine();

            //Opciones específicas del menú ADMINISTRADOR
            switch (seleccion) {

                //RASTREAR VISITANTE
                case 1:

                    //Muestra los visitantes en total
                    zoologico.imprimirVisitantes();
                    System.out.print("\nQue visitante desea buscar?: ");

                    //Rastrea el visitante y lo muestra en pantalla
                    System.out.println(zoologicoControlador.rastrearVisitante(zoologico, scanner.nextInt()));
                    scanner.nextLine();

                    //Espera a que el usuario lea la informacion
                    System.out.print("Presione cualquier tecla para continuar...");
                    scanner.nextLine();
                    break;

                //CAMBIAR CONTRASEÑA
                case 2:
                    System.out.print("\nIntroduzca la nueva contrasenia:");
                    zoologico.setContraseña(scanner.nextLine());
                    System.out.println(zoologico.getContraseña());
                    //Espera a que el usuario lea la informacion
                    System.out.print("\nPresione cualquier tecla para continuar...");
                    scanner.nextLine();
                    break;

                //SALIR
                case 3:
                    System.out.print("\n");
                    checkerPantallaAdministrador = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (checkerPantallaAdministrador);

    }

    //Método designado para la selección de la zona por parte del cliente
    public void pantallaSeleccionZona(Zoologico zoologico, Visitante visitante) {
        System.out.println("\nBienvenido " + visitante.getNombre());
        try {

            //Muestra las zonas actuales
            zoologico.mostrarZonas();
            System.out.print("\nSeleciona el numero de la zona para acceder a ella: ");

            //El visitante selecciona la zona
            Zona zonaSeleccionada = zoologicoControlador.seleccionZonaVisitante(zoologico);

            //Asignamos al visitante a la zona seleccionada
            zonaSeleccionada.setVisitantesPorZona(visitante);

            //Pasamos a la informacion de la zona 
            pantallaInformacionZona(zonaSeleccionada, visitante);
        } catch (Exception e) {
        }
    }

    //Método designado para desplegar la información de la zona
    public void pantallaInformacionZona(Zona zona, Visitante visitante) {

        //Variables usadas en el metodo
        boolean checkerPantallaInformacionZona = true;
        int seleccion;

        do {
            try {
                //MENU DENTRO DE LA ZONA
                System.out.print("""
                                        
                           1.Mostrar los animales en la zona 
                           2.Salir /*Agregar funcion para cambiar de zona*/
                                        
                           Selecciona una de las opciones disponibles: """ + " ");
                seleccion = scanner.nextInt();
                scanner.nextLine();

                //Opciones específicas del MENU DENTRO DE LA ZONA
                switch (seleccion) {

                    //Muestra los animales en la zona
                    case 1:
                        System.out.println("\nEstos son los animales en la zona");

                        //Muestra los animales en la zona
                        zona.mostrarAnimalesEnLaZona();

                        //Selecciona el animal que el visitante quiere
                        Animal animalSeleccionado = zonaControlador.seleccionAnimal(zona);

                        //Pasamos a la pantalla sobre el animal
                        checkerPantallaInformacionZona = pantallaAnimal(animalSeleccionado, visitante);
                        break;

                    //Sale de la zona
                    case 2:

                        //Se remueve el visitante de esta zona
                        zona.removerVisitanteDeZona(visitante);

                        //Rompe el ciclo
                        checkerPantallaInformacionZona = false;
                        break;
                    default:
                        scanner.nextLine();
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        } while (checkerPantallaInformacionZona);

    }

    //Método designado para mostrar las interacciones entre el visitante y el animal
    public boolean pantallaAnimal(Animal animal, Visitante visitante) {

        //Variables utilizadas en el metodo
        boolean checkerPantallaAnimal = true;
        int seleccion;

        //PANTALLA DEL ANIMAL
        do {
            try {
                System.out.print("""
                                   
                           1. Aprende sobre el animal que seleccionaste
                           2. Interactuar con el animal
                           3. Regresar
                                   
                           Selecciona la interaccion que desees:""" + " ");
                seleccion = scanner.nextInt();
                scanner.nextLine();

                //Opciones específicas de la PANTALLA DEL ANIMAL
                switch (seleccion) {

                    //INFORMACION ANIMAL
                    case 1:

                        //Muestra los detalles del animal en cuestión 
                        animal.mostrarDetalles();

                        //Espera a que el usuario lea la informacion
                        System.out.print("Presione cualquier tecla para continuar...");
                        scanner.nextLine();
                        break;

                    //INTERACCIONES CON EL ANIMAL
                    case 2:
                        pantallaInteraccionAnimal(animal, visitante);
                        break;

                    //REGRESAR
                    case 3:
                        checkerPantallaAnimal = false;
                        return true;

                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        } while (checkerPantallaAnimal);
        return false;
    }

    //Método designado para mostrar las interacciones especificas con el animal
    public void pantallaInteraccionAnimal(Animal animal, Visitante visitante) {

        //Atributos utilizados en el metodo
        boolean checkerPantallaInteraccionAnimal = true;
        int seleccion;

        //PANTALLA INTERACCION CON EL ANIMAL
        do {
            try {
                System.out.print("""
                                 
                           Acciones disponibles 
                                 
                           1. Dar de comer
                           2. Acariciar
                           3. Observar
                           4. Regresar
                                 
                           Seleccione que interaccion desea hacer con el animal:""" + " ");
                seleccion = scanner.nextInt();
                scanner.nextLine();

                //Opciones específicas de la PANTALLA INTERACCION CON EL ANIMAL
                switch (seleccion) {

                    //DAR DE COMER
                    case 1:
                        //Muestra la interaccion con el animal
                        System.out.println(animal.darDeComer());

                        //Se guarda en el historial del visitante
                        visitante.agregarInteraccion(animal.darDeComer());

                        //Espera a que el usuario lea la informacion
                        System.out.print("Presione cualquier tecla para continuar...");
                        scanner.nextLine();
                        break;

                    //ACARICIAR
                    case 2:

                        //Muestra la interaccion con el animal
                        System.out.println(animal.acariciar());

                        //Se guarda en el historial del visitante
                        visitante.agregarInteraccion(animal.acariciar());

                        //Espera a que el usuario lea la informacion
                        System.out.print("Presione cualquier tecla para continuar...");
                        scanner.nextLine();
                        break;

                    //OBSERVAR    
                    case 3:

                        //Muestra la interaccion con el animal
                        System.out.println(animal.observar());

                        //Se guarda en el historial del visitante
                        visitante.agregarInteraccion(animal.observar());

                        //Espera a que el usuario lea la informacion
                        System.out.print("Presione cualquier tecla para continuar...");
                        scanner.nextLine();
                        break;

                    //REGRESAR
                    case 4:

                        //Rompe el ciclo
                        checkerPantallaInteraccionAnimal = false;
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
                scanner.nextLine();
            }
        } while (checkerPantallaInteraccionAnimal);
    }
}
