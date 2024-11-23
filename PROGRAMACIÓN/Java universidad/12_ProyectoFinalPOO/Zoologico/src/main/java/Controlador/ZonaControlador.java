package Controlador;

import Modelo.*;
import static Vista.VistaZoologico.scanner;

public class ZonaControlador {

    public Animal seleccionAnimal(Zona zona) throws Exception {
        zona.mostrarAnimalesEnLaZona();
        System.out.println("\nSelecciona el numero del animal con el que quieres interactuar");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        //Revisa si el visitante selecciona un numero que este dentro de los limites
        if (seleccion > 0 && seleccion <= zona.getAnimales().size()) {

            //Revisa si selecciono un mamifero
            if (zona.getAnimales().get(seleccion - 1) instanceof Mamifero) {
                Mamifero animalSeleccionado = (Mamifero) zona.getAnimales().get(seleccion - 1);
                System.out.println("Seleccionaste el mamifero: " + animalSeleccionado.getNombre());
                return animalSeleccionado;

                //Revisa si selecciono un ave
            } else if (zona.getAnimales().get(seleccion - 1) instanceof Ave) {
                Ave animalSeleccionado = (Ave) zona.getAnimales().get(seleccion - 1);
                System.out.println("Seleccionaste el ave: " + animalSeleccionado.getNombre());
                return animalSeleccionado;

                //Revisa si selecciono un reptil
            } else if (zona.getAnimales().get(seleccion - 1) instanceof Reptil) {
                Reptil animalSeleccionado = (Reptil) zona.getAnimales().get(seleccion - 1);
                System.out.println("Seleccionaste el reptil: " + animalSeleccionado.getNombre());
                return animalSeleccionado;
            }
        }
        throw new Exception();//personalizada
    }
}