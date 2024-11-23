package Controlador;

import Modelo.Animal;
import Modelo.Visitante;

/**
 * @author SappyDude
 */
public class VisitanteControlador {

    public void interaccionVisitante(Animal animalSeleccionado, Visitante visitante) {

        System.out.println("""
                           Seleccione que interaccion desea hacer con el animal
                           1. Dar de comer
                              //Que alimento deseas darle de comer
                              1.Carne
                              2.Frutas
                           2. Acariciar
                           3. Observar
                           4. Regresar
                           
                           
                           """);
        animalSeleccionado.acariciar();
        System.out.println();
    }
}
