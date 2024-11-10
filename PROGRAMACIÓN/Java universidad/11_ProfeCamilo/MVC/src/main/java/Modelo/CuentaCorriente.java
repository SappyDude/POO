package Modelo;

/**
 * @author dhysty
 */
public class CuentaCorriente extends CuentaBancaria {

    private double sobregiro = 100.0;

    public CuentaCorriente(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {
        if (saldo + sobregiro >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficinetes en cuenta conrriente");
        }
    }

}
