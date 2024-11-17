package Modelo;

public class Reptil extends Animal {
   
    //Atributos de la clase
    private boolean esVenenoso;
    private String tipoDeEscamas;
    private String tipoSangre;
    private String formaApareamiento;

    //Constructor vacío de la clase
    public Reptil() {
    }

    //Constructor parametrizado
    public Reptil(boolean esVenenoso, String tipoDeEscamas, String tipoSangre, String formaApareamiento, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre, nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.esVenenoso = esVenenoso;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoSangre = tipoSangre;
        this.formaApareamiento = formaApareamiento;
    }
    
    //Gets and Sets
    public boolean esVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public String getTipoDeEscamas() {
        return tipoDeEscamas;
    }

    public void setTipoDeEscamas(String tipoDeEscamas) {
        this.tipoDeEscamas = tipoDeEscamas;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getFormaApareamiento() {
        return formaApareamiento;
    }

    public void setFormaApareamiento(String formaApareamiento) {
        this.formaApareamiento = formaApareamiento;
    }
        
    //Métodos polimórficos
    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acariciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void abrazar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void darDecomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
