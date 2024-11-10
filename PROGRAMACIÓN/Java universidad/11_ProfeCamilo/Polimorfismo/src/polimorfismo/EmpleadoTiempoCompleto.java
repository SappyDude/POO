package polimorfismo;

/**
 * @author dhysty
 */
public class EmpleadoTiempoCompleto implements Empleado {

    private String nombre;
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Tipo: empleado tiempo completo");
        System.out.println("Salario mensual: " + salarioMensual);
    }

}
