package Controlador;

//Importaciones de otras clases
import Modelo.*;
import Vista.VistaZoologico;
import java.util.Scanner;

public class ZoologicoControlador {

    //Objetos utilizados
    public Scanner scanner = new Scanner(System.in);
    public VistaZoologico vistaZoologico = new VistaZoologico();

    //Crea las zonas por defecto
    public void inicializarZonas(Zoologico zoologico) {
        // Instanciación de las zonas
        Zona zonaSelva = new Zona("Selva", "tropical y humedo", 5);
        Zona zonaArtico = new Zona("Artico", "clima frio", 4);
        Zona zonaDesierto = new Zona("Desierto", "arido y seco", 6);
        Zona zonaSabana = new Zona("Sabana", "caluroso y con vegetacion baja", 5);
        Zona zonaBosque = new Zona("Bosque", "clima templado y vegetacion densa", 7);

        //Agregar las zonas a la lista de ZONAS de la clase zoologico
        zoologico.agregarZona(zonaSelva);
        zoologico.agregarZona(zonaArtico);
        zoologico.agregarZona(zonaDesierto);
        zoologico.agregarZona(zonaSabana);
        zoologico.agregarZona(zonaBosque);
    }

    //Crea visitantes predefinidos, para que la funcion de iniciar sesion sirva
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

