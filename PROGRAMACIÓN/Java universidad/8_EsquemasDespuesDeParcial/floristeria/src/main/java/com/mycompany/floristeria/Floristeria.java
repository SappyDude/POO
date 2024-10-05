/*
Nombre: Dhylan Styven Collazos Caicedo
 */
package com.mycompany.floristeria;

import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {

    public static void main(String[] args) {
//Objetos llamados
        Scanner teclado = new Scanner(System.in);
        Flor f1 = new Flor(2000, "rosa", "rojo");
        Flor f2 = new Flor(2100, "amapola", "naranja");
        Flor f3 = new Flor(1900, "tulipan", "rosa");
        Flor f4 = new Flor(3000, "girasol", "amarillo");
        Flor f5 = new Flor(3500, "lirio", "morado");
        Flor f6 = new Flor(4000, "flor de loto", "blanco");

        Arreglo r1 = new Arreglo("Maceta moldeada a mano", "Arreglo artesanal");
        Arreglo r2 = new Arreglo("Maceta prefrabricada", "Arreglo prefabricado");

//Adición de las flores a los arreglos
        r1.addFlores(f1);
        r1.addFlores(f1);
        r1.addFlores(f2);
        r1.addFlores(f3);
//Arreglo 2
        r2.addFlores(f4);
        r2.addFlores(f5);
        r2.addFlores(f6);

//Adición de arreglos a conjunto de ellos
        ArrayList<Arreglo> arreglos = new ArrayList<Arreglo>();
        arreglos.add(r1);
        arreglos.add(r2);
        
//Lista de los clientes que han ingresado a la tienda
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//Atributos
        boolean checker = false;
        boolean checkerbuy = true;
        int selection = 0;
        int counter = 0;
        boolean clienteNuevo = false;
//Datos del usuario
//Id

        do {
            System.out.println("Bienvenido a la floristeria 'El palacio de las flores'");
            System.out.println("Porfavor, introduzca sus datos de usuario");
            System.out.println("                                         ");
            Cliente c1 = new Cliente();
            do {
                try {
                    checker = false;
                    System.out.println("Numero de identificacion");
                    c1.setIdCliente(teclado.nextInt());
                    teclado.nextLine();
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
                    String nombre = teclado.nextLine();
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
                    c1.setDireccion(teclado.nextLine());
                } catch (Exception e) {
                    System.out.println("Introduzca el valor pedido");
                    checker = true;
                }
            } while (checker);

//correo
            do {
                try {
                    checker = false;
                    System.out.println("Ingrese su correo");
                    c1.setCorreo(teclado.nextLine());
                } catch (Exception e) {
                    System.out.println("Introduzca el valor pedido");
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

//Aqui se genera el pedido
                            Pedido pedidoGen = new Pedido();
                            String fecha = pedidoGen.fechaActual();
                            pedidoGen.setFecha(fecha);
                            pedidoGen.modifyIdPedido();
                            pedidoGen.setNroPedido(counter += 1);
                            c1.agregarPedidos(pedidoGen);
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
                                teclado.nextLine();
                                break;
                            case 'n':
                                checkerbuy = false;
                                checker = false;
                                System.out.println("Sus pedidos fueron: ");
                                c1.mostrarPedidos(arreglos);
                                break;
                        }
                    } catch (Exception e) {
                        checkerbuy = true;
                        System.out.println("Decida si va a seguir comprando");
                    }
                } while (checkerbuy);
            } while (checker);
        } while (clienteNuevo);
    }

    public static void mostrarArreglos(ArrayList<Arreglo> arreglos) {
        for (int i = 0; i < arreglos.size(); i++) {
            System.out.println("Arreglos disponibles: " + arreglos.get(i).getNombreArreglo());
            System.out.println("Arreglo Nro:    " + (i + 1));
            System.out.println("Flores: ");
            arreglos.get(i).mostrarFlores();
            System.out.println("Precio:         " + arreglos.get(i).calcularPrecio());

            System.out.println("Tipo de maceta: " + arreglos.get(i).getMaceta());
            System.out.println("    ");
        }
    }
}
//pregunta 1: el costo total se puede calcular con el metodo calcularPrecio de la clase Arreglo
//pregunta 2: el historial de compras del cliente se obtiene con el método mostrarPedidos en la clase Cliente
//pregunta 3: pendiente (agregar una flor al arreglo floral sabiendo que ya existen flores)
//pregunta 4: pendiente (clientes que han realizado mas de un pedido)
//pregunta 5: pendiente (mostrar lista de los clientes por orden de precio)

//para organizar:
//dejar de recibir parametros en el metodo de mostrar pedido y mas bien, adicionarlo en su variable
//adicion de lista de clientes para compararlos y ver quien ha comprado mas
//organizar el codigo para que en vez de generar un recibo por pedido, se agreguen todos los pedidos en el recibo final
