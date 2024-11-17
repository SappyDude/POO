package Modelo;

//Clase hija de ANIMAL
public class Mamifero extends Animal {

    //Atributos de la clase
    private boolean tienePelaje;
    private float temperaturaCorporal;
    private boolean esNocturno;

    //Constructor vacío de la clase
    public Mamifero() {
    }
    
    //Constructor parametrizado de la clase
    public Mamifero(boolean tienePelaje, float temperaturaCorporal, boolean esNocturno, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre, nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.tienePelaje = tienePelaje;
        this.temperaturaCorporal = temperaturaCorporal;
        this.esNocturno = esNocturno;
    }

    //Gets and Sets
    public boolean tienePelaje() {
        return tienePelaje;
    }

    public void setTienePelaje(boolean tienePelaje) {
        this.tienePelaje = tienePelaje;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public boolean isEsNocturno() {
        return esNocturno;
    }

    public void setEsNocturno(boolean esNocturno) {
        this.esNocturno = esNocturno;
    }

    //Métodos polimórficos
    @Override
    public void comer() {
        System.out.println("");
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
