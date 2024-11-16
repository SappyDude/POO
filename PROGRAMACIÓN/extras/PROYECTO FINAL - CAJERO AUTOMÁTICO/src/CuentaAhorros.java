public class CuentaAhorros extends Cuenta {

    //Variables
    private double interes;

    //Constructor con parámetros y heredado de Cueta
    public CuentaAhorros(String numCuenta, Usuario usuario, double interes) {
        super(numCuenta, 0, usuario);
        this.interes = interes;
    }

    //getters y setters
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //Método para retirar desde la cuenta de ahorros
    @Override
    public void retirar(float monto) throws Exception {
        
        if (saldo >= monto) {
            saldo -= monto;
            agregarTransaccion(new Transaccion("Retiro ", monto));
            System.out.println("Retiro realizado.");

        } else {
            throw new Exception("Fondos insuficientes.");
        }
    }

    //Método para depositar desde la cuenta de ahorros
    @Override
    public void depositar(float monto) {
        
        saldo += monto;
        agregarTransaccion(new Transaccion("Depósito ", monto));
    }

    //Método para calcular y aplicar los intereses
    public void calcularIntereses() {
        double intereses = saldo*interes;
        saldo += intereses;
        agregarTransaccion(new Transaccion("Intereses aplicados", intereses));
        System.out.println("Interés de $" + intereses + " aplicados al saldo.");
    }
}
