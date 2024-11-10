package Modelo;

/*
@author dhysty
 */
public abstract class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract void retirar(double monto);
}
