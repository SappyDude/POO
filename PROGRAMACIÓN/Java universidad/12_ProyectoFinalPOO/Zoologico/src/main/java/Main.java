
import Modelo.Zona;
import java.util.Scanner;
import Vista.VistaZoologico;

/*
 * @author SappyDude
    Una proxima implmementacion es poder hacer una clase que almacene una cantidad de interacciones que 
    los visitantes puedan hacer, pero que este vinculada con los animales de forma abstracta, es decir
    una clase abstracta de la cual los animales puedan tomarla y usarla a gusto, pero que tengan acceso
    a la lista de las distintas interacciones que existen de forma general

// En la dieta, va si son carnivoros, hervivoros, omnivoros
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VistaZoologico vistaZoologico = new VistaZoologico();
//Zonas del zoooo
        Zona zonaSelva = new Zona("Selva", "Tropical y húmedo", 5);
        Zona zonaArtico = new Zona("Ártico", "Clima frío", 3);
        Zona zonaDesierto = new Zona("Desierto", "Árido y seco", 4);

        vistaZoologico.primeraPantallaPrograma();

    }
}
