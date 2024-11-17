package Modelo;

//Clase hija de ANIMAl
public class Ave extends Animal {
    
    //Atributos de la clase
    private boolean puedeVolar;
    private String colorPlumaje;
    private int longevidad;
    private String cuidadoEspecial;

    //Constructor vacío de la clase
    public Ave() {
    }

    //Constructor parametrizado de la clase
    public Ave(boolean puedeVolar, String colorPlumaje, int longevidad, String cuidadoEspecial, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre ,nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.puedeVolar = puedeVolar;
        this.colorPlumaje = colorPlumaje;
        this.longevidad = longevidad;
        this.cuidadoEspecial = cuidadoEspecial;
    }

    //Gets and Sets
    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public String getCuidadoEspecial() {
        return cuidadoEspecial;
    }

    public void setCuidadoEspecial(String cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }

    //Métodos polimórficos
    @Override
    public void mostrarDetalles(){
        System.out.println("hijo");
        
    }
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
