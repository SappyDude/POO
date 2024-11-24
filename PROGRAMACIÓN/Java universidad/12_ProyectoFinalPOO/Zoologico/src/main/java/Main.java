//Importaciones de otras clases

import Controlador.ZoologicoControlador;
import Modelo.Zoologico;
import Vista.VistaZoologico;

/*
 * @author SappyDude
 */
public class Main {

    public static Zoologico zoologico = new Zoologico();

    public static void main(String[] args) {
        //Objeto encargado de guardar datos necesarios

        //Objeto encargado de administrar funcionalidades del Zoologico
        ZoologicoControlador zoologicoControlador = new ZoologicoControlador();

        //Objeto encargado de mostrar la interfaz del usuario
        VistaZoologico vistaZoologico = new VistaZoologico();

        //Creación de las zonas
        zoologicoControlador.inicializarZonas(zoologico);

        //Creación de los animales
        zoologicoControlador.inicializarAnimales(zoologico);

        //Creación de los visitantes ya registrados
        zoologicoControlador.inicializarVisitantes(zoologico);

        //Interfaz desplegada para el usuario
        vistaZoologico.PantallaPrograma(zoologico);
    }
}
