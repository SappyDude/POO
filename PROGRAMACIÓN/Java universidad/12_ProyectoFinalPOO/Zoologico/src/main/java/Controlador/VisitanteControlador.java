package Controlador;

import Modelo.Zoologico;
import java.util.Scanner;

/**
 * @author SappyDude
 */
public class VisitanteControlador {

    public Scanner scanner = new Scanner(System.in);

    //Pide el id del visitante
    public int agregarIdVisitante(Zoologico zoologico) {
        boolean checkerAgregarIdVisitante = true;
        do {
            try {
                int id;
                System.out.print("Ingresa tu identificacion: ");
                id = zoologico.recorrerIds(scanner.nextInt());
                scanner.nextLine();
                return id;
            } catch (Exception e) {
                scanner.nextLine();
            }
        } while (checkerAgregarIdVisitante);
        return 0;
    }

    //Pide el nombre del visitante
    public String agregarNombreVisitante(Zoologico zoologico) {
        boolean checkerAgregarNombreVisitante = true;
        do {
            try {
                String Nombre;
                System.out.print("Ingresa tu nombre: ");
                Nombre = scanner.nextLine();
                return Nombre;
            } catch (Exception e) {
            }
        } while (checkerAgregarNombreVisitante);
        return "";
    }

    //Pide la edad del visitante
    public int agregarEdadVisitante(Zoologico zoologico) {
        boolean checkerAgregarEdadVisitante = true;
        do {
            try {
                int edad;
                System.out.print("Ingresa tu edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();
                return edad;
            } catch (Exception e) {
                scanner.nextLine();
            }
        } while (checkerAgregarEdadVisitante);
        return 0;
    }

}
