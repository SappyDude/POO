package Vista;

import java.util.Scanner;

public class VistaCuenta {

    private Scanner teclado = new Scanner(System.in);

    public void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: " + saldo);
    }

    public double obtenerMonto() {
        System.out.println("Ingrese el monto: ");
        return teclado.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
