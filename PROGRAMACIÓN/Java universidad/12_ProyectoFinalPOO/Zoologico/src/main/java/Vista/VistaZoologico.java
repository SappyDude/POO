package Vista;

import Modelo.Zoologico;
import java.util.Scanner;

/**
 *
 * @author SappyDude
 */
public class VistaZoologico {

    public void primeraPantallaPrograma() {
        boolean checkerPrincipal = true;
        Scanner input = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        int seleccion;
        
        while (checkerPrincipal) {
            try {
                System.out.println("Bienvenido al zoologico 'Zuniverse'!"
                        + "\nPor favor, eliga una de las opciones de registro"
                        + "\n1. Registrarse por primera vez"
                        + "\n2. Iniciar sesion"
                        + "\n3. Modo administrador"
                        + "\n4. Salir");
                seleccion = input.nextInt();

                switch (seleccion) {
                    case 1:
                        System.out.println("Registro como nuevo visitante");
                        zoologico.registrarVisitante();
                        checkerPrincipal = false;
                        
                        break;

                    case 2:
                        System.out.println("Inicio de sesion");
                        checkerPrincipal = false;
                        break;

                    case 3:
                        System.out.println("modo admin");
                        checkerPrincipal = false;
                        break;

                    case 4:
                        System.out.println("Acabas de salir del zoologico");
                        checkerPrincipal = false;
                        break;

                    default:
                        throw new AssertionError();
                }

            } catch (Exception e) {
                System.out.println("Ingresaste algo erroneo");
                checkerPrincipal = true;
            }
        }
    }


}
