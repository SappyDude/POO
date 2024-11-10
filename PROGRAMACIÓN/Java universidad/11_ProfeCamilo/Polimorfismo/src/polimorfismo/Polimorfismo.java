package polimorfismo;

/**
 *
 * @author dhysty
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 20000);
        Empleado empleado2 = new EmpleadoPorHoras("julio", 40, 5000);
        empleado1.mostrarDetalles();
        System.out.println("Salario del empleado 1: " + empleado1.calcularSalario());

        empleado2.mostrarDetalles();
        System.out.println("Salario del empleado 2: " + empleado2.calcularSalario());
    }

}
