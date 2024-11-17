package Controlador;
//Importaciones de otras clases

import Modelo.Ave;
import Modelo.Mamifero;
import Modelo.Reptil;
import Modelo.Visitante;
import Modelo.Zona;
import Modelo.Zoologico;
import Vista.VistaZoologico;
import java.util.Scanner;

//notas de lo realizado:
//instanciacion de visitantes y zonas, para proximamente hacer las estadisticas
//queda pendiente la segunda opcion del menu, iniciar sesion
//hacer la comparacion del input del id con los existentes y hacer la 
//validacion 
//Esta clase controladora, se encarga de la mayor de funcionalidades que 
//pueda llegar a tener la clase zoologico.
public class ZoologicoControlador {

    //Scanner del input por consola del usuario
    public Scanner scanner = new Scanner(System.in);

    //Crear las zonas por defecto
    public void inicializarZonas(Zoologico zoologico) {
        Zona zonaSelva = new Zona("Selva", "Tropical", 5);
        Zona zonaArtico = new Zona("Ártico", "Clima frío", 3);
        Zona zonaDesierto = new Zona("Desierto", "Árido y seco", 4);

        //Agregar las zonas a la lista de ZONAS de la clase zoologico
        zoologico.agregarZona(zonaSelva);
        zoologico.agregarZona(zonaArtico);
        zoologico.agregarZona(zonaDesierto);
    }

    //Crear visitantes predefinidos, para que la funcion de iniciar sesion sirva
    public void inicializarVisitantes(Zoologico zoologico) {
        Visitante visitante1 = new Visitante(1, "Juan Pérez", 25);
        Visitante visitante2 = new Visitante(2, "María López", 30);
        Visitante visitante3 = new Visitante(3, "Carlos Gómez", 18);
        Visitante visitante4 = new Visitante(4, "Ana Martínez", 22);
        Visitante visitante5 = new Visitante(5, "Luis Rodríguez", 35);
        Visitante visitante6 = new Visitante(6, "Sofía Torres", 28);
        Visitante visitante7 = new Visitante(7, "Pedro Ramírez", 40);
        Visitante visitante8 = new Visitante(8, "Laura Fernández", 19);
        Visitante visitante9 = new Visitante(9, "Jorge Gutiérrez", 27);
        Visitante visitante10 = new Visitante(10, "Diana Morales", 32);
        Visitante visitante11 = new Visitante(11, "Fernando Sánchez", 21);
        Visitante visitante12 = new Visitante(12, "Paula Ortiz", 26);
        Visitante visitante13 = new Visitante(13, "Ricardo Herrera", 45);
        Visitante visitante14 = new Visitante(14, "Camila Vargas", 23);
        Visitante visitante15 = new Visitante(15, "Andrés Medina", 29);
        Visitante visitante16 = new Visitante(16, "Isabel Cruz", 20);
        Visitante visitante17 = new Visitante(17, "Daniela Vega", 31);
        Visitante visitante18 = new Visitante(18, "Sergio Silva", 34);
        Visitante visitante19 = new Visitante(19, "Valeria Castro", 24);
        Visitante visitante20 = new Visitante(20, "Héctor Aguilar", 37);

        //Agregar los visitantes a la lista de VISITANTES en ZOOLOGICO
        zoologico.agregarVisitante(visitante1);
        zoologico.agregarVisitante(visitante2);
        zoologico.agregarVisitante(visitante3);
        zoologico.agregarVisitante(visitante4);
        zoologico.agregarVisitante(visitante5);
        zoologico.agregarVisitante(visitante6);
        zoologico.agregarVisitante(visitante7);
        zoologico.agregarVisitante(visitante8);
        zoologico.agregarVisitante(visitante9);
        zoologico.agregarVisitante(visitante10);
        zoologico.agregarVisitante(visitante11);
        zoologico.agregarVisitante(visitante12);
        zoologico.agregarVisitante(visitante13);
        zoologico.agregarVisitante(visitante14);
        zoologico.agregarVisitante(visitante15);
        zoologico.agregarVisitante(visitante16);
        zoologico.agregarVisitante(visitante17);
        zoologico.agregarVisitante(visitante18);
        zoologico.agregarVisitante(visitante19);
        zoologico.agregarVisitante(visitante20);
    }

