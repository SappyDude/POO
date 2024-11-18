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
        // Instanciación de las zonas
        Zona zonaSelva = new Zona("Selva", "Tropical y húmedo", 5);
        Zona zonaArtico = new Zona("Ártico", "Clima frío", 4);
        Zona zonaDesierto = new Zona("Desierto", "Árido y seco", 6);
        Zona zonaSabana = new Zona("Sabana", "Caluroso y con vegetación baja", 5);
        Zona zonaBosque = new Zona("Bosque", "Clima templado y vegetación densa", 7);

        //Agregar las zonas a la lista de ZONAS de la clase zoologico
        zoologico.agregarZona(zonaSabana);
        zoologico.agregarZona(zonaBosque);
        zoologico.agregarZona(zonaArtico);
        zoologico.agregarZona(zonaSelva);
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
    public void inicializarAnimales(Zoologico zoologico) {
        Mamifero mono = new Mamifero(true, 37.5f, true, "Mono araña", "Ateles geoffroyi", 12, 8.4f, false, "Tropical y húmedo", "Frutas y hojas");
        Ave guacamaya = new Ave(true, "Rojo brillante", 50, "Alimentación supervisada", "Guacamaya roja", "Ara macao", 8, 1.2f, false, "Tropical y húmedo", "Frutas y semillas");
        Reptil boa = new Reptil(false, "Escamas lisas", "Sangre fría", "Ovíparo", "Boa constrictora", "Boa constrictor", 6, 15.3f, false, "Tropical y húmedo", "Pequeños mamíferos");
        Mamifero osoPolar = new Mamifero(true, 36.9f, false, "Oso polar", "Ursus maritimus", 9, 500f, true, "Clima frío", "Carnívoro");
        Ave pinguino = new Ave(false, "Negro y blanco", 20, "Control de temperatura", "Pingüino emperador", "Aptenodytes forsteri", 4, 30f, false, "Clima frío", "Peces y crustáceos");
        Reptil lagartoArtico = new Reptil(false, "Escamas gruesas", "Sangre fría", "Ovíparo", "Lagarto ártico", "Ficticius arcticus", 3, 0.8f, false, "Clima frío", "Insectos");
        Mamifero zorro = new Mamifero(true, 39.0f, true, "Zorro del desierto", "Vulpes zerda", 5, 1.5f, false, "Árido y seco", "Insectos y pequeños mamíferos");
        Ave buho = new Ave(true, "Marrón claro", 10, "Cuidados nocturnos", "Búho del desierto", "Bubo bubo", 7, 2.5f, false, "Árido y seco", "Pequeños roedores");
        Reptil cobra = new Reptil(true, "Escamas lisas", "Sangre fría", "Ovíparo", "Cobra egipcia", "Naja haje", 4, 1.3f, true, "Árido y seco", "Pequeños mamíferos");
        Mamifero leon = new Mamifero(true, 38.5f, true, "León africano", "Panthera leo", 8, 190f, true, "Caluroso y con vegetación baja", "Carnívoro");
        Ave avestruz = new Ave(false, "Negro y blanco", 30, "Supervisión en verano", "Avestruz", "Struthio camelus", 6, 120f, false, "Caluroso y con vegetación baja", "Plantas y semillas");
        Reptil cocodrilo = new Reptil(false, "Escamas rugosas", "Sangre fría", "Ovíparo", "Cocodrilo del Nilo", "Crocodylus niloticus", 12, 450f, true, "Caluroso y con vegetación baja", "Carnívoro");
        Mamifero osoPardo = new Mamifero(true, 37.8f, true, "Oso pardo", "Ursus arctos", 10, 300f, true, "Clima templado y vegetación densa", "Omnívoro");
        Ave buhoReal = new Ave(true, "Marrón y blanco", 15, "Cuidados nocturnos", "Búho real", "Bubo bubo", 8, 3.2f, false, "Clima templado y vegetación densa", "Roedores");
        Reptil lagartoComun = new Reptil(false, "Escamas finas", "Sangre fría", "Ovíparo", "Lagarto común", "Lacerta agilis", 2, 0.2f, false, "Clima templado y vegetación densa", "Insectos");

        zoologico.intentarAgregarAnimal(mono);
        zoologico.intentarAgregarAnimal(guacamaya);
        zoologico.intentarAgregarAnimal(boa);
        zoologico.intentarAgregarAnimal(osoPolar);
        zoologico.intentarAgregarAnimal(pinguino);
        zoologico.intentarAgregarAnimal(lagartoArtico);
        zoologico.intentarAgregarAnimal(zorro);
        zoologico.intentarAgregarAnimal(buho);
        zoologico.intentarAgregarAnimal(cobra);
        zoologico.intentarAgregarAnimal(leon);
        zoologico.intentarAgregarAnimal(avestruz);
        zoologico.intentarAgregarAnimal(cocodrilo);
        zoologico.intentarAgregarAnimal(osoPardo);
        zoologico.intentarAgregarAnimal(buhoReal);
        zoologico.intentarAgregarAnimal(lagartoComun);
    }

    public Visitante registrarVisitante() throws Exception {
        //Variable verificadora de ingreso a menús
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
                checker = rectificador();//Al 2.Salir, presenta "Ingresaste algo erroneo"
                if (checker == true) {
                } else {
                    throw new Exception();
                }

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
                scanner.nextLine();// pendiente hacer la clase exception personalizada
                checker = rectificador();//Al 2.Salir, presenta "Ingresaste algo erroneo"
                if (checker == true) {
                } else {
                    throw new Exception();
                }
            }
        } while (checker);
        return visitante;
    }

    //Este método se encarga de verificar y agregar una visita de un usuario
    //ya registrado en el sistema
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

    //Lógica para la opcion 4 (MODO ADMINISTRADOR)
    public boolean iniciarSesionAdmin(Zoologico zoologico) {
        boolean iniciarSesionAdminChecker = true;
        String contraseñaInput;

        //Verificar si la contraseña que se pone, es la correcta
        do {
            contraseñaInput = scanner.nextLine();
            if (contraseñaInput.equals(zoologico.getContraseña())) {
                //Aqui se llama un objeto para hacer uso del metodo PantallaAdmin
                VistaZoologico vistaZoologico = new VistaZoologico();

                //Llamo al metodo para entrar a la pantalla del admin
                vistaZoologico.PantallaAdministrador();
                return true;
            } else {

                iniciarSesionAdminChecker = rectificador();
                System.out.println("Vuelva a ingresar la contraseña");

            }
        } while (iniciarSesionAdminChecker);
        return true;
    }

    public boolean rectificador() {
        System.out.println("""
                                   vuelva a intentarlo
                                   1. Volver a intentar
                                   2. Salir""");
        int seleccion = scanner.nextInt();

        if (seleccion == 2) {
            scanner.nextLine();
            return false;
        } else {
            scanner.nextLine();
            return true;
        }
    }
//    public void rastrearVisitante(String nombreVisitante) {}
//    public void agregarZona() {}
}
