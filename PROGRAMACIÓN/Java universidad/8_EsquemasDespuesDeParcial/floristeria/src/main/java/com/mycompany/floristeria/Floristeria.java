package com.mycompany.floristeria;

import java.util.ArrayList;
import java.util.Scanner;

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
        int selection = 0;

//Datos del usuario
//Id
        do {
            try {
                checker = false;
                System.out.println("Ingrese su numero de identificacion");

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
        System.out.println("Bienvenido " + c1.getNombreUsuario());
        do {
//eleccion del arreglo 
            mostrarArreglos(arreglos);
            do {
//trycatch: toma cierto tipo de dato, 
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

//segun el tipo de error que lance la consola, se le asigna como parametro
//el "e" es el nombre de lo que recibe, en este caso seria los scanners.
//el inputmismatchexception es tipo de exception arrojado por la consola 
                } catch (Exception e) {
                    System.out.println("Porfavor ingrese un valor de los permitidos");
                    teclado.next();
                    checker = true;
                }
            } while (checker);
//volver a comprar            
            System.out.println("Desea comprar algun otro producto?");

            boolean checkerbuy = true;
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
                            System.out.println("entra");
                            break;
                        case 'n':
                            checkerbuy = false;
                            checker = false;

                            System.out.println("sale");
                            break;
                        default:
                            System.out.println("Ponga un valor real");
                            throw new Exception();
                    }
                } catch (Exception e) {
                    checkerbuy = true;
                    teclado.next();
                    System.out.println("Decida si va a seguir comprando");
                }
            } while (checkerbuy);

        } while (checker);
//Pedir las flores

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

// por otra parte, la condicion logica checker, la toma directa como un boolean
//, por lo que, si es verdad, lo sigue ejecutando, si es falso, sale del ciclo
//Pendiente:
//implementacion del historial
//volver a pedir el producto 

/*utilidad: gestionar los pedidios de arreglos florales que tienen los clientes
En un pedido debe ir:
Id numero
nombre
direccion
correo electronico

de estos se mantiene un historial de lo que han hecho

funcionalidad:
cada cliente puede realizar varios pedidos, pero un pedido pertenece a un UNICO cliente

Cada pedido contiene:
Arreglos florales 
Nro del pedido
fecha
costo total

cuando se crea un arreglo florar, tendra ciertas flores segun el tipo de arreglo(ramo o centro de mesa) 
y su tamaño

Se debe saber de las flores: 
nombre
cantidad requerida
precio unitario

se necesita un software que:
interfaz usuario

se le piden los datos al usuario (se puede almacenar en una lista)

datos individuales del usuario
id nro
nombre
direccion
gmail
historial(lista?)

 */
