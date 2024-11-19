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
    public VistaZoologico vistaZoologico = new VistaZoologico();

    //Crear las zonas por defecto
    public void inicializarZonas(Zoologico zoologico) {
        // Instanciación de las zonas
        Zona zonaSelva = new Zona("Selva", "Tropical y humedo", 5);
        Zona zonaArtico = new Zona("Artico", "Clima frio", 4);
        Zona zonaDesierto = new Zona("Desierto", "Arido y seco", 6);
        Zona zonaSabana = new Zona("Sabana", "Caluroso y con vegetacion baja", 5);
        Zona zonaBosque = new Zona("Bosque", "Clima templado y vegetacion densa", 7);

        //Agregar las zonas a la lista de ZONAS de la clase zoologico
        zoologico.agregarZona(zonaSelva);
        zoologico.agregarZona(zonaArtico);
        zoologico.agregarZona(zonaDesierto);
        zoologico.agregarZona(zonaSabana);
        zoologico.agregarZona(zonaBosque);
    }

    //Crear visitantes predefinidos, para que la funcion de iniciar sesion sirva
    public void inicializarVisitantes(Zoologico zoologico) {
        //Creacion de visitantes por defecto 
        Visitante visitante1 = new Visitante(1, "Juan Perez", 25);
        Visitante visitante2 = new Visitante(2, "Maria Lopez", 30);
        Visitante visitante3 = new Visitante(3, "Carlos Gomez", 18);
        Visitante visitante4 = new Visitante(4, "Ana Martinez", 22);
        Visitante visitante5 = new Visitante(5, "Luis Rodriguez", 35);
        Visitante visitante6 = new Visitante(6, "Sofia Torres", 28);
        Visitante visitante7 = new Visitante(7, "Pedro Ramirez", 40);
        Visitante visitante8 = new Visitante(8, "Laura Fernandez", 19);
        Visitante visitante9 = new Visitante(9, "Jorge Gutierrez", 27);
        Visitante visitante10 = new Visitante(10, "Diana Morales", 32);
        Visitante visitante11 = new Visitante(11, "Fernando Sanchez", 21);
        Visitante visitante12 = new Visitante(12, "Paula Ortiz", 26);
        Visitante visitante13 = new Visitante(13, "Ricardo Herrera", 45);
        Visitante visitante14 = new Visitante(14, "Camila Vargas", 23);
        Visitante visitante15 = new Visitante(15, "Andres Medina", 29);
        Visitante visitante16 = new Visitante(16, "Isabel Cruz", 20);
        Visitante visitante17 = new Visitante(17, "Daniela Vega", 31);
        Visitante visitante18 = new Visitante(18, "Sergio Silva", 34);
        Visitante visitante19 = new Visitante(19, "Valeria Castro", 24);
        Visitante visitante20 = new Visitante(20, "Hector Aguilar", 37);

        //Agregar los visitantes a la lista de VISITANTES en ZOOLOGICO
        //PENDIENTE
        zoologico.agregarVisitante(visitante1);
        zoologico.imprimirVisitantes();

        //Agregar los visitantes a la lista de VISITANTES en ZONA        
        zoologico.getZonas().get(1).setVisitantesPorZona(visitante1);
        zoologico.getZonas().get(0).setVisitantesPorZona(visitante2);
        zoologico.getZonas().get(0).setVisitantesPorZona(visitante3);
        zoologico.getZonas().get(0).setVisitantesPorZona(visitante4);
        zoologico.getZonas().get(1).setVisitantesPorZona(visitante5);
        zoologico.getZonas().get(1).setVisitantesPorZona(visitante6);
        zoologico.getZonas().get(1).setVisitantesPorZona(visitante7);
        zoologico.getZonas().get(1).setVisitantesPorZona(visitante8);
        zoologico.getZonas().get(2).setVisitantesPorZona(visitante9);
        zoologico.getZonas().get(2).setVisitantesPorZona(visitante10);
        zoologico.getZonas().get(2).setVisitantesPorZona(visitante11);
        zoologico.getZonas().get(2).setVisitantesPorZona(visitante12);
        zoologico.getZonas().get(3).setVisitantesPorZona(visitante13);
        zoologico.getZonas().get(3).setVisitantesPorZona(visitante14);
        zoologico.getZonas().get(3).setVisitantesPorZona(visitante15);
        zoologico.getZonas().get(3).setVisitantesPorZona(visitante16);
        zoologico.getZonas().get(4).setVisitantesPorZona(visitante17);
        zoologico.getZonas().get(4).setVisitantesPorZona(visitante18);
        zoologico.getZonas().get(4).setVisitantesPorZona(visitante19);
        zoologico.getZonas().get(4).setVisitantesPorZona(visitante20);

        //
            }

    //Crear instancias de animales
    public void inicializarAnimales(Zoologico zoologico) {
        Mamifero mono = new Mamifero(true, 37.5f, true, "Mono araña", "Ateles geoffroyi", 12, 8.4f, false, "Tropical y humedo", "Frutas y hojas");
        Ave guacamaya = new Ave(true, "Rojo brillante", 50, "Alimentación supervisada", "Guacamaya roja", "Ara macao", 8, 1.2f, false, "Tropical y humedo", "Frutas y semillas");
        Reptil boa = new Reptil(false, "Escamas lisas", "Sangre fría", "Ovíparo", "Boa constrictora", "Boa constrictor", 6, 15.3f, false, "Tropical y humedo", "Pequeños mamíferos");
        Mamifero osoPolar = new Mamifero(true, 36.9f, false, "Oso polar", "Ursus maritimus", 9, 500f, true, "Clima frio", "Carnívoro");
        Ave pinguino = new Ave(false, "Negro y blanco", 20, "Control de temperatura", "Pingüino emperador", "Aptenodytes forsteri", 4, 30f, false, "Clima frio", "Peces y crustáceos");
        Reptil lagartoArtico = new Reptil(false, "Escamas gruesas", "Sangre fría", "Ovíparo", "Lagarto artico", "Ficticius arcticus", 3, 0.8f, false, "Clima frio", "Insectos");
        Mamifero zorro = new Mamifero(true, 39.0f, true, "Zorro del desierto", "Vulpes zerda", 5, 1.5f, false, "Arido y seco", "Insectos y pequeños mamíferos");
        Ave buho = new Ave(true, "Marrón claro", 10, "Cuidados nocturnos", "Búho del desierto", "Bubo bubo", 7, 2.5f, false, "Arido y seco", "Pequeños roedores");
        Reptil cobra = new Reptil(true, "Escamas lisas", "Sangre fría", "Ovíparo", "Cobra egipcia", "Naja haje", 4, 1.3f, true, "Arido y seco", "Pequeños mamíferos");
        Mamifero leon = new Mamifero(true, 38.5f, true, "León africano", "Panthera leo", 8, 190f, true, "Caluroso y con vegetacion baja", "Carnívoro");
        Ave avestruz = new Ave(false, "Negro y blanco", 30, "Supervisión en verano", "Avestruz", "Struthio camelus", 6, 120f, false, "Caluroso y con vegetacion baja", "Plantas y semillas");
        Reptil cocodrilo = new Reptil(false, "Escamas rugosas", "Sangre fría", "Ovíparo", "Cocodrilo del Nilo", "Crocodylus niloticus", 12, 450f, true, "Caluroso y con vegetacion baja", "Carnívoro");
        Mamifero osoPardo = new Mamifero(true, 37.8f, true, "Oso pardo", "Ursus arctos", 10, 300f, true, "Clima templado y vegetacion densa", "Omnívoro");
        Ave buhoReal = new Ave(true, "Marrón y blanco", 15, "Cuidados nocturnos", "Búho real", "Bubo bubo", 8, 3.2f, false, "Clima templado y vegetacion densa", "Roedores");
        Reptil lagartoComun = new Reptil(false, "Escamas finas", "Sangre fría", "Ovíparo", "Lagarto común", "Lacerta agilis", 2, 0.2f, false, "Clima templado y vegetacion densa", "Insectos");

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

    public Visitante registrarVisitante(Zoologico zoologico) throws Exception {
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
        vistaZoologico.seleccionZona(zoologico);
        return visitante;
    }

    //Este método se encarga de verificar y agregar una visita de un usuario
    //ya registrado en el sistema
    public Visitante iniciarSesion(int id, Zoologico zoologico) {
        Visitante visitanteTemporal = null;
        for (int i = 0; i < zoologico.getVisitantes().size(); i++) {
            if (id == zoologico.getVisitantes().get(i).getIdentificacion()) {
                zoologico.getVisitantes().get(i).getIdentificacion();
                visitanteTemporal = zoologico.getVisitantes().get(i);
                vistaZoologico.seleccionZona(zoologico);
            }
        }
        return visitanteTemporal;
    }

    //Lógica para la opcion 3 (MODO ADMINISTRADOR)
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
                vistaZoologico.PantallaAdministrador(zoologico);
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

    public void rastrearVisitante(Zoologico zoologico, String nombre) {
        for (int i = 0; i < zoologico.getZonas().size(); i++) {
            for (int j = 0; j < zoologico.getZonas().get(i).getVisitantesPorZona().size(); j++) {
                Visitante visitante = zoologico.getZonas().get(i).getVisitantesPorZona().get(j);
                if (visitante.getNombre().equals(nombre)) {
                    System.out.println("El visitante se encuentra en la zona: " + zoologico.getZonas().get(i).getNombre());
                }
            }
        }
    }

    public void agregarZona() {

    }
}