    //Crear instancias de animales
    public void inicializarAnimales() {
        Mamifero mono = new Mamifero(true, 37.5f, false, "Mono Capuchino", "Cebus capucinus", 5, 3.2f, false, "Clima cálido y húmedo", "Omnívoro");
        Mamifero jaguar = new Mamifero(true, 38.0f, true, "Jaguar", "Panthera onca", 7, 100.5f, true, "Clima cálido y húmedo", "Carnívoro");

        Ave guacamaya = new Ave(true, "Azul y amarillo", 50, "Protección solar", "Guacamaya Azul", "Ara ararauna", 4, 1.3f, false, "Clima cálido y húmedo", "Frugívoro");
        Ave tucan = new Ave(true, "Negro y amarillo", 20, "Cuidado de pico", "Tucán", "Ramphastos toco", 6, 0.7f, false, "Clima cálido y húmedo", "Frugívoro");

        Reptil anaconda = new Reptil(false, "Escamas grandes", "Sangre fría", "Ovovivípara", "Anaconda", "Eunectes murinus", 8, 120.0f, true, "Clima cálido y húmedo", "Carnívoro");
        Reptil iguanaVerde = new Reptil(false, "Escamas pequeñas", "Sangre fría", "Ovípara", "Iguana Verde", "Iguana iguana", 3, 6.0f, false, "Clima cálido y húmedo", "Herbívoro");

        Mamifero camello = new Mamifero(true, 37.0f, false, "Camello", "Camelus bactrianus", 10, 650.0f, false, "Clima árido", "Herbívoro");
        Mamifero fenec = new Mamifero(true, 37.5f, true, "Zorro del Desierto", "Vulpes zerda", 4, 1.5f, false, "Clima árido", "Carnívoro");

        Ave buitre = new Ave(true, "Negro y marrón", 40, "Cuidado de alas", "Buitre del Desierto", "Gyps fulvus", 5, 6.0f, false, "Clima árido", "Carnívoro");
        Ave codorniz = new Ave(false, "Marrón", 7, "Cuidado de huevos", "Codorniz del Desierto", "Callipepla gambelii", 3, 0.2f, false, "Clima árido", "Omnívoro");

        Reptil cobraDelDesierto = new Reptil(true, "Escamas pequeñas", "Sangre fría", "Ovípara", "Cobra del Desierto", "Naja haje", 6, 5.5f, true, "Clima árido", "Carnívoro");
        Reptil geco = new Reptil(false, "Escamas suaves", "Sangre fría", "Ovípara", "Geco Leopardo", "Eublepharis macularius", 2, 0.08f, false, "Clima árido", "Insectívoro");

        Mamifero delfin = new Mamifero(false, 36.5f, false, "Delfín", "Delphinus delphis", 12, 120.0f, false, "Clima marino", "Piscívoro");
        Mamifero loboMarino = new Mamifero(true, 36.0f, false, "Lobo Marino", "Otaria flavescens", 15, 200.0f, false, "Clima marino", "Piscívoro");

        Ave albatros = new Ave(true, "Blanco y negro", 50, "Cuidado de plumas", "Albatros", "Diomedea exulans", 8, 10.0f, false, "Clima marino", "Piscívoro");
        Ave pelicano = new Ave(true, "Blanco y marrón", 25, "Protección ocular", "Pelícano", "Pelecanus occidentalis", 10, 7.0f, false, "Clima marino", "Piscívoro");

        Reptil tortugaMarina = new Reptil(false, "Escamas duras", "Sangre fría", "Ovípara", "Tortuga Marina", "Chelonia mydas", 20, 300.0f, false, "Clima marino", "Herbívoro");
        Reptil iguanaMarina = new Reptil(false, "Escamas gruesas", "Sangre fría", "Ovípara", "Iguana Marina", "Amblyrhynchus cristatus", 5, 13.0f, false, "Clima marino", "Herbívoro");

        Mamifero oso = new Mamifero(true, 37.5f, false, "Oso Pardo", "Ursus arctos", 10, 450.0f, true, "Clima templado", "Omnívoro");
        Mamifero ciervo = new Mamifero(true, 37.0f, false, "Ciervo", "Cervus elaphus", 8, 120.0f, false, "Clima templado", "Herbívoro");

        Ave aguila = new Ave(true, "Marrón y blanco", 30, "Cuidado de pico", "Águila Real", "Aquila chrysaetos", 7, 4.5f, false, "Clima templado", "Carnívoro");
        Ave halcon = new Ave(true, "Gris y negro", 15, "Protección ocular", "Halcón Peregrino", "Falco peregrinus", 5, 1.2f, false, "Clima templado", "Carnívoro");
    }

    public Visitante registrarVisitante() {

        boolean checker = true;
        Visitante visitante = new Visitante();
        //Pide datos de id
        //Queda pendiente si ingresa un id igual a el de otro usuario, nopermitir crearlo
        do {
            try {
                System.out.println("identificacion");
                visitante.setIdentificacion(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine();// pendiente hacer la clase exception personalizada
            }
        } while (checker);

        //Pide datos de nombre
        do {
            try {
                System.out.println("Ingresa tu nombre: ");
                visitante.setNombre(scanner.nextLine());
                break;
            } catch (Exception e) {
                scanner.nextLine(); //pendiente para hacer la clase exception personalizada
            }
        } while (checker);
 
        //Pide datos de edad
        do {
            try {
                System.out.println("Ingresa tu edad: ");
                visitante.setEdad(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine();
            }
        } while (checker);
        return visitante;
    }

    public Visitante iniciarSesion(int id, Zoologico zoologico) {
        Visitante visitanteTemporal = null;
        for (int i = 0; i < zoologico.obtenerVisitantes().size(); i++) {
            if (id == zoologico.obtenerVisitantes().get(i).getIdentificacion()) {
                zoologico.obtenerVisitantes().get(i).getIdentificacion();
                visitanteTemporal = zoologico.obtenerVisitantes().get(i);
            }
        }
        return visitanteTemporal;
    }

    public boolean iniciarSesionAdmin(Zoologico zoologico) {
        boolean iniciarSesionAdminChecker = true;
        String contraseñaInput;
        do {
            contraseñaInput = scanner.nextLine();
            if (contraseñaInput.equals(zoologico.getContraseña())) {
                VistaZoologico vistaZoologico = new VistaZoologico();
                vistaZoologico.PantallaAdministrador();
                iniciarSesionAdminChecker = false;
            } else {
                System.out.println("""
                                   vuelva a intentarlo
                                   1. Volver a intentar
                                   2. Salir""");
                int seleccion = scanner.nextInt();
                switch (seleccion) {
                    case 1:
                        iniciarSesionAdminChecker = true;
                        scanner.nextLine();
                        System.out.println("Vuelva a ingresar la contraseña");
                        break;
                    case 2:
                        iniciarSesionAdminChecker = false;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        } while (iniciarSesionAdminChecker);
    }
    
//    public void rastrearVisitante(String nombreVisitante) {
//
//    }
//
//    public void agregarZona() {
//    }

}
