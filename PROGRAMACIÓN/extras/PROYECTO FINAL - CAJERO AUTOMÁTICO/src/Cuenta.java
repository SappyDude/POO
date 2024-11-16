import java.util.ArrayList;
import java.time.LocalDateTime;

public abstract class Cuenta {
    
    //Variables
    protected String numCuenta;
    protected float saldo;
    protected LocalDateTime fechaApertura;
    protected Usuario usuario;
    protected ArrayList<Transaccion> historialTransacciones;

    //Constructores sin y con parámetros
    public Cuenta() {
        numCuenta = "";
        saldo = 0;
        fechaApertura = null;
        usuario = null;
        historialTransacciones = new ArrayList<>();
    }

    public Cuenta(String numCuenta, float saldo, Usuario usuario) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaApertura = null;
        this.usuario = usuario;
        this.historialTransacciones = new ArrayList<>();
    }

    public abstract void retirar(float monto) throws Exception;

    public void depositar(float monto) {

        if (monto <= 0) {
            System.out.println("No se puso depositar el monto. El monto debe ser mayor a 0.");

        } else {
            saldo += monto;
            agregarTransaccion(new Transaccion("Depósito ", monto));
            System.out.println("Depósito realizado.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void agregarTransaccion(Transaccion transaccion) {
        historialTransacciones.add(transaccion);
    }

    public void mostrarHistorial() {
        System.out.println("\n====== Historial de transacciones ======");

        for (Transaccion transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }
}