        //Agregar los visitantes a la lista de VISITANTES en ZONA        
        zoologico.getZonas().get(0).setVisitantesPorZona(visitante1);
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
    }

    //Crea instancias de animales
    public void inicializarAnimales(Zoologico zoologico) {
        Mamifero mono = new Mamifero(true, 37.5f, true, "mono arana", "ateles geoffroyi", 12, 8.4f, false, "tropical y humedo", "herbivoro");
        Ave guacamaya = new Ave(true, "rojo brillante", 50, "alimentacion supervisada", "guacamaya roja", "ara macao", 8, 1.2f, false, "tropical y humedo", "herbivoro");
        Reptil boa = new Reptil(false, "escamas lisas", "sangre fria", "oviparo", "boa constrictora", "boa constrictor", 6, 15.3f, false, "tropical y humedo", "carnivoro");
        Mamifero osoPolar = new Mamifero(true, 36.9f, false, "oso polar", "ursus maritimus", 9, 500f, true, "clima frio", "carnivoro");
        Ave pinguino = new Ave(false, "negro y blanco", 20, "control de temperatura", "pinguino emperador", "aptenodytes forsteri", 4, 30f, false, "clima frio", "carnivoro");
        Reptil lagartoArtico = new Reptil(false, "escamas gruesas", "sangre fria", "oviparo", "lagarto artico", "ficticius arcticus", 3, 0.8f, false, "clima frio", "carnivoro");
        Mamifero zorro = new Mamifero(true, 39.0f, true, "zorro del desierto", "vulpes zerda", 5, 1.5f, false, "arido y seco", "omnivoro");
        Ave buho = new Ave(true, "marron claro", 10, "cuidados nocturnos", "buho del desierto", "bubo bubo", 7, 2.5f, false, "arido y seco", "carnivoro");
        Reptil cobra = new Reptil(true, "escamas lisas", "sangre fria", "oviparo", "cobra egipcia", "naja haje", 4, 1.3f, true, "arido y seco", "carnivoro");
        Mamifero leon = new Mamifero(true, 38.5f, true, "leon africano", "panthera leo", 8, 190f, true, "caluroso y con vegetacion baja", "carnivoro");
        Ave avestruz = new Ave(false, "negro y blanco", 30, "supervision en verano", "avestruz", "struthio camelus", 6, 120f, false, "caluroso y con vegetacion baja", "herbivoro");
        Reptil cocodrilo = new Reptil(false, "escamas rugosas", "sangre fria", "oviparo", "cocodrilo del nilo", "crocodylus niloticus", 12, 450f, true, "caluroso y con vegetacion baja", "carnivoro");
        Mamifero osoPardo = new Mamifero(true, 37.8f, true, "oso pardo", "ursus arctos", 10, 300f, true, "clima templado y vegetacion densa", "omnivoro");
        Ave buhoReal = new Ave(true, "marron y blanco", 15, "cuidados nocturnos", "buho real", "bubo bubo", 8, 3.2f, false, "clima templado y vegetacion densa", "carnivoro");
        Reptil lagartoComun = new Reptil(false, "escamas finas", "sangre fria", "oviparo", "lagarto comun", "lacerta agilis", 2, 0.2f, false, "clima templado y vegetacion densa", "carnivoro");

        //Se agregan los animales a la ZONA
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

    //Verifica y agregar una visita mas al visitante
    public Visitante iniciarSesion(int id, Zoologico zoologico) {
        Visitante visitanteTemporal = null;
        for (int i = 0; i < zoologico.getVisitantes().size(); i++) {
            if (id == zoologico.getVisitantes().get(i).getIdentificacion()) {
                visitanteTemporal = zoologico.getVisitantes().get(i);
            }
        }
        return visitanteTemporal;
    }

    //Lógica para la opcion 3 (MODO ADMINISTRADOR)
    public void iniciarSesionAdmin(Zoologico zoologico) {

        //Atributos utilizados en el metodo
        boolean iniciarSesionAdminChecker = true;
        String contraseñaInput;

        do {
            try {
                System.out.print("Ingrese la contrasenia del administrador: ");

                //Verificar si la contraseña que se pone, es la correcta
                contraseñaInput = scanner.nextLine();
                if (contraseñaInput.equals(zoologico.getContraseña())) {

                    //Aqui se llama un objeto para hacer uso del metodo PantallaAdmin
                    VistaZoologico vistaZoologico = new VistaZoologico();

                    //Llama al metodo para entrar a la pantalla del admin
                    vistaZoologico.PantallaAdministrador(zoologico);
                    iniciarSesionAdminChecker = false;
                } else {

                    //Pregunta si desea volver a intentarlo
                    iniciarSesionAdminChecker = rectificador();
                }
            } catch (Exception e) {

                //Falta agregar las exceciones
                System.out.println("Algo imprevisto sucedio");
                iniciarSesionAdminChecker = true;
            }
        } while (iniciarSesionAdminChecker);
    }

    //Encargado de ver donde está ubicado el visitante
    public String rastrearVisitante(Zoologico zoologico, int posicion) {

        //Atributos utilizadas en el metodo
        int indiceVisitante = posicion - 1;
        int indiceGlobal = 0;

        //Recorre el indice de la zona dentro del zoologico 
        for (int i = 0; i < zoologico.getZonas().size(); i++) {

            //Recorre los visitantes en cada zona
            for (int j = 0; j < zoologico.getZonas().get(i).getVisitantesPorZona().size(); j++) {

                //Si el indiceGlobal es el mismo, entonces retorna la zona
                if (indiceGlobal == indiceVisitante) {
                    return "\nEl visitante " + zoologico.getZonas().get(i).getVisitantesPorZona().get(j).getNombre()
                            + " se encuentra en la zona: " + zoologico.getZonas().get(i).getNombre();
                }
                indiceGlobal++; // Incrementa el índice global al avanzar entre visitantes
            }
        }

        // Mensaje si no se encuentra al visitante
        return "El visitante no se encuentra actualmente en el zoologico.";
    }

    //Encargado de seleccionar la zona que el visitante desee
    public Zona seleccionZonaVisitante(Zoologico zoologico) {
        boolean checkerSeleccionZonaVisitante = true;

// PENDIENTE DE IMPLEMENTAR para el cambio de zona
        do {
            try {
                int seleccion = scanner.nextInt();
                scanner.nextLine();

                //En este caso, se utiliza un if y usamos el && para parametrizar 
                //las zonas. No se usa un switch case debido a que la lista de 
                //zonas es dinamica, es decir, se puede modificar, por lo que
                //se crearan casos no instanciados en la logica del codigo
                if (seleccion > 0 && seleccion <= zoologico.getZonas().size()) {
                    Zona zonaSeleccionada = zoologico.getZonas().get(seleccion - 1);
                    System.out.print("\nEstas en la zona " + zonaSeleccionada.getNombre());
                    return zonaSeleccionada;
                } else {
                    System.out.println("Selección no válida. Intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Selecciona una opcion disponible");
                scanner.nextLine();
            }
        } while (checkerSeleccionZonaVisitante);
        return null;
    }

    //Este rectificador, es una solucion temporal a la falta de excepciones
    public boolean rectificador() throws Exception {
        System.out.print("""
                                   1. Volver a intentar
                                   2. Salir
                                   Seleccione que desea hacer: """);
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        //Trabaja en funcion de los checkers de cada menu
        if (seleccion == 1) {
            return true;
        } else if (seleccion == 2) {
            System.out.print("\n");
            return false;
        }
        throw new Exception();
    }
}
