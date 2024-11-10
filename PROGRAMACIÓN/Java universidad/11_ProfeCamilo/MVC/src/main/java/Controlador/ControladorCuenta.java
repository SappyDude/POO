package Controlador;

import Vista.VistaCuenta;
import Modelo.CuentaBancaria;

public class ControladorCuenta {

    private CuentaBancaria cuenta;
    private VistaCuenta vista;

    public ControladorCuenta(CuentaBancaria cuenta, VistaCuenta vista) {
        this.cuenta = cuenta;
        this.vista = vista;
    }

    public void mostrarSaldo() {
        vista.mostrarSaldo(cuenta.getSaldo());
    }
    
    public void depositar(){
        double monto = vista.obtenerMonto();
        cuenta.depositar(monto);
        vista.mostrarMensaje("Deposito realizado con exito");
    }
    
    public void retirar(){
        double monto = vista.obtenerMonto();
        cuenta.retirar(monto);
        vista.mostrarMensaje("Retiro realizado");
    }
    
    public void aplicarInteres(){
        
    }
}
