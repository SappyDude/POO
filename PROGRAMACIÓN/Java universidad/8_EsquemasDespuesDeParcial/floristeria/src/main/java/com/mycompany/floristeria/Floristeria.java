package com.mycompany.floristeria;

import java.util.Scanner;

public class Floristeria {

    public static void main(String[] args) {
//Clases llamadas
        Scanner teclado = new Scanner(System.in);
        Cliente c1 = new Cliente();

//Atributos
        boolean checker = false;
        int selection = 0;
        Flor f1 = new Flor();
//Interfaz usuario:

//Datos del usuario
//Id
        do {
            try {
                checker = false;
                System.out.println("Ingrese su numero de identificacion");
                c1.setIdCliente(teclado.nextInt());
            } catch (Exception e) {
                System.out.println("Introduzca el valor pedido");
                teclado.next();
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

//direccion:
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

//correo:
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

//Pedir las flores
        do {
//trycatch: toma cierto tipo de dato, 
            try {
                checker = false;
                System.out.println("que pedido desea realizar?");
                System.out.println("(1)Ramo");
                System.out.println("(2)Centro de mesa");
                System.out.println("(3)Flores individuales");

                selection = teclado.nextInt();
                System.out.println("Has ingresado la opcion: " + selection);
//segun el tipo de error que lance la consola, se le asigna el inputmismatchexception
//el "e" es el nombre de lo que recibe, en este caso seria los scanners.
//el inputmismatchexception es tipo de exception arrojado por la consola 
            } catch (Exception e) {
                System.out.println("Porfavor ingrese un valor de los permitidos");
                teclado.next();
                checker = true;
            }
        } while (checker);

    }
    // por otra parte, la condicion logica checker, la toma directa como un boolean
    //, por lo que, si es verdad, lo sigue ejecutando, si es falso, sale del ciclo

}

//los arreglos son listas
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
