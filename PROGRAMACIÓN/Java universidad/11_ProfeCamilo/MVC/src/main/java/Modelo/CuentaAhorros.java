package Modelo;

/**
 * @author dhysty
 */
public class CuentaAhorros extends CuentaBancaria {

    private double interes = 0.02;

    public CuentaAhorros(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes en cuenta de ahorros");
        }
    }

    public void aplicarInteres() {
        saldo += saldo * interes;
    }
}
