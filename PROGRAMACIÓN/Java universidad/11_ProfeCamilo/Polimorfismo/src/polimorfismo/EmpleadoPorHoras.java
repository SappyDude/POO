package polimorfismo;

/**
 * @author dhysty
 */
public class EmpleadoPorHoras implements Empleado {

    private String nombre;
    private int horastrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horastrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horastrabajadas = horastrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horastrabajadas * tarifaPorHora;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Tipo: Por horas");
        System.out.println("Horas trabajadas: " + horastrabajadas);
        System.out.println("Tarifa por hora: " + tarifaPorHora);
    }

}
