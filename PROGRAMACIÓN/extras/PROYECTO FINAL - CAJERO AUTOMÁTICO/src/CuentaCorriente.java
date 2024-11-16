public class CuentaCorriente extends Cuenta {

    //Variables
    private float sobregiro;

    //Constructor parametrizado desde la cuenta de ahorros
    public CuentaCorriente(String numCuenta, Usuario usuario, float sobregiro) {
        super(numCuenta, 0, usuario);
        this.sobregiro = sobregiro;
    }   

    //getters y setters
    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    //Método para retirar desde la cuenta corriente
    @Override
    public void retirar(float monto) throws Exception {

        if (saldo + sobregiro >= monto) {
            saldo -= monto;
            agregarTransaccion(new Transaccion("Retiro ", monto));
            System.out.println("Retiro realizado.");

        } else {
            throw new Exception("No tienes fondos suficientes incluso con sobregiro.");
        }
    }

    //Método para depositar desde la cuenta corriente
    @Override
    public void depositar(float monto) {
        
        saldo += monto;
        agregarTransaccion(new Transaccion("Depósito ", monto));
    }

}
