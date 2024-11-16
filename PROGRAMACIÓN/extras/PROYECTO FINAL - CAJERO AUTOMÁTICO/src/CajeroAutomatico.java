import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CajeroAutomatico {
    
    private static Scanner scn = new Scanner(System.in);
    private static Random random = new Random();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        boolean salir = false;

        System.out.println("====== BIENVENIDO AL CAJERO AUTOMÁTICO ======");
        System.out.println("\nResgistrate o inicia sesión para continuar.");

        while (!salir) {
            System.out.println("\n1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                
                case 2:
                    Usuario usuario = iniciarSesion();
                    if (usuario != null) {
                        mostrarMenu(usuario);
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("\nGracias por usar nuestro cajero automático.\n            ¡Vuelve pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

    }

    //Método para registrar un nuevo usuario
    public static void registrarUsuario() {

        System.out.print("\nIngrese su nombre: ");
        String nombre = scn.next();
        System.out.print("Ingrese su dirección: ");
        String direccion = scn.next();
        System.out.print("Ingrese su número de teléfono: ");
        String telefono = scn.next();

        //Bucle while para repetir únicamnete la contraseña para que no se salga de este apartado hasta que sea válida
        String contraseña;
        while (true) {

            System.out.print("Crea una contraseña: ");
            contraseña = scn.next();

            //Ciclo for para verificar que la contraseña sea única o no exista
            boolean contraseñaUnica = true;
            for (Usuario usuario : usuarios) {
                if (usuario.getContraseña().equals(contraseña)) {
                    System.out.println("La contraseña ya está en uso. Intente con una diferente.");
                    contraseñaUnica = false;
                    break;
                    
                }
            }

            if (contraseñaUnica) {
                break; //sale del bucle si la contraseña es única 
            }
        }

        //Genera un números aleatorio de 8 digitos utilizado para el número de cuenta
        String numCuenta = String.format("%08d", random.nextInt(100000000));

        //El usuario selecciona el tipo de cuenta que desee
        System.out.println("\nPor favor, seleccione el tipo de cuenta que desea: ");
        System.out.println("1. Cuenta de Ahorros");
        System.out.println("2. Cuenta Corriente");
        int tipoCuenta = scn.nextInt();

        Cuenta cuenta = null;
        if (tipoCuenta == 1) {
            cuenta = new CuentaAhorros(numCuenta, null, 0.03);

        } else {
            if (tipoCuenta == 2) {
                cuenta = new CuentaCorriente(numCuenta, null, 50000);

            } else {
                System.out.println("Tipo de cuenta inválido. Por favor, seleccione un tipo de cuenta.");
                return;
            }
        }

        //Se crea un nuevo usuario y se asocia con la cuenta correspondiente
        Usuario nuevoUsuario = new Usuario(nombre, direccion, telefono, contraseña, cuenta);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado con éxito. Su número de cuenta es: " + numCuenta + ".");
    }

    //Método para iniciar sesión
    public static Usuario iniciarSesion() {

        System.out.print("\nIngrese su contraseña: ");
        String contraseña = scn.next();

        for (Usuario usuario : usuarios) {
            if (usuario.getContraseña().equals(contraseña)) {
                System.out.println("Inicio de sesión exitoso. Bienvenido " + usuario.getNombre() + "!");
                return usuario;
            }
        }

        System.out.println("Contraseña incorrecta o usuario no registrado. Inténtalo de nuevo.");
        return null;
    }

    //Método para mostrar el menú de opciones después de iniciar sesión
    public static void mostrarMenu(Usuario usuario) {
        boolean salir = false;
        Cuenta cuenta = usuario.getCuenta();

        System.out.println("\n¿Qué deseas realizar?");

        while (!salir) {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Realizar un depósito");
            System.out.println("3. Realizar un retiro");
            System.out.println("4. Mostrar historial de transacciones");
            System.out.println("5. Cerrar sesión");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
                    break;
                
                case 2:
                    System.out.print("Igrese el monto a depositar: ");
                    float montoDeposito = scn.nextFloat();
                    cuenta.depositar(montoDeposito);
                    System.out.println("Depósito realizado.");
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    float montoRetiro = scn.nextFloat();
                    
                    try {
                        cuenta.retirar(montoRetiro);
                        System.out.println("Retiro realizado.");

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 4:
                    cuenta.mostrarHistorial();
                    break;
                
                case 5:
                    salir = true;
                    break;
            
                default:
                    System.out.println("Opción inválida. Por favor, Elige una opción válida.");
            }
        }
    }
    
}
