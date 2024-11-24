package Controlador;

import Modelo.*;
import static Vista.VistaZoologico.scanner;

public class ZonaControlador {

    //Selecciona el animal con el que que quiere interactuar el visitante
    public Animal seleccionAnimal(Zona zona) throws Exception {

        //Seleccion del visitante
        System.out.print("\nSelecciona el numero del animal con el que quieres interactuar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        //Revisa si el visitante selecciona un numero que este dentro de los limites
        if (seleccion > 0 && seleccion <= zona.getAnimales().size()) {

            //Revisa si selecciona un mamifero
            if (zona.getAnimales().get(seleccion - 1) instanceof Mamifero) {

                //Guarda el animal
                Mamifero animalSeleccionado = (Mamifero) zona.getAnimales().get(seleccion - 1);

                //Muestra el animal seleccionado
                System.out.println("\nSeleccionaste el mamifero: " + animalSeleccionado.getNombre());

                //Lo retorna 
                return animalSeleccionado;

                //Revisa si selecciona un ave
            } else if (zona.getAnimales().get(seleccion - 1) instanceof Ave) {

                //Guarda el animal
                Ave animalSeleccionado = (Ave) zona.getAnimales().get(seleccion - 1);

                //Muestra el animal seleccionado
                System.out.println("\nSeleccionaste el ave: " + animalSeleccionado.getNombre());

                //Lo retorna
                return animalSeleccionado;

                //Revisa si selecciona un reptil
            } else if (zona.getAnimales().get(seleccion - 1) instanceof Reptil) {

                //Guarda el animal
                Reptil animalSeleccionado = (Reptil) zona.getAnimales().get(seleccion - 1);

                //Muestra el animal seleccionado
                System.out.println("\nSeleccionaste el reptil: " + animalSeleccionado.getNombre());

                //Lo retorna
                return animalSeleccionado;
            }
        }
        throw new Exception();//personalizada
    }

}
