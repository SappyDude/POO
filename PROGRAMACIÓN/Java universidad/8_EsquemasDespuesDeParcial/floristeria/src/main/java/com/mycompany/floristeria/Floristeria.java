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

        Arreglo r1 = new Arreglo("Arreglo artesanal");
        Arreglo r2 = new Arreglo("Arreglo prefabricado");

//Adición de las flores a los arreglos 
        r1.agregarFlor(f1);
        r1.agregarFlor(f2);
        r1.agregarFlor(f3);

//Arreglo 2
        r2.agregarFlor(f4);
        r2.agregarFlor(f5);
        r2.agregarFlor(f6);

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
        boolean clienteNuevo = false;
        boolean verificadorTemporal = true;

        do {
//Interfaz para el usuario
            System.out.println("Bienvenido a la floristeria 'El palacio de las flores'");
            System.out.println("Porfavor, introduzca sus datos de usuario\n");

//Creamos el cliente    
            Cliente c1 = new Cliente();

//Ingreso de los datos del cliente
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

//Direccion
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

//Correo
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

//Menú de compras para el usuario
            System.out.println("Bienvenido, " + c1.getNombreUsuario());
            do {
                mostrarArreglos(arreglos);
                do {
                    try {
                        checker = false;
                        System.out.println("Elija el número del arreglo deseado");
                        selection = teclado.nextInt();
                        if (selection > 0 && selection <= arreglos.size() + 1) {
                            System.out.println("Has ingresado el arreglo: " + arreglos.get(selection - 1).getNombreArreglo());

//Aquí se genera el pedido
                            Pedido pedidoGen = new Pedido(arreglos.get(selection - 1));
                            c1.agregarPedido(pedidoGen); //Todo lo anterior, lo añadimos al cliente

//Mostrar el precio total
                            int precioTotal = arreglos.get(selection - 1).calcularPrecio();
                            System.out.println("El precio total del arreglo es: " + precioTotal);

//Se le pregunta si desea añadir una flor al arreglo
                            System.out.println("¿Desea agregar una nueva flor al arreglo? (SI(S)/NO(N))");
                            char agregarFlor = teclado.next().charAt(0);
                            if (agregarFlor == 's' || agregarFlor == 'S') {
                                System.out.println("Ingrese el tipo de flor:");
                                String tipoFlor = teclado.next();
                                System.out.println("Ingrese el color de la flor:");
                                String colorFlor = teclado.next();
                                System.out.println("Ingrese el costo de la flor:");
                                int costoFlor = teclado.nextInt();

//Este costo se puede dejar definiendo, pero para mostrar la funcionalidad del programa, lo dejamos como ingreso de dato en la consola 😊
                                Flor nuevaFlor = new Flor(costoFlor, tipoFlor, colorFlor);
                                arreglos.get(selection - 1).agregarFlor(nuevaFlor);
                            }
                        } else {
                            checker = true;
                            System.out.println("El valor introducido no corresponde a ningún arreglo");
                        }

                    } catch (Exception e) {
                        System.out.println("Porfavor ingrese un valor de los permitidos");
                        teclado.next();
                        checker = true;
                    }
                } while (checker);

//Aquí se verifica si va comprar algo más 
                System.out.println("¿Desea comprar algún otro producto?");
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
                                c1.mostrarPedidos();
                                break;
                        }
                    } catch (Exception e) {
                        checkerbuy = true;
                        System.out.println("Decida si va a seguir comprando");
                    }
                } while (checkerbuy);
            } while (checker);
            clientes.add(c1);
            if (c1.getPedidos().size() > 1) {
                System.out.println("Este cliente ha realizado más de un pedido.");
            }
//aqui, revisamos si viene un cliente nuevo
            System.out.println("Hay un nuevo cliente?");
            do {
                try {
                    System.out.println("Seleccionar");
                    System.out.println("SI(S)/NO(N)");

                    char clienteNew = teclado.next().charAt(0);
                    switch (clienteNew) {
                        case 's':
                            clienteNuevo = true;
                            verificadorTemporal = false;
                            break;
//Las variables clienteNuevo y verificadorTemporal, son usadas para salir de los bucles
                        case 'n':
                            clienteNuevo = false;
                            verificadorTemporal = false;
                            break;
                        default:
                            throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("elija entre si o no");
                }
            } while (verificadorTemporal);

//Revisar cuántos pedidos ha realizado el cliente
        } while (clienteNuevo);

// Mostrar la lista de clientes por el precio total de sus pedidos
        mostrarClientesPorPrecio(clientes);
    }

//Metodo usado para mostrar los arreglos disponibles    
    public static void mostrarArreglos(ArrayList<Arreglo> arreglos) {
        for (int i = 0; i < arreglos.size(); i++) {
            System.out.println("Arreglos disponibles: " + arreglos.get(i).getNombreArreglo());
            System.out.println("Arreglo Nro:    " + (i + 1));
            System.out.println("Flores: ");
            arreglos.get(i).mostrarFlores();
            System.out.println("Precio:         " + arreglos.get(i).calcularPrecio());
            System.out.println("                ");
        }
    }

//Metodo para organizar los clientes por precio, en uno recorremos a cada uno de los clientes
//El otro for, hace la comparacion entre los clientes
    public static void mostrarClientesPorPrecio(ArrayList<Cliente> clientes) {
        for (int i = 0; i < clientes.size() - 1; i++) {
            for (int j = 0; j < clientes.size() - 1 - i; j++) {
                //este if se encarga de intercambiar las posiciones de los clientes para luego imprimirlos de menor a mayor
                if (clientes.get(j).calcularTotalGastado() > clientes.get(j + 1).calcularTotalGastado()) {
                    Cliente temp = clientes.get(j);
                    clientes.set(j, clientes.get(j + 1));
                    clientes.set(j + 1, temp);
                }
            }
        }

        // Mostrar la lista de clientes ordenada por el total gastado
        System.out.println("Lista de clientes ordenada por el total gastado:");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombreUsuario() + ", Total gastado: " + cliente.calcularTotalGastado());
        }
    }

}
//pregunta 1: el costo total se puede calcular con el metodo calcularPrecio de la clase Arreglo
//pregunta 2: el historial de compras del cliente se obtiene con el método mostrarPedidos en la clase Cliente
//pregunta 3: en el menu de compra, usamos el metodo agregarFlor en la clase Arreglo para añadir una flor
//pregunta 4: en el bucle principal, usamos la condicion de if (c1.getPedidos().size() > 1) para mostrar un mensaje
//pregunta 5: en el metodo mostrarClientePorPrecio, los organizamos de menor a mayor a el valor que tiene cada cliente
