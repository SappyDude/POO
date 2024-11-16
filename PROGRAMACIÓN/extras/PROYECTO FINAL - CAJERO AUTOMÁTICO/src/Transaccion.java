import java.time.LocalDateTime; //Nos permite obtener la fecha y hora actual
import java.time.format.DateTimeFormatter; //Nos permite formatear la fecha y hora

public class Transaccion {

    //Variables
    private String tipo;
    private float monto;
    private LocalDateTime fecha;
    
    //Constructores sin y con parámetros
    public Transaccion () {
        tipo = "";
        monto = 0;
        fecha = null;
    }   
    
    public Transaccion(String tipo, float monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now(); //Nos permite obtener la fecha y hora actual de los depósitos o retiros
    }
    
    //To string para mostrar la información de la transacción
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fecha.format(formatter);
        return "\nTipo: " + tipo + "\nMonto: " + monto + "\nFecha: " + fechaFormateada;
    }
}
