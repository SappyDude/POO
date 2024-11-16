package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author SappyDude
 */
public class Zoologico {

    private String nombre;
    private ArrayList<Zona> zonas;
    private ArrayList<Visitante> visitantesTotales;

    public void rastrearVisitante(String nombreVisitante) {

    }

    public void agregarZona() {

    }

    public void agregarVisitante(Visitante visitante) {
        visitantesTotales.add(visitante);
    }

    public void registrarVisitante() {
        boolean checker = true;
        Scanner scanner = new Scanner(System.in);
        Visitante visitante = new Visitante();
        do {
            try {
                System.out.println("identificacion");
                visitante.setIdentificacion(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine();// pendiente hacer la clase exception personalizada
            }

        } while (checker);

        do {
            try {
                System.out.println("Ingresa tu nombre: ");
                visitante.setNombre(scanner.nextLine());
                break;
            } catch (Exception e) {
                scanner.nextLine();
            }

        } while (checker);
        do {
            try {
                System.out.println("Ingresa tu edad: ");
                visitante.setEdad(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine();
            }

        } while (checker);
        System.out.println("Salio correctamente");
        agregarVisitante(visitante);
        System.out.println("agregado");
        System.out.println(visitantesTotales);
        System.out.println("no agregado");
    }

}
