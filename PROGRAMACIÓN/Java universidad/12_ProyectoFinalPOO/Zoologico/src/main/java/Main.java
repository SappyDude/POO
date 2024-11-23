//Importaciones de otras clases

import Controlador.ZoologicoControlador;
import Modelo.Zoologico;
import Vista.VistaZoologico;

/*
 * @author SappyDude
    Una proxima implementacion es poder hacer una clase que almacene una cantidad de interacciones que 
    los visitantes puedan hacer, pero que este vinculada con los animales de forma abstracta, es decir
    una clase abstracta de la cual los animales puedan tomarla y usarla a gusto, pero que tengan acceso
    a la lista de las distintas interacciones que existen de forma general
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