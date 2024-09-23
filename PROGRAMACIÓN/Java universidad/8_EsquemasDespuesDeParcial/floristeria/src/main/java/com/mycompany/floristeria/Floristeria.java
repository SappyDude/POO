package com.mycompany.floristeria;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Floristeria {

    public static void main(String[] args) {
//Objetos llamados
        Scanner teclado = new Scanner(System.in);
        Cliente c1 = new Cliente();
        Flor f1 = new Flor(2000, "rosa");
        Flor f2 = new Flor(2100, "amapola");
        Flor f3 = new Flor(1900, "tulipan");
        Flor f4 = new Flor(3000, "girasol");
        Flor f5 = new Flor(3500, "lirio");
        Flor f6 = new Flor(4000, "flor de loto");
        Arreglo r1 = new Arreglo("Maceta moldeada a mano", "Arreglo artesanal");
        Arreglo r2 = new Arreglo("Maceta prefrabricada", "Arreglo prefabricado");

//Adición de las flores a los arreglos
        r1.addFlores(f1);
        r1.addFlores(f2);
        r1.addFlores(f3);
        r2.addFlores(f4);
        r2.addFlores(f5);
        r2.addFlores(f6);

//Adición de arreglos a conjunto de ellos
        ArrayList<Arreglo> arreglos = new ArrayList<Arreglo>();
        arreglos.add(r1);
        arreglos.add(r2);

//Atributos
        boolean checker = false;
        boolean checkerbuy = true;
        int selection = 0;
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);

//Datos del usuario
//Id
        System.out.println("Bienvenido a la floristeria 'El palacio de las flores'");
        System.out.println("Porfavor, introduzca sus datos de usuario");
        System.out.println("                                         ");
        do {
            try {
                checker = false;
                System.out.println("Numero de identificacion");

                c1.setIdCliente(teclado.nextInt());
            } catch (Exception e) {
                System.out.println("Introduzca el valor pedido");
                System.out.println("");
                teclado.nextLine();
                checker = true;
            }
        } while (checker);
//Nombre del usuario
        do {
            try {
                checker = false;
                System.out.println("Ingrese su nombre");
                String nombre = teclado.next();

                if (nombre.matches(".*\\d.*")) {
                    throw new IllegalArgumentException("Ingresar un nombre real");
                }

                c1.setNombreUsuario(nombre);

            } catch (IllegalArgumentException e) {
                System.out.println("Error:" + e.getMessage());
                checker = true;
            }
        } while (checker);
//direccion
        do {
            try {
                checker = false;
                System.out.println("Ingrese su direccion");
                c1.setDireccion(teclado.next());
            } catch (Exception e) {
                System.out.println("Introduzca el valor pedido");
                teclado.next();
                checker = true;
            }
        } while (checker);
//correo
        do {
            try {
                checker = false;
                System.out.println("Ingrese su correo");
                c1.setCorreo(teclado.next());
            } catch (Exception e) {
                System.out.println("Introduzca el valor pedido");
                teclado.next();
                checker = true;
            }
        } while (checker);

//Compras
        System.out.println("Bienvenido, " + c1.getNombreUsuario());
        do {
//eleccion del arreglo 
            mostrarArreglos(arreglos);
            do {
                try {
                    checker = false;
                    System.out.println("elija el numero del arreglo deseado");

                    selection = teclado.nextInt();
                    if (selection > 0 && selection <= arreglos.size()) {
                        System.out.println("Has ingresado el arreglo: " + arreglos.get(selection - 1).getNombreArreglo());
                    } else {
                        checker = true;
                        System.out.println("El valor introducido no corresponde a ningun arreglo");
                    }

                } catch (Exception e) {
                    System.out.println("Porfavor ingrese un valor de los permitidos");
                    teclado.next();
                    checker = true;
                }
            } while (checker);
//volver a comprar            

            System.out.println("Desea comprar algun otro producto?");

            do {
                try {
                    System.out.println("Seleccionar");
                    System.out.println("SI(S)/NO(N)");
                    checkerbuy = true;
                    char rebuy = teclado.next().charAt(0);
                    switch (rebuy) {
                        case 's':
                            checkerbuy = false;
                            checker = true;
                            break;
                        case 'n':
                            checkerbuy = false;
                            checker = false;
                            break;
                    }
                } catch (Exception e) {
                    checkerbuy = true;
                    teclado.next();
                    System.out.println("Decida si va a seguir comprando");
                }
            } while (checkerbuy);

        } while (checker);
//Proceso para hacer la factura  

    }

    public static void mostrarArreglos(ArrayList<Arreglo> arreglos) {

        for (int i = 0; i < arreglos.size(); i++) {
            System.out.println("Arreglos disponibles: " + arreglos.get(i).getNombreArreglo());
            System.out.println("Arreglo Nro:    " + (i + 1));
            System.out.println("Flores: ");
            arreglos.get(i).mostrarFlores();
            System.out.println("Precio:         ");
            arreglos.get(i).calcularPrecio();
            System.out.println("Tipo de maceta: " + arreglos.get(i).getMaceta());
            System.out.println("    ");
        }
    }
}

//Pendiente:
//implementacion del historial
//volver a pedir el producto 

/*
de estos se mantiene un historial de lo que han hecho
historial(lista?)
 */
//segun el tipo de error que lance la consola, se le asigna como parametro
//el "e" es el nombre de lo que recibe, en este caso seria los scanners.
//el inputmismatchexception es tipo de exception arrojado por la consola 
